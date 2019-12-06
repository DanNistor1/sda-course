import { Book } from './../../shared/models/book.model';
import { environment } from 'src/environments/environment';

import { Observable, of } from 'rxjs';

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BooksService {

  // http://localhost:8080/api/books
  private readonly API_BOOKS = `${environment.serverApiUrl}/api/books`;

  // http client
  constructor(private http: HttpClient) { }

  create(book: Book) {
    return this.http.post<Book>(this.API_BOOKS, book);
  }

  getAll(): Observable<Book[]> {
    return this.http.get<Book[]>(this.API_BOOKS);
  }

  get(id: number): Observable<Book> {
    return this.http.get<Book>(`${this.API_BOOKS}/${id}`);
  }

  update(id: number, book: Book): Observable<Book> {
    return this.http.put<Book>(`${this.API_BOOKS}/${id}`, book);
  }

  delete(id: number): Observable<any> {
    return this.http.delete(`${this.API_BOOKS}/${id}`,  { responseType: 'text' });
  }
}
