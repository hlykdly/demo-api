package com.example.demo;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/persons")
public class PersonController {


    @GetMapping
    public List<Person> getAllPersons() {
        // For simplicity, returning a static list. In a real-world application, this would come from a database.
        return Arrays.asList(
                new Person(1L, "John", 30, "john@email.com"),
                new Person(2L, "Jane", 25, "jane@email.com"),
                new Person(2L, "Janis", 25, "janis@email.com"),
                new Person(1L,"pete",43, "asd@asd.com")
        );
    }

    @GetMapping("/pete")
    public Person pete(){
        return new Person(1L,"pete",43, "asd@asd.com");
    }
}