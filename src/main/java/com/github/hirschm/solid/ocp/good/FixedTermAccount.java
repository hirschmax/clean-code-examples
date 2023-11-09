package com.github.hirschm.solid.ocp.good;

public class FixedTermAccount implements SavingsAccount {
    @Override
    public double calculateInterest() {
        return 2.1;
    }
}
