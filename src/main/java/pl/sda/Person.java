package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter
public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;
    private String position;
    private Adres adres;

    public Person(){
    }
    public Person(Adres adres) {
        this.adres = adres;
    }
}