package com.bootcamp.storageintegration.services;

import com.bootcamp.storageintegration.dto.PersonDTO;

import java.util.List;

public interface IPersonService {

    PersonDTO create(PersonDTO personDTO);

    List<PersonDTO> findAll();
}
