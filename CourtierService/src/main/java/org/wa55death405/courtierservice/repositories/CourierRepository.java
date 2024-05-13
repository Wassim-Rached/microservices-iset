package org.wa55death405.courtierservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wa55death405.courtierservice.entities.Courier;

public interface CourierRepository extends JpaRepository<Courier, Integer> {
}
