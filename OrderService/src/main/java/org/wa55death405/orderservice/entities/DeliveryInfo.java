package org.wa55death405.orderservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class DeliveryInfo {
    @Id
    @GeneratedValue
    private Integer id;
    private Timestamp deliveryTime;
}
