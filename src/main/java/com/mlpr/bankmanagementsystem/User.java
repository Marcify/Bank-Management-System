package com.mlpr.bankmanagementsystem;

/**
 * Abstract base class demonstrating Abstraction OOP concept
 * Cannot be instantiated directly, must be extended
 */
public abstract class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    
    User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract String getUserRole();
    
    // Abstract method - different behavior for Customer vs Admin
    public abstract void displayDashboard();
    
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return firstName + " " + lastName; }
    
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nUsername: " + username + "\nRole: " + getUserRole();
    }
}
