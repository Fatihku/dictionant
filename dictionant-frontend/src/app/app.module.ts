import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WordListComponent } from './word-list/word-list.component';
import { WordFormComponent } from './word-form/word-form.component';

@NgModule({
  declarations: [
    AppComponent,
    WordListComponent,
    WordFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
