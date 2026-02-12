package model;

import exception.InsufficientBalanceException;

/**
 * Current account without minimum balance.
 */
public class CurrentAccount extends Account {

    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
    }
}
