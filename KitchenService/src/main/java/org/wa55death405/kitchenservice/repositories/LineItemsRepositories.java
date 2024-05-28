package org.wa55death405.kitchenservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wa55death405.kitchenservice.entities.LineItems;

public interface LineItemsRepositories extends JpaRepository<LineItems, Integer> {
}
