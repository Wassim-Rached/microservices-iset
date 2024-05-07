package org.wa55death405.kitchenservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class LineItems {
    @Id
    @GeneratedValue
    private Integer id;
}
