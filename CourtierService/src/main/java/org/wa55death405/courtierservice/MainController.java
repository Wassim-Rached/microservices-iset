package org.wa55death405.courtierservice;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wa55death405.courtierservice.repositories.LocationRepository;

@RestController
@EnableDiscoveryClient
@RequiredArgsConstructor
public class MainController {
    private final LocationRepository locationRepository;

    @GetMapping
    public String healthCheck() {
        return "Courtier Service is up and running";
    }

    @PostMapping("{id}/location")
    public ResponseEntity<?> updateLocation(@RequestBody UpdateLocationRequest request,@PathVariable Integer id) {
        var location = locationRepository.findById(id).orElseThrow();
        location.setLatitude(request.Latitude);
        location.setLongitude(request.Longitude);
        locationRepository.save(location);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public record UpdateLocationRequest(String Longitude, String Latitude) {}
}
