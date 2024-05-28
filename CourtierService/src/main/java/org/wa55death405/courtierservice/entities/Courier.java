package org.wa55death405.courtierservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Courier {
    @Id
    @GeneratedValue
    private Integer id;
    private String Cin;
    private String Nom;
    private String Telephone;
    private Boolean Disponible;
}
