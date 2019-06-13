package com.fatihku.dictionary.dictionant.service;

import com.fatihku.dictionary.dictionant.entity.Word;
import com.fatihku.dictionary.dictionant.repository.WordRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WordService {

    @Autowired
    WordRepository wordRepository;

    public List<Word> getWords(){
        return (List<Word>) wordRepository.findAll();
    }

    public void addWord(Word word){
        wordRepository.save(word);
    }

}
