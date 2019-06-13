import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {WordListComponent} from "./word-list/word-list.component";
import {WordFormComponent} from "./word-form/word-form.component";

const routes: Routes = [
  {path: 'words', component: WordListComponent},
  {path: 'addWord', component: WordFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
