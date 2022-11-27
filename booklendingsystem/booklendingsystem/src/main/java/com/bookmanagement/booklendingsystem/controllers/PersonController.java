package com.bookmanagement.booklendingsystem.controllers;

import com.bookmanagement.booklendingsystem.Services.PersonService;
import com.bookmanagement.booklendingsystem.entities.Person;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("")
    public List<Person> getAllPersons(){
        return  personService.getAllPersons();
    }

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person newPerson){
        return personService.save(newPerson);
    }

    @GetMapping("/person/{personId}")
    public Person getOnePerson(@PathVariable Long personId){
        return personService.findByPersonId(personId);
    }

    @PutMapping("/editPerson/{personId}")
    public Person updatePerson(@PathVariable Long personId, @RequestBody Person newPerson){
        return personService.update(personId,newPerson);
    }

    @DeleteMapping("/deletePerson/{personId}")
    public void deletePerson(@PathVariable Long personId){
        personService.deleteById(personId);
    }

}
