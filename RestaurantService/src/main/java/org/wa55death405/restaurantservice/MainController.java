package org.wa55death405.restaurantservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping
    public String findAvailableRestaurants(){
        return "KFC, McDonalds, Burger King";
    }

    @GetMapping("/findRestaurantMenu")
    public String findRestaurantMenu(){
        return "KFC Menu: Chicken, Fries, Burger";
    }
}
