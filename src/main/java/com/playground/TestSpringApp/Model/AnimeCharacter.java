package com.playground.TestSpringApp.Model;

import javax.persistence.*;

@Entity
public class AnimeCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    @Column
    private String anime;

    public AnimeCharacter() {
    }

    public AnimeCharacter(String name, String anime) {
        this.name = name;
        this.anime = anime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }
}
