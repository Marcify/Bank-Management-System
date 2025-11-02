package com.mlpr.bankmanagementsystem;
import java.util.*;

public class Admin extends User {
    public Admin(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
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
        String result = "\n=== All Registered Users ===";
        for (User u : users) {
            System.out.println("- " + u.getFirstName() + " " + u.getLastName() + " (" + u.getUsername() + ")");
        }
    }
}
