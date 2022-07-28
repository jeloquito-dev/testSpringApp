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
        return null;
    }

    @Override
    public List<AnimeCharacter> getAllCharacters() {
        return this.animeCharacterRepository.findAll();
    }

    @Override
    public boolean saveCharacter(AnimeCharacter character) {
        this.animeCharacterRepository.save(character);
        return true;
    }

    @Override
    public boolean updateCharacter(AnimeCharacter character) {
        return false;
    }

    @Override
    public boolean deleteCharacterById(int id) {
        return false;
    }
}
