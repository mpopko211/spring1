package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter
public class Adres implements Serializable {

    private String city;
    private String postalCode;
    private String street;
}
