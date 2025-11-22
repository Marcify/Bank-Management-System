package com.mlpr.bankmanagementsystem;

/**
 * Customer class extending abstract User class
 * Demonstrates Inheritance and implements abstract methods
 */
public class Customer extends User {
    private Account account;

    public Customer(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
    }
    
    @Override
    public String getUserRole() {
        return "CUSTOMER";
    }
    
    @Override
    public void displayDashboard() {
        System.out.println("=== Customer Dashboard ===");
        System.out.println("Welcome, " + getFullName());
        System.out.println("Account Number: " + (account != null ? account.getAccountNumber() : "N/A"));
        System.out.println("Balance: " + viewBalance());
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public String viewBalance() {
        if (account != null) {
            return "₱" + account.getBalance();
        } else {
            return "No account found!";
        }
    }
}
