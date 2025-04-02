package main.java.poo.iccbxl.be.entities;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Loan {
    private Person person;
    private ArrayList<Book> books;
    private LocalDate loanDate;

 
}