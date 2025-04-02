package main.java.poo.iccbxl.be.entities;

import java.time.LocalDate;
import java.util.UUID;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class MyLibrary {
    private String name;
    private final static int MAX_BOOKS_LIMIT = 3;
    private ArrayList<Book> books;
    private ArrayList<Person> person;

    public  ArrayList<Book> findBooksByTitle (String title) {

        return null;
    }
    public String printMembers() {
		StringBuilder sb = new StringBuilder();
		Iterator<Person> it = this.getPerson().iterator();
		
		while(it.hasNext()) {
			Person p = it.next();		
			sb.append(p.getName() + ", inscrit le " + p.getRegistrationDate() + "\n");
		}

		return sb.toString();
	}

}