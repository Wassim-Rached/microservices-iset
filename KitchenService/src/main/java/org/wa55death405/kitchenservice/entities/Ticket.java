package org.wa55death405.kitchenservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue
    private Integer id;
    private State state;
    private Integer restaurantId;
    private Timestamp preparingTime;
    private Timestamp pickedUpTime;

    public enum State {
        CREATED, ACCEPTED, READY_FOR_PICKUP
    }
}
