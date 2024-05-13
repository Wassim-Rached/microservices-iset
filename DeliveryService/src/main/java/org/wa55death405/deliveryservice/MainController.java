package org.wa55death405.deliveryservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping
    public String home() {
        return "Welcome to the Delivery Service!";
    }

    // nothing to be implemented here :|
}
