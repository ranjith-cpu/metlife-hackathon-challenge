package com.metlife.arogyasutra.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "health_record")
public class HealthRecord {

    @Id
    @Column(name = "employee_id")  // adjust length as needed
    private String employeeId;

    @Column(name = "age_hr")
    private Integer ageHr;

    @Column(name = "gender_hr")
    private String genderHr;

    @Column(name = "family_history_diabetes_hr")
    private Integer familyHistoryDiabetesHr;

    @Column(name = "family_history_cvd_hr")
    private Integer familyHistoryCvdHr;

    @Column(name = "smoking_status_hr")
    private String smokingStatusHr;

    @Column(name = "past_claims_count_hr")
    private Integer pastClaimsCountHr;

    @Column(name = "medication_for_bp_hr")
    private Integer medicationForBpHr;

    @Column(name = "medication_for_diabetes_hr")
    private Integer medicationForDiabetesHr;

    @Column(name = "bmi_lab")
    private Float bmiLab;

    @Column(name = "systolic_bp_lab")
    private Integer systolicBpLab;

    @Column(name = "diastolic_bp_lab")
    private Integer diastolicBpLab;

    @Column(name = "cholesterol_mg_dl_lab")
    private Integer cholesterolMgDlLab;

    @Column(name = "fasting_glucose_mg_dl_lab")
    private Integer fastingGlucoseMgDlLab;

    @Column(name = "hba1c_percent_lab")
    private Float hba1cPercentLab;

    @Column(name = "avg_daily_steps_sw")
    private Integer avgDailyStepsSw;

    @Column(name = "weekly_active_minutes_sw")
    private Integer weeklyActiveMinutesSw;

    @Column(name = "avg_resting_hr_sw")
    private Integer avgRestingHrSw;

    @Column(name = "avg_sleep_hours_sw")
    private Float avgSleepHoursSw;

    @Column(name = "diabetes_within_1yr")
    private Integer diabetesWithin1yr;

    @Column(name = "cvd_within_1yr")
    private Integer cvdWithin1yr;

    @Column(name = "risk_score_diabetes_1yr")
    private Float riskScoreDiabetes1yr;

    @Column(name = "risk_score_cvd_1yr")
    private Float riskScoreCvd1yr;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getAgeHr() {
        return ageHr;
    }

    public void setAgeHr(Integer ageHr) {
        this.ageHr = ageHr;
    }

    public String getGenderHr() {
        return genderHr;
    }

    public void setGenderHr(String genderHr) {
        this.genderHr = genderHr;
    }

    public Integer getFamilyHistoryDiabetesHr() {
        return familyHistoryDiabetesHr;
    }

    public void setFamilyHistoryDiabetesHr(Integer familyHistoryDiabetesHr) {
        this.familyHistoryDiabetesHr = familyHistoryDiabetesHr;
    }

    public Integer getFamilyHistoryCvdHr() {
        return familyHistoryCvdHr;
    }

    public void setFamilyHistoryCvdHr(Integer familyHistoryCvdHr) {
        this.familyHistoryCvdHr = familyHistoryCvdHr;
    }

    public String getSmokingStatusHr() {
        return smokingStatusHr;
    }

    public void setSmokingStatusHr(String smokingStatusHr) {
        this.smokingStatusHr = smokingStatusHr;
    }

    public Integer getPastClaimsCountHr() {
        return pastClaimsCountHr;
    }

    public void setPastClaimsCountHr(Integer pastClaimsCountHr) {
        this.pastClaimsCountHr = pastClaimsCountHr;
    }

    public Integer getMedicationForBpHr() {
        return medicationForBpHr;
    }

    public void setMedicationForBpHr(Integer medicationForBpHr) {
        this.medicationForBpHr = medicationForBpHr;
    }

    public Integer getMedicationForDiabetesHr() {
        return medicationForDiabetesHr;
    }

    public void setMedicationForDiabetesHr(Integer medicationForDiabetesHr) {
        this.medicationForDiabetesHr = medicationForDiabetesHr;
    }

    public Float getBmiLab() {
        return bmiLab;
    }

    public void setBmiLab(Float bmiLab) {
        this.bmiLab = bmiLab;
    }

    public Integer getSystolicBpLab() {
        return systolicBpLab;
    }

    public void setSystolicBpLab(Integer systolicBpLab) {
        this.systolicBpLab = systolicBpLab;
    }

    public Integer getDiastolicBpLab() {
        return diastolicBpLab;
    }

    public void setDiastolicBpLab(Integer diastolicBpLab) {
        this.diastolicBpLab = diastolicBpLab;
    }

    public Integer getCholesterolMgDlLab() {
        return cholesterolMgDlLab;
    }

    public void setCholesterolMgDlLab(Integer cholesterolMgDlLab) {
        this.cholesterolMgDlLab = cholesterolMgDlLab;
    }

    public Integer getFastingGlucoseMgDlLab() {
        return fastingGlucoseMgDlLab;
    }

    public void setFastingGlucoseMgDlLab(Integer fastingGlucoseMgDlLab) {
        this.fastingGlucoseMgDlLab = fastingGlucoseMgDlLab;
    }

    public Float getHba1cPercentLab() {
        return hba1cPercentLab;
    }

    public void setHba1cPercentLab(Float hba1cPercentLab) {
        this.hba1cPercentLab = hba1cPercentLab;
    }

    public Integer getAvgDailyStepsSw() {
        return avgDailyStepsSw;
    }

    public void setAvgDailyStepsSw(Integer avgDailyStepsSw) {
        this.avgDailyStepsSw = avgDailyStepsSw;
    }

    public Integer getWeeklyActiveMinutesSw() {
        return weeklyActiveMinutesSw;
    }

    public void setWeeklyActiveMinutesSw(Integer weeklyActiveMinutesSw) {
        this.weeklyActiveMinutesSw = weeklyActiveMinutesSw;
    }

    public Integer getAvgRestingHrSw() {
        return avgRestingHrSw;
    }

    public void setAvgRestingHrSw(Integer avgRestingHrSw) {
        this.avgRestingHrSw = avgRestingHrSw;
    }

    public Float getAvgSleepHoursSw() {
        return avgSleepHoursSw;
    }

    public void setAvgSleepHoursSw(Float avgSleepHoursSw) {
        this.avgSleepHoursSw = avgSleepHoursSw;
    }

    public Integer getDiabetesWithin1yr() {
        return diabetesWithin1yr;
    }

    public void setDiabetesWithin1yr(Integer diabetesWithin1yr) {
        this.diabetesWithin1yr = diabetesWithin1yr;
    }

    public Integer getCvdWithin1yr() {
        return cvdWithin1yr;
    }

    public void setCvdWithin1yr(Integer cvdWithin1yr) {
        this.cvdWithin1yr = cvdWithin1yr;
    }

    public Float getRiskScoreDiabetes1yr() {
        return riskScoreDiabetes1yr;
    }

    public void setRiskScoreDiabetes1yr(Float riskScoreDiabetes1yr) {
        this.riskScoreDiabetes1yr = riskScoreDiabetes1yr;
    }

    public Float getRiskScoreCvd1yr() {
        return riskScoreCvd1yr;
    }

    public void setRiskScoreCvd1yr(Float riskScoreCvd1yr) {
        this.riskScoreCvd1yr = riskScoreCvd1yr;
    }
}
