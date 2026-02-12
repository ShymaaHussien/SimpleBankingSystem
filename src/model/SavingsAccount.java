package model;

import exception.InsufficientBalanceException;

/**
 * Savings account with minimum balance rule.
 */
public class SavingsAccount extends Account {

    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientBalanceException("Minimum balance of 500 must be maintained.");
        }
        balance -= amount;
    }
}
