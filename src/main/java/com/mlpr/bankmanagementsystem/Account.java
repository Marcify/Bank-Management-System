package com.mlpr.bankmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Interface Implementation
 */
public class Account implements Transactable {
    // Encapsulation: Private fields
    private String accountNumber;
    private double balance;
    private Customer owner;
    private List<String> transactionHistory;
    
    public Account(String accountNumber, Customer owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
        logTransaction("Account created");
    }

    public String getAccountNumber() { 
        return accountNumber;
    }
    public Customer getOwner() { 
        return owner;
    }
    
    // Interface Implementation
    @Override
    public double getBalance() { 
        return balance; 
    }

    // Interface Implementation
    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logTransaction("DEPOSIT: ₱" + amount + " | New Balance: ₱" + balance);
            return true;
        }
        return false;
    }

    // Interface Implementation
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            logTransaction("WITHDRAW: ₱" + amount + " | New Balance: ₱" + balance);
            return true;
        }
        return false;
    }
    
    // Encapsulation
    private void logTransaction(String transaction) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        transactionHistory.add("[" + timestamp + "] " + transaction);
    }
    
    // Encapsulation
    public List<String> getTransactionHistory() {
        return new ArrayList<>(transactionHistory);
    }
}
