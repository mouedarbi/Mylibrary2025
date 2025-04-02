package main.java.poo.iccbxl.be.entities;

import java.time.LocalDate;
import java.util.UUID;
import lombok.*;

@Getter

public class Person {

    private String name;
    private UUID id;
    private LocalDate registrationDate;
    private Book[] books;

    //constructeur vide
    public Person() {
        this.name = "unknown";
        this.id = UUID.randomUUID();
        this.registrationDate =  LocalDate.now();
        this.books = new Book[0];

    }

    //constructeur full parametré
    public Person(String name, UUID id, LocalDate registrationDate, Book[] books) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
        this.books = books; 

    }

    
    
}