package org.wa55death405.restaurantservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Menu {
    @Id
    @GeneratedValue
    private Integer id;
    private String Nom;
    private Integer Prix;
}
