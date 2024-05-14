package org.wa55death405.restaurantservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Adresse {
    @Id
    @GeneratedValue
    private Integer id;
    private String numero;
    private String nom;
    private String rue;
    private String cite;
    private String ville;
}
