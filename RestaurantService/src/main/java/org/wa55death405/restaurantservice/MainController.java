package org.wa55death405.restaurantservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wa55death405.restaurantservice.repositories.AdresseRepository;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final AdresseRepository adresseRepository;

    @GetMapping
    public String healthCheck(){
        return "Service Restaurant is working";
    }

    @PostMapping("/findAvailableRestaurantsByVille")
    public ResponseEntity<?> findAvailableRestaurants(@RequestBody String ville){
        var restaurants = adresseRepository.findByVille(ville);
        return ResponseEntity.ok(restaurants);
    }

    @GetMapping("/findRestaurantMenu/")
    public ResponseEntity<?> findRestaurantMenu(){
        // ??????????
        // Returner les menus par mot de clé ???????????? ?
        throw new UnsupportedOperationException("Not implemented yet ( tf is 'mot de clé' ? )");
    }
}
