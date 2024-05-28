package org.wa55death405.orderservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wa55death405.orderservice.entities.Order;
import org.wa55death405.orderservice.repositories.OrderRepository;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final OrderRepository orderRepository;

    @GetMapping
    public String healthcheck() {
        return "Order service is up and running";
    }

    @PostMapping("/create")
    public ResponseEntity<?> createOrder(@RequestBody CreateOrder createOrder) {
        Order order = new Order();
        order.setState(createOrder.state());
        order.setConsumerId(createOrder.consumerId());
        order.setRestaurantId(createOrder.restaurantId());
        orderRepository.save(order);
        return new ResponseEntity<>(null, null, 201);
    }

    @PostMapping("/cancel/{orderId}")
    public ResponseEntity<?> cancelOrder(@PathVariable Integer orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        order.setState(Order.State.CANCELED);
        orderRepository.save(order);
        return new ResponseEntity<>(null, null, 204);
    }

    @PostMapping("/revise/{orderId}")
    public ResponseEntity<?> reviseOrder(@RequestBody Order.State state, @PathVariable Integer orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        order.setState(state);
        orderRepository.save(order);
        return new ResponseEntity<>(null, null, 204);
    }

    public record CreateOrder(Order.State state,Integer consumerId,Integer restaurantId) {}
}