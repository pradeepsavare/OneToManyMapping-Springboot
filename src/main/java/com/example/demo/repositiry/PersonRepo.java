package com.example.demo.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
