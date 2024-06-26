package org.wa55death405.orderservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderLineItems {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer quantite;
    private Integer idMenu;
    private Integer idOrder;
}
