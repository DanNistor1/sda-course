import { BooksService } from './../../../core/services/books.service';
import { Book } from 'src/app/shared/models/book.model';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormGroup, FormControl, Validators, AbstractControl, ValidationErrors } from '@angular/forms';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-list-book',
  templateUrl: './list-book.component.html',
  styleUrls: ['./list-book.component.css']
})
export class ListBookComponent implements OnInit, OnDestroy {
  dtOptions: DataTables.Settings = {};
  books: Book[];
  book: Book;
  dtTrigger: Subject<any> = new Subject();
  deleteMessage = false;
  toupdate = false;
  isupdated = false;

  bookUpdateForm = new FormGroup({
    book_id: new FormControl(''),
    book_title: new FormControl(' '),
    book_author: new FormControl(' '),
    book_published: new FormControl(' ', [Validators.required, this.dateValidation])
  });

  constructor(private bookService: BooksService) { }

  ngOnInit() {
    this.dtOptions = {
      retrieve: true,
      pagingType: 'full_numbers',
      pageLength: 6,
      lengthMenu: [[6, 16, 20, -1], [6, 16, 20, 'All']]
    };
    this.fetchBooks();
  }

  ngOnDestroy(): void {
    // Do not forget to unsubscribe the event
    this.dtTrigger.unsubscribe();
  }

  fetchBooks(): void {
    this.bookService.getAll() // observable Book[]
      .subscribe((books: Book[]) => {
        this.books = books;
        this.dtTrigger.next();
      });
  }

  deleteBook(id: number): void {
    this.bookService.delete(id)
      .subscribe(
        data => {
          console.log(data);
          this.fetchBooks();
          this.deleteMessage = true;
        },
        error => console.log(error)
      );
  }

  getBook(id: number) {
    this.bookService.get(id)
      .subscribe(
        book => {
          this.bookId.setValue(book.id);
          this.bookTitle.setValue(book.title);
          this.bookAuthor.setValue(book.author);
          this.bookPublished.setValue(book.published);
          this.toupdate = true;
        },
        error => console.log(error));
  }

  updateBook(bookToUpdate): void {
    this.book = new Book();
    this.book.id = this.bookId.value;
    this.book.title = this.bookTitle.value;
    this.book.author = this.bookAuthor.value;
    this.book.published = this.bookPublished.value;
    this.update(this.book.id, this.book);
  }

  update(id: number, book: Book) {
    this.bookService.update(id, book)
      .subscribe(
        data => {
          console.log(data);
          this.fetchBooks();
          this.toupdate = false;
          this.isupdated = true;
        },
        error => console.log(error)
      );
  }

  get bookId() {
    return this.bookUpdateForm.get('book_id');
  }

  get bookTitle() {
    return this.bookUpdateForm.get('book_title');
  }

  get bookAuthor() {
    return this.bookUpdateForm.get('book_author');
  }

  get bookPublished() {
    return this.bookUpdateForm.get('book_published');
  }

  dateValidation(control: AbstractControl): ValidationErrors | null {
    const date1 = new Date();
    const date2 = new Date(control.value);
    if (control.value !== (null || NaN) && date1 < date2) {
      return { isError: true, message: 'Published date must be before current date' };
    }
    return null;
  }

}
