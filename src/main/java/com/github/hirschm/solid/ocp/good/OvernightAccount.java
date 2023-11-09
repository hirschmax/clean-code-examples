package com.github.hirschm.solid.ocp.good;

public class OvernightAccount implements SavingsAccount {
    @Override
    public double calculateInterest() {
        return 0.5;
    }
}
