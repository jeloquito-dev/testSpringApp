package com.playground.TestSpringApp;

import com.playground.TestSpringApp.Model.AnimeCharacter;
import com.playground.TestSpringApp.Service.AnimeCharacterService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringAppApplication implements CommandLineRunner{

	private final AnimeCharacterService characterService;

	public TestSpringAppApplication(AnimeCharacterService characterService) {
		this.characterService = characterService;
	}

	public static void main(String[] args) {
		SpringApplication.run(TestSpringAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AnimeCharacter character1 = new AnimeCharacter("Monkey D. Luffy", "One Piece");
		AnimeCharacter character2 = new AnimeCharacter("Roronoa Zoro", "One Piece");
		AnimeCharacter character3 = new AnimeCharacter("Uzumaki Naruto", "Naruto");

		characterService.saveCharacter(character1);
		characterService.saveCharacter(character2);
		characterService.saveCharacter(character3);
	}
}
