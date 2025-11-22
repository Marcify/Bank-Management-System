package com.mlpr.bankmanagementsystem;

/**
 * Interface for account management operations
 * Demonstrates Interface OOP concept for administrative operations
 */
public interface AccountManageable {
    void createAccount(Customer customer);
    void viewAccountDetails(String accountNumber);
    boolean deleteAccount(String accountNumber);
}
