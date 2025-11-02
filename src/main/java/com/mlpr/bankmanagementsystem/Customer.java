package com.mlpr.bankmanagementsystem;

public class Customer extends User {
    private Account account;

    public Customer(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
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
