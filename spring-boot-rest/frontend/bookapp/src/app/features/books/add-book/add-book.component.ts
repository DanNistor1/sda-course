import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, AbstractControl, ValidationErrors, ValidatorFn } from '@angular/forms';

import { Book } from 'src/app/shared/models/book.model';
import { BooksService } from 'src/app/core/services/books.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  book: Book;
  submitted: boolean;

  bookSaveForm = new FormGroup({
    book_title: new FormControl(' ', Validators.required),
    book_author: new FormControl(' ', Validators.required),
    book_published: new FormControl(' ', [Validators.required, this.dateValidation])
  });

  constructor(private bookService: BooksService) { }

  ngOnInit() {
    this.bookSaveForm.reset(); // aceasta linie este necesar ca sa functioneze validarile pentru prima adaugare a unei carti ???
    this.submitted = false;
  }

  saveBook(bookToSave): void {
    this.book = new Book();
    this.book.title = this.bookTitle.value;
    this.book.author = this.bookAuthor.value;
    this.book.published = this.bookPublished.value;
    this.submitted = true;
    this.save();
  }

  save(): void {
    this.bookService.create(this.book)
      .subscribe(data => console.log(data), error => console.log(error));
  }

  get bookTitle() {
    return this.bookSaveForm.get('book_title');
  }

  get bookAuthor() {
    return this.bookSaveForm.get('book_author');
  }

  get bookPublished() {
    return this.bookSaveForm.get('book_published');
  }

  addBookForm() {
    this.submitted = false;
    this.bookSaveForm.reset();
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
