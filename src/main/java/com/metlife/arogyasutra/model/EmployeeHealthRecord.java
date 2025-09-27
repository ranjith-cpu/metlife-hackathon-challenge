package com.metlife.arogyasutra.model;

import jakarta.persistence.*;   // Only needed if using JPA/Hibernate
import java.io.Serializable;

  // Change table name if needed
public class EmployeeHealthRecord  {


    private String employeeId;

    private Integer ageHr;                  // 20–64
    private String genderHr;                // 'M' or 'F'
    private Integer familyHistoryDiabetesHr; // 0 or 1
    private Integer familyHistoryCvdHr;      // 0 or 1
    private String smokingStatusHr;         // 'never', 'former', 'current'
    private Integer pastClaimsCountHr;      // 0–5
    private Integer medicationForBpHr;      // 0 or 1
    private Integer medicationForDiabetesHr;// 0 or 1
    private Float bmiLab;                   // e.g., 25.2
    private Integer systolicBpLab;          // mmHg
    private Integer diastolicBpLab;         // mmHg
    private Integer cholesterolMgDlLab;     // mg/dL
    private Integer fastingGlucoseMgDlLab;  // mg/dL
    private Float hba1cPercentLab;          // e.g., 5.33
    private Integer avgDailyStepsSw;        // steps
    private Integer weeklyActiveMinutesSw;  // minutes
    private Integer avgRestingHrSw;         // bpm
    private Float avgSleepHoursSw;          // hours
    private Integer diabetesWithin1yr;      // 0 or 1
    private Integer cvdWithin1yr;           // 0 or 1
    private Float riskScoreDiabetes1yr;     // 0.199 to 0.256
    private Float riskScoreCvd1yr;          // 0.096 to 0.256

    public EmployeeHealthRecord() {}


    public EmployeeHealthRecord(String employeeId, Integer ageHr, String genderHr,
                                Integer familyHistoryDiabetesHr, Integer familyHistoryCvdHr,
                                String smokingStatusHr, Integer pastClaimsCountHr,
                                Integer medicationForBpHr, Integer medicationForDiabetesHr,
                                Float bmiLab, Integer systolicBpLab, Integer diastolicBpLab,
                                Integer cholesterolMgDlLab, Integer fastingGlucoseMgDlLab,
                                Float hba1cPercentLab, Integer avgDailyStepsSw,
                                Integer weeklyActiveMinutesSw, Integer avgRestingHrSw,
                                Float avgSleepHoursSw, Integer diabetesWithin1yr,
                                Integer cvdWithin1yr, Float riskScoreDiabetes1yr,
                                Float riskScoreCvd1yr) {
        this.employeeId = employeeId;
        this.ageHr = ageHr;
        this.genderHr = genderHr;
        this.familyHistoryDiabetesHr = familyHistoryDiabetesHr;
        this.familyHistoryCvdHr = familyHistoryCvdHr;
        this.smokingStatusHr = smokingStatusHr;
        this.pastClaimsCountHr = pastClaimsCountHr;
        this.medicationForBpHr = medicationForBpHr;
        this.medicationForDiabetesHr = medicationForDiabetesHr;
        this.bmiLab = bmiLab;
        this.systolicBpLab = systolicBpLab;
        this.diastolicBpLab = diastolicBpLab;
        this.cholesterolMgDlLab = cholesterolMgDlLab;
        this.fastingGlucoseMgDlLab = fastingGlucoseMgDlLab;
        this.hba1cPercentLab = hba1cPercentLab;
        this.avgDailyStepsSw = avgDailyStepsSw;
        this.weeklyActiveMinutesSw = weeklyActiveMinutesSw;
        this.avgRestingHrSw = avgRestingHrSw;
        this.avgSleepHoursSw = avgSleepHoursSw;
        this.diabetesWithin1yr = diabetesWithin1yr;
        this.cvdWithin1yr = cvdWithin1yr;
        this.riskScoreDiabetes1yr = riskScoreDiabetes1yr;
        this.riskScoreCvd1yr = riskScoreCvd1yr;
    }


    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public Integer getAgeHr() { return ageHr; }
    public void setAgeHr(Integer ageHr) { this.ageHr = ageHr; }

    public String getGenderHr() { return genderHr; }
    public void setGenderHr(String genderHr) { this.genderHr = genderHr; }

    public Integer getFamilyHistoryDiabetesHr() { return familyHistoryDiabetesHr; }
    public void setFamilyHistoryDiabetesHr(Integer familyHistoryDiabetesHr) { this.familyHistoryDiabetesHr = familyHistoryDiabetesHr; }

    public Integer getFamilyHistoryCvdHr() { return familyHistoryCvdHr; }
    public void setFamilyHistoryCvdHr(Integer familyHistoryCvdHr) { this.familyHistoryCvdHr = familyHistoryCvdHr; }

    public String getSmokingStatusHr() { return smokingStatusHr; }
    public void setSmokingStatusHr(String smokingStatusHr) { this.smokingStatusHr = smokingStatusHr; }

    public Integer getPastClaimsCountHr() { return pastClaimsCountHr; }
    public void setPastClaimsCountHr(Integer pastClaimsCountHr) { this.pastClaimsCountHr = pastClaimsCountHr; }

    public Integer getMedicationForBpHr() { return medicationForBpHr; }
    public void setMedicationForBpHr(Integer medicationForBpHr) { this.medicationForBpHr = medicationForBpHr; }

    public Integer getMedicationForDiabetesHr() { return medicationForDiabetesHr; }
    public void setMedicationForDiabetesHr(Integer medicationForDiabetesHr) { this.medicationForDiabetesHr = medicationForDiabetesHr; }

    public Float getBmiLab() { return bmiLab; }
    public void setBmiLab(Float bmiLab) { this.bmiLab = bmiLab; }

    public Integer getSystolicBpLab() { return systolicBpLab; }
    public void setSystolicBpLab(Integer systolicBpLab) { this.systolicBpLab = systolicBpLab; }

    public Integer getDiastolicBpLab() { return diastolicBpLab; }
    public void setDiastolicBpLab(Integer diastolicBpLab) { this.diastolicBpLab = diastolicBpLab; }

    public Integer getCholesterolMgDlLab() { return cholesterolMgDlLab; }
    public void setCholesterolMgDlLab(Integer cholesterolMgDlLab) { this.cholesterolMgDlLab = cholesterolMgDlLab; }

    public Integer getFastingGlucoseMgDlLab() { return fastingGlucoseMgDlLab; }
    public void setFastingGlucoseMgDlLab(Integer fastingGlucoseMgDlLab) { this.fastingGlucoseMgDlLab = fastingGlucoseMgDlLab; }

    public Float getHba1cPercentLab() { return hba1cPercentLab; }
    public void setHba1cPercentLab(Float hba1cPercentLab) { this.hba1cPercentLab = hba1cPercentLab; }

    public Integer getAvgDailyStepsSw() { return avgDailyStepsSw; }
    public void setAvgDailyStepsSw(Integer avgDailyStepsSw) { this.avgDailyStepsSw = avgDailyStepsSw; }

    public Integer getWeeklyActiveMinutesSw() { return weeklyActiveMinutesSw; }
    public void setWeeklyActiveMinutesSw(Integer weeklyActiveMinutesSw) { this.weeklyActiveMinutesSw = weeklyActiveMinutesSw; }

    public Integer getAvgRestingHrSw() { return avgRestingHrSw; }
    public void setAvgRestingHrSw(Integer avgRestingHrSw) { this.avgRestingHrSw = avgRestingHrSw; }

    public Float getAvgSleepHoursSw() { return avgSleepHoursSw; }
    public void setAvgSleepHoursSw(Float avgSleepHoursSw) { this.avgSleepHoursSw = avgSleepHoursSw; }

    public Integer getDiabetesWithin1yr() { return diabetesWithin1yr; }
    public void setDiabetesWithin1yr(Integer diabetesWithin1yr) { this.diabetesWithin1yr = diabetesWithin1yr; }

    public Integer getCvdWithin1yr() { return cvdWithin1yr; }
    public void setCvdWithin1yr(Integer cvdWithin1yr) { this.cvdWithin1yr = cvdWithin1yr; }

    public Float getRiskScoreDiabetes1yr() { return riskScoreDiabetes1yr; }
    public void setRiskScoreDiabetes1yr(Float riskScoreDiabetes1yr) { this.riskScoreDiabetes1yr = riskScoreDiabetes1yr; }

    public Float getRiskScoreCvd1yr() { return riskScoreCvd1yr; }
    public void setRiskScoreCvd1yr(Float riskScoreCvd1yr) { this.riskScoreCvd1yr = riskScoreCvd1yr; }
}

