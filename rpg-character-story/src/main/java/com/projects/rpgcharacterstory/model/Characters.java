//
package com.projects.rpgcharacterstory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
/**
 * This entity class maps to the database table called Characters.
 */
public class Characters {

    @Id
    @GeneratedValue
    /**
     * Represents the ID column of the table
     */
    private Long id;

    /**
     * Represents the ClassName column of the table
     */
    private String className;

    /**
     * Represents the image column of the table for URL links
     */
    private String image;
}
