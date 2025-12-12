package com.mlpr.bankmanagementsystem;

/**
 * Inheritance and Abstract Method Overriding
 */
public class Customer extends User {
    // Encapsulation: Private field
    private Account account;

    // Inheritance: Using super() to call parent constructor
    public Customer(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
    }
    
    // Abstract Method Overriding
    @Override
    public String getUserRole() {
        return "CUSTOMER";
    }
    
    // Abstract Method Overriding - Polymorphism
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
