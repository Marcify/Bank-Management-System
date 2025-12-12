package com.mlpr.bankmanagementsystem;

/**
 * Abstraction
 */
public abstract class User {
    // Encapsulation: Private fields
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
    
    // Abstract method
    public abstract String getUserRole();
    
    // Abstract method
    public abstract void displayDashboard();
    
    // Encapsulation: Getters
    public String getUsername() { 
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getFirstName() { 
        return firstName;
    
    }
    public String getLastName() { 
        return lastName;
    }
    
    public String getFullName() { 
        return firstName + " " + lastName;
    }
    
    // Encapsulation: Setters
    public void setUsername(String username) { 
        this.username = username;
    }
    
    // Encapsulation: Setter with validation
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) { 
        this.lastName = lastName;
    }
}
