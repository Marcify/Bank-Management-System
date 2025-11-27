package com.mlpr.bankmanagementsystem;
import java.util.*;

/**
 * Inheritance and Abstract Method Overriding
 */
public class Admin extends User {
    // Inheritance: Using super() to call parent constructor
    public Admin(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
    }
    
    // Abstract Method Overriding
    @Override
    public String getUserRole() {
        return "ADMINISTRATOR";
    }
    
    // Abstract Method Overriding - Polymorphism
    @Override
    public void displayDashboard() {
        System.out.println("=== Admin Dashboard ===");
        System.out.println("Administrator: " + getFullName());
        System.out.println("Access Level: Full System Access");
    }
}
