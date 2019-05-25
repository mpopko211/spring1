package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter @Getter
public class Author implements Serializable {

    private String name;
    private String lastName;

}
