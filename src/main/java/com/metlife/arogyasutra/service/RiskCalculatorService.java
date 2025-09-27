package com.metlife.arogyasutra.service;

import com.metlife.arogyasutra.model.Customer;
import com.metlife.arogyasutra.model.CustomerRC;
import com.metlife.arogyasutra.model.EmployeeHealthRecord;

public interface RiskCalculatorService {

    public CustomerRC fetchRiskScores(EmployeeHealthRecord employeeHealthRecord);
}
