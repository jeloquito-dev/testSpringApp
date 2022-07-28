package com.playground.TestSpringApp.Service;

import com.playground.TestSpringApp.Model.AnimeCharacter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnimeCharacterService {

    AnimeCharacter getCharacterById(int id);
    List<AnimeCharacter> getAllCharacters();
    boolean saveCharacter(AnimeCharacter character);
    boolean updateCharacter(AnimeCharacter character);
    boolean deleteCharacterById(int id);

}
