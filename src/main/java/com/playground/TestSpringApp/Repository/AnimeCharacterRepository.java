package com.playground.TestSpringApp.Repository;

import com.playground.TestSpringApp.Model.AnimeCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeCharacterRepository extends JpaRepository<AnimeCharacter, Integer> {

}
