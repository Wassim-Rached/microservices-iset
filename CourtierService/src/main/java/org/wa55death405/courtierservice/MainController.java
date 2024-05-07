package org.wa55death405.courtierservice;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class MainController {

    @GetMapping
    public String updateLocation() {
        return "Location updated";
    }
}
