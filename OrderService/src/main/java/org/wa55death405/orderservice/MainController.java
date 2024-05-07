package org.wa55death405.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String createOrder() {
        return "Order created successfully";
    }

    @GetMapping("/cancel")
    public String cancelOrder() {
        return "Order cancelled successfully";
    }

    @GetMapping("/revise")
    public String reviseOrder() {
        return "Order revised successfully";
    }

}
