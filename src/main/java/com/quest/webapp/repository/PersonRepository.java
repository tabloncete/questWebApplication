package com.quest.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quest.webapp.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String>{

}
