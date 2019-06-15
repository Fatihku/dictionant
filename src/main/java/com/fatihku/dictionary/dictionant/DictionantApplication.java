package com.fatihku.dictionary.dictionant;

import com.fatihku.dictionary.dictionant.entity.Word;
import com.fatihku.dictionary.dictionant.repository.WordRepository;
import com.fatihku.dictionary.dictionant.service.WordService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DictionantApplication {

	public static void main(String[] args) {

		SpringApplication.run(DictionantApplication.class, args);
	}

	@Bean
	CommandLineRunner init(WordService wordService) {
		return args -> {
			Stream.of("Cat", "Dog", "Pig", "Bird", "Snake").forEach(s -> {
				Word word = Word.builder()
						.name(s)
						.description("An animal")
						.language("English")
						.build();
				wordService.addWord(word);
			});
			wordService.getWords().forEach(System.out::println);
		};
	}
}