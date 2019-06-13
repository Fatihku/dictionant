import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/index";
import {Word} from "../model/word";

@Injectable()
export class WordServiceService {
  private wordsUrl: string;

  constructor( private http: HttpClient) {
    this.wordsUrl = "http://localhost:8080/words";
  }

  public getWords(): Observable<Word[]> {
    return this.http.get<Word[]>(this.wordsUrl);
  }

  public addWord(word: Word) {
    return this.http.post<Word>(this.wordsUrl, word);
  }
}
