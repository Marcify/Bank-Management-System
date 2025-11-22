package com.mlpr.bankmanagementsystem;

/**
 * Interface demonstrating the Interface OOP concept
 * Defines contract for all objects that can perform transactions
 */
public interface Transactable {
    boolean deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
    String getTransactionHistory();
}
