
package com.projects.rpgcharacterstory.controller;

import com.projects.rpgcharacterstory.model.Characters;
import com.projects.rpgcharacterstory.repo.CharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/**
 * A REST Controller that allows for the retrieval and saving of characters from the SQL Database
 */
@RestController
@CrossOrigin
public class CharacterController {
@Autowired
    private CharacterRepo characterRepo;

    /**
     * POST mapping to create a character
     * @param newCharacter
     * @return
     */

@PostMapping("/character")
    Characters newCharacter(@RequestBody Characters newCharacter){
    return characterRepo.save(newCharacter);
}

    /**
     * GET call to get all the characters
      * @return
     */
@GetMapping("/listAll")
    List<Characters> getAllCharacters(){

    return characterRepo.findAll();
}


    /**
     * GET call that will retrieve the specified character by its id
      * @param id
     * @return
     */
@GetMapping("/find/{id}")
Optional<Characters> findById(@PathVariable Long id){

    return characterRepo.findById(id);
}

}
