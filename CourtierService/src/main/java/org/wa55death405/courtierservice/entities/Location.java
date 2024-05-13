package org.wa55death405.courtierservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue
    private Integer id;
    private String Longitude;
    private String Latitude;
}
