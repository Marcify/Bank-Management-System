package com.mlpr.bankmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Account class implementing Transactable interface
 * Demonstrates Interface implementation OOP concept
 */
public class Account implements Transactable {
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

    public String getAccountNumber() { return accountNumber; }
    public Customer getOwner() { return owner; }
    
    @Override
    public double getBalance() { 
        return balance; 
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logTransaction("DEPOSIT: ₱" + amount + " | New Balance: ₱" + balance);
            System.out.println("Deposited " + amount);
            return true;
        } else {
            System.out.println("Invalid amount!");
            return false;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            logTransaction("WITHDRAW: ₱" + amount + " | New Balance: ₱" + balance);
            System.out.println("Withdrew " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount!");
            return false;
        }
    }
    
    @Override
    public String getTransactionHistory() {
        StringBuilder history = new StringBuilder("=== Transaction History ===\n");
        for (String transaction : transactionHistory) {
            history.append(transaction).append("\n");
        }
        return history.toString();
    }
    
    private void logTransaction(String transaction) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        transactionHistory.add("[" + timestamp + "] " + transaction);
    }
}
