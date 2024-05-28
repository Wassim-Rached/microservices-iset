package org.wa55death405.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("order-service", r -> r.path("/order/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://order-service"))
                .route("courtier-service", r -> r.path("/courtier/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://courtier-service"))
                .route("delivery-service", r -> r.path("/delivery/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://delivery-service"))
                .route("kitchen-service", r -> r.path("/kitchen/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://kitchen-service"))
                .route("restaurant-service", r -> r.path("/restaurant/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://restaurant-service"))
                .build();
    }
}
