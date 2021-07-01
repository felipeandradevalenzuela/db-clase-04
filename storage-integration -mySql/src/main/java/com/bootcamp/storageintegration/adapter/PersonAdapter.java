package com.bootcamp.storageintegration.adapter;

import com.bootcamp.storageintegration.dto.PersonDTO;
import com.bootcamp.storageintegration.models.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonAdapter {

    public Person convertToEntity(PersonDTO personDTO) {
        Person person = new Person();
        person.setFirstName(personDTO.getFirstName());
        person.setLastName(personDTO.getLastName());

        return person;
    }

    public PersonDTO convertToDTO(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setFirstName(person.getFirstName());
        personDTO.setLastName(person.getLastName());

        return personDTO;
    }


}
