package org.wa55death405.courtierservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wa55death405.courtierservice.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> { }
