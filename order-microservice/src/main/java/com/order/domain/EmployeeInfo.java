package com.order.domain;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class EmployeeInfo {
    private long employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private float salary;
    private String contactEmail;
    private boolean isFirstYear;

    public EmployeeInfo() {
    }

    public EmployeeInfo(long employeeId, String firstName, String lastName, String gender, float salary, String contactEmail, boolean isFirstYear) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
        this.contactEmail = contactEmail;
        this.isFirstYear = isFirstYear;
    }


    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public boolean isFirstYear() {
        return isFirstYear;
    }

    public void setFirstYear(boolean firstYear) {
        isFirstYear = firstYear;
    }

}
