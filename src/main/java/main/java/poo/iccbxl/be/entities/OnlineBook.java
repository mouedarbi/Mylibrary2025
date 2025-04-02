package main.java.poo.iccbxl.be.entities;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OnlineBook extends Book{
    private String content;
    private final static byte EBOOK_LIMIT = 5;
}