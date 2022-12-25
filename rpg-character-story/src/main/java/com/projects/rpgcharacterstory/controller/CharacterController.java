package com.projects.rpgcharacterstory.controller;

import com.projects.rpgcharacterstory.model.Characters;
import com.projects.rpgcharacterstory.repo.CharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class CharacterController {
@Autowired
    private CharacterRepo characterRepo;


@PostMapping("/character")
    Characters newCharacter(@RequestBody Characters newCharacter){
    return characterRepo.save(newCharacter);
}

@GetMapping("/listAll")
    List<Characters> getAllCharacters(){

    return characterRepo.findAll();
}

@GetMapping("/find/{id}")
Optional<Characters> findById(@PathVariable Long id){

    return characterRepo.findById(id);
}

}
