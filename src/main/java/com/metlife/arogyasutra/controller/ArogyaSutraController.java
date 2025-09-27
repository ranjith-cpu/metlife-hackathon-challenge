package com.metlife.arogyasutra.controller;

import com.metlife.arogyasutra.model.Customer;
import com.metlife.arogyasutra.model.CustomerRC;
import com.metlife.arogyasutra.model.EmployeeHealthRecord;
import com.metlife.arogyasutra.service.PreventivePlansService;
import com.metlife.arogyasutra.service.RiskCalculatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ArogyaSutraController {

    private final RiskCalculatorService riskCalculatorService;
    private PreventivePlansService preventivePlansService;

    public ArogyaSutraController(RiskCalculatorService riskCalculatorService, PreventivePlansService preventivePlansService) {
        this.riskCalculatorService = riskCalculatorService;
        this.preventivePlansService = preventivePlansService;
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
    
    @GetMapping("/customer/preventivePlans")
    public ResponseEntity<String> preventivePlans(@RequestParam String id)
    {
    	return new ResponseEntity<>(preventivePlansService.preventivePlanSuggestion(id),HttpStatus.OK);
    }


}
