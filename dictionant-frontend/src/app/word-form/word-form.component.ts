import { Component, OnInit } from '@angular/core';
import {Word} from "../model/word";
import {ActivatedRoute, Router} from "@angular/router";
import {WordService} from "../service/word.service";

@Component({
  selector: 'app-word-form',
  templateUrl: './word-form.component.html',
  styleUrls: ['./word-form.component.scss']
})
export class WordFormComponent implements OnInit {

  word: Word;

  constructor(private route: ActivatedRoute, private router: Router, private wordService: WordService) {
    this.word = new Word();
  }

  onSubmit() {
    this.wordService.addWord(this.word).subscribe(result => this.goToWordList());
  }

  goToWordList() {
    this.router.navigate(['/words']);
  }

  ngOnInit(): void {
  }
}
