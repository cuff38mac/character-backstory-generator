package com.projects.rpgcharacterstory.repo;

import com.projects.rpgcharacterstory.model.Characters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepo extends JpaRepository<Characters, Long> {
}
