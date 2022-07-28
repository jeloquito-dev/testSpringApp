package com.playground.TestSpringApp.Resource;

import com.playground.TestSpringApp.Model.AnimeCharacter;
import com.playground.TestSpringApp.Service.AnimeCharacterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class AnimeCharacterResource {

    private final AnimeCharacterService characterService;

    public AnimeCharacterResource(AnimeCharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/{id}")
    public AnimeCharacter getAnimeCharacterById(@PathVariable int id) {
        return characterService.getCharacterById(id);
    }

    @GetMapping
    public List<AnimeCharacter> getAllAnimeCharacter() {
        return characterService.getAllCharacters();
    }

    @PostMapping
    public boolean saveAnimeCharacter(@RequestBody AnimeCharacter animeCharacter) {
        return characterService.saveCharacter(animeCharacter);
    }

    @PostMapping("/delete/{id}")
    public boolean deleteAnimeCharacterById(@PathVariable("id") int id) {
        return characterService.deleteCharacterById(id);
    }

    @PostMapping("/update/{id}")
    public boolean updateAnimeCharacter(@RequestBody AnimeCharacter animeCharacter, @PathVariable("id") int id) {
        return characterService.updateCharacter(id, animeCharacter);
    }
}
