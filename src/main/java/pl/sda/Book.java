package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter @Setter
public class Book implements Serializable {


    private String title;
    private Author author;

}


