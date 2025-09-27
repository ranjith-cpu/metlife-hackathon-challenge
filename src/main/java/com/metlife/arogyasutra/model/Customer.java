package com.metlife.arogyasutra.model;


public class Customer {
    private int id;
    private String name;
    private int age;
    private String gender;
    private boolean family_history_diabetes;
    private boolean family_history_cvd;
    private boolean smoking_status;

    public Customer() {
    }

    public Customer(int id, String name, int age, String gender, boolean family_history_diabetes, boolean family_history_cvd, boolean smoking_status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.family_history_diabetes = family_history_diabetes;
        this.family_history_cvd = family_history_cvd;
        this.smoking_status = smoking_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isFamily_history_diabetes() {
        return family_history_diabetes;
    }

    public void setFamily_history_diabetes(boolean family_history_diabetes) {
        this.family_history_diabetes = family_history_diabetes;
    }

    public boolean isFamily_history_vcd() {
        return family_history_cvd;
    }

    public void setFamily_history_vcd(boolean family_history_vcd) {
        this.family_history_cvd = family_history_vcd;
    }

    public boolean isSmoking_status() {
        return smoking_status;
    }

    public void setSmoking_status(boolean smoking_status) {
        this.smoking_status = smoking_status;
    }
}
