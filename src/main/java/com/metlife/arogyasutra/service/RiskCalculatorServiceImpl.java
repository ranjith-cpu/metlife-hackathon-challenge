package com.metlife.arogyasutra.service;

import com.metlife.arogyasutra.exception.RiskCalculatorException;
import com.metlife.arogyasutra.model.Customer;
import com.metlife.arogyasutra.model.CustomerRC;
import com.metlife.arogyasutra.model.EmployeeHealthRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RiskCalculatorServiceImpl implements RiskCalculatorService{

    @Autowired
    @Qualifier("AIMLRestTemplate")
    private  RestTemplate aiMLRestTemplate;

    @Value("${ai.model.url}")
    private String url;


    @Override
    public CustomerRC fetchRiskScores(EmployeeHealthRecord employeeHealthRecord) {
        try {
            CustomerRC response = aiMLRestTemplate.postForObject(url, employeeHealthRecord, CustomerRC.class);
            if (response == null) {
                throw new RiskCalculatorException("AI model didn't return a valid response");
            }
            return response;
        } catch (Exception e) {
                throw new RiskCalculatorException("Failed to fetch risk scores from AI model");
        }
    }
}
