package com.projects.rpgcharacterstory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Characters {

    @Id
    @GeneratedValue
    private Long id;

    private String className;

    private String image;
}
