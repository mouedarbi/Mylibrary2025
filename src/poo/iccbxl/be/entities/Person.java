package poo.iccbxl.be.entities;

import java.util.Date;

public class Person {

    private String name;
    private int id;
    private Date registrationDate;
    private Book[] books;

    //constructeur vide
    public Person() {
        this.name = "unknown";
        this.id = 0;
        this.registrationDate = new Date();
        this.books = new Book[0];

    }

    //constructeur full parametré
    public Person(String name, int id, Date registrationDate, Book[] books) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    
}