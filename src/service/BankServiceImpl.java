package service;

import model.Account;

import java.util.HashMap;
import java.util.Map;

/**
 * Implements bank operations.
 */
public class BankServiceImpl implements BankService {

    private Map<String, Account> accounts = new HashMap<>();

    @Override
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    @Override
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        account.deposit(amount);
    }

    @Override
    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        account.withdraw(amount);
    }

    @Override
    public void displayAccount(String accountNumber) {
        Account account = accounts.get(accountNumber);
        System.out.println(account);
    }
}
