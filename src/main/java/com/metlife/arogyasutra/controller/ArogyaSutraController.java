package com.metlife.arogyasutra.controller;

import com.metlife.arogyasutra.entity.HealthRecord;
import com.metlife.arogyasutra.model.Customer;
import com.metlife.arogyasutra.model.CustomerRC;
import com.metlife.arogyasutra.model.EmployeeHealthRecord;
import com.metlife.arogyasutra.model.UserDetails;
import com.metlife.arogyasutra.repository.ArogyaSutraHealthRecordRepository;
import com.metlife.arogyasutra.service.ArogyaSutraService;
import com.metlife.arogyasutra.service.PreventivePlansService;
import com.metlife.arogyasutra.service.RiskCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ArogyaSutraController {

    @Autowired
    private ArogyaSutraService  arogyaSutraService;

    @Autowired
    private ArogyaSutraHealthRecordRepository arogyaSutraHealthRecordRepository;

    private final RiskCalculatorService riskCalculatorService;
    private PreventivePlansService preventivePlansService;

    public ArogyaSutraController(RiskCalculatorService riskCalculatorService, PreventivePlansService preventivePlansService) {
        this.riskCalculatorService = riskCalculatorService;
        this.preventivePlansService = preventivePlansService;
    }

    @PostMapping("/customer/details")
    public ResponseEntity<String> CustomerDetailsPersitance(@RequestBody Customer customer) {
        arogyaSutraService.customerDetailPersist(customer);

        return ResponseEntity.ok("Customer created successfully");

    }

    @PostMapping("/user/signup")
    public ResponseEntity<String> CustomerDetailsPersitance(@RequestBody UserDetails userDetails) {
        System.out.println("request :"+userDetails);

        arogyaSutraService.userDetailSign(userDetails);

        return ResponseEntity.ok("UserDetails created successfully");

    }

    @GetMapping("/user/login")
    public String GetCustomerDetailsPersitance(@RequestBody UserDetails userDetails) {

       return arogyaSutraService.userDetailLogin(userDetails);

    }

    @GetMapping("/calculate")
    public ResponseEntity<CustomerRC> riskCalculator( @RequestBody EmployeeHealthRecord employeeHealthRecord) {

        HealthRecord healthRecord = prepareHealthRecordReq(employeeHealthRecord);
        arogyaSutraHealthRecordRepository.save(healthRecord);


        CustomerRC score=riskCalculatorService.fetchRiskScores(employeeHealthRecord);
        return ResponseEntity.ok(score);
    }
    public HealthRecord prepareHealthRecordReq(EmployeeHealthRecord empHR){
        HealthRecord healthRecord = new HealthRecord();
        healthRecord.setAgeHr(empHR.getAgeHr());
        healthRecord.setGenderHr(empHR.getGenderHr());
        healthRecord.setFamilyHistoryCvdHr(empHR.getFamilyHistoryCvdHr());
        healthRecord.setBmiLab(empHR.getBmiLab());
        healthRecord.setAvgRestingHrSw(empHR.getAvgRestingHrSw());
        healthRecord.setAvgDailyStepsSw(empHR.getAvgDailyStepsSw());
        healthRecord.setAvgSleepHoursSw(empHR.getAvgSleepHoursSw());
        healthRecord.setEmployeeId(empHR.getEmployeeId());
        healthRecord.setCvdWithin1yr(empHR.getCvdWithin1yr());
        healthRecord.setCholesterolMgDlLab(empHR.getCholesterolMgDlLab());
        healthRecord.setDiabetesWithin1yr(empHR.getDiabetesWithin1yr());
        healthRecord.setDiastolicBpLab(empHR.getDiastolicBpLab());
        healthRecord.setSmokingStatusHr(empHR.getSmokingStatusHr());
        healthRecord.setSystolicBpLab(empHR.getSystolicBpLab());
        healthRecord.setFamilyHistoryDiabetesHr(empHR.getFamilyHistoryDiabetesHr());
        healthRecord.setWeeklyActiveMinutesSw(empHR.getWeeklyActiveMinutesSw());
        healthRecord.setFastingGlucoseMgDlLab(empHR.getFastingGlucoseMgDlLab());
        healthRecord.setHba1cPercentLab(empHR.getHba1cPercentLab());
        healthRecord.setRiskScoreCvd1yr(empHR.getRiskScoreCvd1yr());
        healthRecord.setRiskScoreDiabetes1yr(empHR.getRiskScoreDiabetes1yr());
        healthRecord.setPastClaimsCountHr(empHR.getPastClaimsCountHr());
        healthRecord.setMedicationForBpHr(empHR.getMedicationForBpHr());
        healthRecord.setMedicationForDiabetesHr(empHR.getMedicationForDiabetesHr());

        return healthRecord;
    }

    @GetMapping("/customer/preventivePlans")
    public ResponseEntity<String> preventivePlans(@RequestParam String id)
    {
    	return new ResponseEntity<>(preventivePlansService.preventivePlanSuggestion(id),HttpStatus.OK);
    }


}
