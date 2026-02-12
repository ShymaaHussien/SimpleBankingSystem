package service;

import model.Account;

public interface BankService {

    void addAccount(Account account);

    void deposit(String accountNumber, double amount);

    void withdraw(String accountNumber, double amount);

    void displayAccount(String accountNumber);
}
