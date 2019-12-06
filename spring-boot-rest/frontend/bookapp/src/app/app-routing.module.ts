import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListBookComponent } from './features/books/list-book/list-book.component';
import { AddBookComponent } from './features/books/add-book/add-book.component';

const routes: Routes = [
  { path: '', redirectTo: 'list-book', pathMatch: 'full' },
  { path: 'list-book', component: ListBookComponent },
  { path: 'add-book', component: AddBookComponent }
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
