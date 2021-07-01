package com.bootcamp.storageintegration.repositories;

import com.bootcamp.storageintegration.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
