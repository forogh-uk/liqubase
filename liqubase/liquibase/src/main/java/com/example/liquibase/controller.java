package com.example.liquibase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class controller {

@Autowired
    private PersonRepository personRepo;

    @PostMapping("person")
    public String CreateUser(@RequestParam String name) {
        personRepo.save(new Person(name,"6.7","address"));
        return personRepo.findByName(name) + "Save successfully";
    }

    @GetMapping("person")
    public List<Person> getAllPeople(){
        return (List<Person>) personRepo.findAll();

    }

    }
