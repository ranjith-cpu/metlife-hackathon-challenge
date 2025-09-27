package com.metlife.arogyasutra.controller;

import com.metlife.arogyasutra.model.Customer;
import com.metlife.arogyasutra.service.ArogyaSutraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ArogyaSutraController {

    @Autowired
    private ArogyaSutraService arogyaSutraService;

    @PostMapping("/customer/details")
    public ResponseEntity<String> CustomerDetailsPersitance(@RequestBody Customer customer) {

        String response = arogyaSutraService.customerDetailPersist(customer);

        return ResponseEntity.ok(response);

    }
}
