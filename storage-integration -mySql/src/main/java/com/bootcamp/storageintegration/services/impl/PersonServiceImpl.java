package com.bootcamp.storageintegration.services.impl;

import com.bootcamp.storageintegration.adapter.PersonAdapter;
import com.bootcamp.storageintegration.dto.PersonDTO;
import com.bootcamp.storageintegration.models.Person;
import com.bootcamp.storageintegration.repositories.PersonRepository;
import com.bootcamp.storageintegration.services.IPersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements IPersonService {

    private final PersonAdapter personAdapter;
    private final PersonRepository personRepository;

    @Override
    public PersonDTO create(PersonDTO personDTO) {
        Person person = personAdapter.convertToEntity(personDTO);

        Person saved = personRepository.save(person);

        return personAdapter.convertToDTO(saved);
    }

    @Override
    public List<PersonDTO> findAll() {
        return personRepository.findAll()
                .stream()
                .map(person -> personAdapter.convertToDTO(person))
                .collect(toList());
    }

}
