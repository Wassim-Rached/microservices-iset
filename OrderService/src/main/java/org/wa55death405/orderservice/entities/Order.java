package org.wa55death405.orderservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue
    private Integer id;

    private State state;
    public enum State {
        CREATED, ACCEPTED,CANCELED, READY
    }

    private Integer consumerId;
    private Integer restaurantId;
}
