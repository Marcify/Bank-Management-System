/*

    Manapsal, Gabriel
    Llanes, Joshua
    Publico, Philip
    Riparip, Marc
    BSIT WMA 3B

*/

package com.mlpr.bankmanagementsystem;

/**
 * Interface
 */
public interface Transactable {
    boolean deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
}
