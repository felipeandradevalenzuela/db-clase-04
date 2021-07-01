package com.bootcamp.storageintegration.controller;

import com.bootcamp.storageintegration.dto.PersonDTO;
import com.bootcamp.storageintegration.models.Person;
import com.bootcamp.storageintegration.services.IPersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/persons")
public class PersonController {

    private final IPersonService personService;

    @PostMapping
    public PersonDTO create(@RequestBody PersonDTO personDTO) {
        return personService.create(personDTO);
    }

    @GetMapping
    public List<PersonDTO> findAll() {
        return personService.findAll();
    }
}
