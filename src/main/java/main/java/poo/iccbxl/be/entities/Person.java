package main.java.poo.iccbxl.be.entities;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Person {
    
    private UUID id;
    private String name;
    private LocalDate registrationDate;
    private ArrayList<Book> books = new ArrayList<>();

    //fonvtion métiers :

    public ArrayList<Book> getLateBooks() {
        return null;


    }
    
   
}