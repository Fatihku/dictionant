package com.fatihku.dictionary.dictionant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Data
@AllArgsConstructor
public class Word {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    long id;
    String word;
    String description;
    String language;

    public Word() {

    }
}