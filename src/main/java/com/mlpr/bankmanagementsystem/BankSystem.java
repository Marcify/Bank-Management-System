package com.mlpr.bankmanagementsystem;
import java.util.*;
import javax.swing.JOptionPane;

public class BankSystem {
    private List<User> users = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();
    private int accountCounter = 1; // used to auto-generate account numbers
    
    private static final BankSystem instance = new BankSystem();
    
    private BankSystem() {}
    
    public static BankSystem getInstance() {
        return instance;
    }

    public void registerCustomer(Customer customer) {
        for(User u : users) {
            if(u.getUsername().equalsIgnoreCase(customer.getUsername())) {
                JOptionPane.showMessageDialog(null, "The username '" + u.getUsername() + "' is already being used!", "Registration Failed", JOptionPane.OK_OPTION + JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        users.add(customer);
    }

    public void registerAdmin(Admin admin) {
        users.add(admin);
        System.out.println("Admin account registration successful!");
    }

    public User login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                System.out.println("Login successful!\nWelcome, " + u.getFirstName() + "!");
                return u;
            }
        }
        JOptionPane.showMessageDialog(null, "Invalid username or password!", "Login Failed", JOptionPane.OK_OPTION + JOptionPane.ERROR_MESSAGE);
        return null;
    }

    // Automatically generate an account number
    private String generateAccountNumber() {
        String accountNumber = String.format("2025%04d", accountCounter);
        accountCounter++;
        return accountNumber;
    }

    public Account createAccount(Customer customer) {
        String accNum = generateAccountNumber();
        Account acc = new Account(accNum, customer);
        accounts.add(acc);
        customer.setAccount(acc);
        // System.out.println("Account created successfully!");
        // System.out.println("Your new Account Number: " + accNum);
        return acc;
    }
    
    public List<Account> getAccounts() { return accounts; }
    public List<User> getUsers() { return users; }
}
