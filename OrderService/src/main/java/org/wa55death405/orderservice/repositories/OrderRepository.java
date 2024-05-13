package org.wa55death405.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wa55death405.orderservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
