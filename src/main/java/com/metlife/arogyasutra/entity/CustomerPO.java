package com.metlife.arogyasutra.entity;

import jakarta.persistence.*;

@Table(name = "Customer_Details")
@Entity
public class CustomerPO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private int id;

    @Column(name= "Name")
    private String name;

    @Column(name= "age")
    private int age;

    @Column(name="gender")
    private String gender;

    @Column(name="family_history_diabetes")
    private boolean family_history_diabetes;

    @Column(name="family_history_cvd")
    private boolean family_history_cvd;

    @Column(name="smoking_status")
    private boolean smoking_status;

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

    public boolean isFamily_history_cvd() {
        return family_history_cvd;
    }

    public void setFamily_history_cvd(boolean family_history_cvd) {
        this.family_history_cvd = family_history_cvd;
    }

    public boolean isSmoking_status() {
        return smoking_status;
    }

    public void setSmoking_status(boolean smoking_status) {
        this.smoking_status = smoking_status;
    }

    @Override
    public String toString() {
        return "CustomerPO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", family_history_diabetes=" + family_history_diabetes +
                ", family_history_cvd=" + family_history_cvd +
                ", smoking_status=" + smoking_status +
                '}';
    }
}
