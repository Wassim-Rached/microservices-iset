package org.wa55death405.kitchenservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String createTicket() {
        return "Ticket created!";
    }

    @GetMapping("acceptTicket")
    public String acceptTicket(){
        return "Ticket accepted!";
    }

    @GetMapping("/readyForPickUp")
    public String readyForPickUp() {
        return "Ready for pickup!";
    }
}
