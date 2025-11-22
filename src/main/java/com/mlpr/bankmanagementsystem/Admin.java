package com.mlpr.bankmanagementsystem;
import java.util.*;

/**
 * Admin class extending abstract User class
 * Demonstrates Inheritance and implements abstract methods
 */
public class Admin extends User {
    public Admin(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
    }
    
    @Override
    public String getUserRole() {
        return "ADMINISTRATOR";
    }
    
    @Override
    public void displayDashboard() {
        System.out.println("=== Admin Dashboard ===");
        System.out.println("Administrator: " + getFullName());
        System.out.println("Access Level: Full System Access");
    }

    public void viewAllAccounts(List<Account> accounts) {
        System.out.println("\n=== All Accounts ===");
        for (Account acc : accounts) {
            System.out.println("Account Number: " + acc.getAccountNumber() +
                               " | Owner: " + acc.getOwner().getFirstName() +
                               " | Balance: ₱" + acc.getBalance());
        }
    }

    public void viewAllUsers(List<User> users) {
        System.out.println("\n=== All Registered Users ===");
        for (User u : users) {
            System.out.println("- " + u.getFirstName() + " " + u.getLastName() + 
                             " (" + u.getUsername() + ") - Role: " + u.getUserRole());
        }
    }
}
