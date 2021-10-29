package com.careerdevs.hw_1;

public class Employee {

    private final long ID;

    private final String F_NAME;

    private final String L_NAME;

    public Employee(long ID, String f_NAME, String l_NAME) {
        this.ID = ID;
        F_NAME = f_NAME;
        L_NAME = l_NAME;
    }

    public long getID() {
        return ID;
    }

    public String getF_NAME() {
        return F_NAME;
    }

    public String getL_NAME() {
        return L_NAME;
    }
}
