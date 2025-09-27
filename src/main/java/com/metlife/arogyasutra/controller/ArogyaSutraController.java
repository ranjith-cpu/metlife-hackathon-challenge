package com.metlife.arogyasutra.controller;

import com.metlife.arogyasutra.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ArogyaSutraController {

    @PostMapping("/customer/details")
    public ResponseEntity<String> CustomerDetailsPersitance(@RequestBody Customer customer){

        return ResponseEntity.ok("Customer created successfully");

    }
}
