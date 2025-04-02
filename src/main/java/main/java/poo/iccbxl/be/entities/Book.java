package main.java.poo.iccbxl.be.entities;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.ArrayList;



@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    //propriétés
    private UUID id;
    private String title;
    private String author;
    private int totalPages;
    private byte loanPeriod;
    private double rentalPrice;
    private Language language;
    private short nbCopies;
    private boolean borrowable;
    private ArrayList<Person> borrowers = new ArrayList<>();


    public LocalDate computeReturnDate() {
        // TODO Auto-generated method stub

        return null;
    }
}