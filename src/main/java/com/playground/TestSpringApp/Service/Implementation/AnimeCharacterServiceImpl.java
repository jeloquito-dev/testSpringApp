package com.playground.TestSpringApp.Service.Implementation;

import com.playground.TestSpringApp.Model.AnimeCharacter;
import com.playground.TestSpringApp.Repository.AnimeCharacterRepository;
import com.playground.TestSpringApp.Service.AnimeCharacterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeCharacterServiceImpl implements AnimeCharacterService {

    public AnimeCharacterServiceImpl(AnimeCharacterRepository animeCharacterRepository) {
        this.animeCharacterRepository = animeCharacterRepository;
    }

    private AnimeCharacterRepository animeCharacterRepository;

    @Override
    public AnimeCharacter getCharacterById(int id) {
        return animeCharacterRepository.findById(id).get();
    }

    @Override
    public List<AnimeCharacter> getAllCharacters() {
        return this.animeCharacterRepository.findAll();
    }

    @Override
    public boolean saveCharacter(AnimeCharacter character) {
        animeCharacterRepository.save(character);
        return true;
    }

    @Override
    public boolean updateCharacter(int id, AnimeCharacter character) {
        AnimeCharacter updatedAnimeCharacter = animeCharacterRepository.findById(id).get();

        updatedAnimeCharacter.setName(character.getName());
        updatedAnimeCharacter.setAnime(character.getAnime());

        animeCharacterRepository.save(updatedAnimeCharacter);

        return true;
    }

    @Override
    public boolean deleteCharacterById(int id) {
        animeCharacterRepository.deleteById(id);
        return true;
    }
}
