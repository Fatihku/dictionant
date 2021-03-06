import { Component, OnInit } from '@angular/core';
import {Word} from "../model/word";
import {WordService} from "../service/word.service";

@Component({
  selector: 'app-word-list',
  templateUrl: './word-list.component.html',
  styleUrls: ['./word-list.component.scss']
})
export class WordListComponent implements OnInit {

  words: Word[];

  constructor(private wordService: WordService) { }

  ngOnInit() {
    this.wordService.getWords().subscribe(data => {
        this.words = data;
      });
  }

}
