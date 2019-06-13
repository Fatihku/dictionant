package com.fatihku.dictionary.dictionant.repository;

import com.fatihku.dictionary.dictionant.entity.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends CrudRepository<Word, Long>{
}
