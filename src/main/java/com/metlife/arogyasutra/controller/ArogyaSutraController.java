package com.metlife.arogyasutra.controller;

import com.metlife.arogyasutra.model.Customer;
import com.metlife.arogyasutra.model.CustomerRC;
import com.metlife.arogyasutra.model.EmployeeHealthRecord;
import com.metlife.arogyasutra.service.RiskCalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ArogyaSutraController {

    private final RiskCalculatorService riskCalculatorService;

    public ArogyaSutraController(RiskCalculatorService riskCalculatorService) {
        this.riskCalculatorService = riskCalculatorService;
    }

    @PostMapping("/customer/details")
    public ResponseEntity<String> CustomerDetailsPersitance(@RequestBody Customer customer){

        return ResponseEntity.ok("Customer created successfully");

    }

    @GetMapping("/calculate")
    public ResponseEntity<CustomerRC> riskCalculator( @RequestBody EmployeeHealthRecord employeeHealthRecord){

        CustomerRC score=riskCalculatorService.fetchRiskScores(employeeHealthRecord);
        return ResponseEntity.ok(score);
    }

}
