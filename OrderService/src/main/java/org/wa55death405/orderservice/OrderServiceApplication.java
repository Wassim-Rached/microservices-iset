package org.wa55death405.orderservice;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.wa55death405.orderservice.entities.Order;
import org.wa55death405.orderservice.repositories.OrderRepository;

@SpringBootApplication
@EnableDiscoveryClient
@RequiredArgsConstructor
public class OrderServiceApplication implements Runnable{
	private final OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Override
	public void run() {
		Order order = new Order();
		order.setState(Order.State.ACCEPTED);
		order.setConsumerId(1);
		order.setRestaurantId(1);
		orderRepository.save(order);
	}
}