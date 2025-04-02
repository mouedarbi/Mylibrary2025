package main.java.poo.iccbxl.be.entities;

import java.util.UUID;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Person p2 = new Person(UUID.randomUUID(), "Lydia", LocalDate.now());

        
        
        System.out.println(p2);
    }
}
