package com.aquilla.peopleapi.repository;

import com.aquilla.peopleapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    boolean existsByCpf(String email);
    Optional<Person> findByCpf(String email);
}
