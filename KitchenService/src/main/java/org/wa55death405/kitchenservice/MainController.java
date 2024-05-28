package org.wa55death405.kitchenservice;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wa55death405.kitchenservice.entities.Ticket;
import org.wa55death405.kitchenservice.repositories.TicketRepository;

import java.sql.Timestamp;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final TicketRepository ticketRepository;
    private final Environment environment;

    @GetMapping
    public String healthCheck() {
        return "Port: " + environment.getProperty("local.server.port");
    }

    @PostMapping("createTicket")
    public ResponseEntity<?> createTicket(@RequestBody CreateTicketRequest request) {
        Ticket ticket = new Ticket();
        ticket.setState(request.state());
        ticket.setPreparingTime(request.preparingTime());
        ticket.setPickedUpTime(request.pickedUpTime());
        ticket.setRestaurantId(request.restaurantId());
        ticketRepository.save(ticket);
        return new ResponseEntity<>(ticket, HttpStatus.CREATED);
    }

    @PostMapping("{ticketId}/acceptTicket")
    public ResponseEntity<?> acceptTicket(@PathVariable Integer ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow();
        ticket.setState(Ticket.State.ACCEPTED);
        ticketRepository.save(ticket);
        return new ResponseEntity<>(ticket, HttpStatus.NO_CONTENT);
    }

    @PostMapping("{ticketId}/readyForPickUp")
    public ResponseEntity<?> readyForPickUp(@PathVariable Integer ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow();
        ticket.setState(Ticket.State.READY_FOR_PICKUP);
        ticketRepository.save(ticket);
        return new ResponseEntity<>(ticket, HttpStatus.NO_CONTENT);
    }

    public record CreateTicketRequest(
             Ticket.State state,
             Timestamp preparingTime,
             Timestamp pickedUpTime,
             Integer restaurantId
    ) {
    }
}
