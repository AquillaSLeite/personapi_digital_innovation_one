package com.aquilla.peopleapi.repository;

import com.aquilla.peopleapi.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
