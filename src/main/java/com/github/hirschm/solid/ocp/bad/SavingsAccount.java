package com.github.hirschm.solid.ocp.bad;

public class SavingsAccount {
    public double calculateInterest(AccountType type) {
        if(type == AccountType.OVERNIGHT) {
            return 0.5;
        } else if(type == AccountType.FIXED_TERM) {
            return 2.1;
        }
        return 0;
    }
}
