package com.mlpr.bankmanagementsystem;

/**
 * Interface
 */
public interface Transactable {
    boolean deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
}
