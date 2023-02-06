package com.projects.rpgcharacterstory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * This application allows a user to select a character from a dropdown list, view
 * its predefined stats, and generate random backstories specific to the character selected.
 *
 */
public class RpgCharacterStoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgCharacterStoryApplication.class, args);
	}

}