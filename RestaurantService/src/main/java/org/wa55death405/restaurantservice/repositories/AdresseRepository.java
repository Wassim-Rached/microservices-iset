package org.wa55death405.restaurantservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wa55death405.restaurantservice.entities.Adresse;

import java.util.List;

public interface AdresseRepository extends JpaRepository<Adresse, Integer> {
    List<Adresse> findByVille(String ville);
}
