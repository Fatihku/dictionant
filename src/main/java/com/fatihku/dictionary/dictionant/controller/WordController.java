package com.fatihku.dictionary.dictionant.controller;

import com.fatihku.dictionary.dictionant.entity.Word;
import com.fatihku.dictionary.dictionant.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class WordController {

    @Autowired
    WordService wordService;

    @GetMapping("/users")
    public List<Word> getWords() {
        return wordService.getWords();
    }

    @PostMapping("/users")
    public void addWord(@RequestBody Word word) {
        wordService.addWord(word);
    }

}
