package org.wa55death405.restaurantservice.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Adresse {
    @Id
    @GeneratedValue
    private Integer id;
}
