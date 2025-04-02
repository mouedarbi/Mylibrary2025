package poo.iccbxl.be.entities;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    
}