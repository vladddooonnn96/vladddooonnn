package com.company.lesson8;

public class Driver {
    private String fullName;
    private int driveExpirience;

    public Driver() {

    }

    public Driver(String fullName, int driveExpirience) {
        this.fullName = fullName;
        this.driveExpirience = driveExpirience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDriveExpirience() {
        return driveExpirience;
    }

    public void setDriveExpirience(int driveExpirience) {
        this.driveExpirience = driveExpirience;
    }
}
