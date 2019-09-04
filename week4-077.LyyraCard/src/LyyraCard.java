/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielsepejr.
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
        if (balance >= 2.50) {
            balance = this.balance - 2.50;
        }
    }
    
    public void payGourmet() {
        if (balance >= 4.00) {
            balance = this.balance - 4.00;
        }
    }
    
    public void loadMoney(double amount) {
        if (amount >= 0) {
            balance += amount;
            if (balance > 150) {
                balance = 150;
            }
        }
    }
}
