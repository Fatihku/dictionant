package com.fatihku.dictionary.dictionant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Data
@AllArgsConstructor
@Component
public class Word {
    @Id
    @GeneratedValue
    long id;
    String word;
    String description;
    Language language;
}