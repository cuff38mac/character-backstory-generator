package com.projects.rpgcharacterstory.repo;

import com.projects.rpgcharacterstory.model.Characters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
/**
 * This repository configures the use of CRUD operations
 */
public interface CharacterRepo extends JpaRepository<Characters, Long> {
}
