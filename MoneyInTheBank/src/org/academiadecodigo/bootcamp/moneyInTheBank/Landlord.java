package org.academiadecodigo.bootcamp.moneyInTheBank;

public class Landlord {
    // balance of the landlord (increases when a person pays the rent)
    private int balance;
    private int rent = 300;

    //get rent value
    public int getRent() {

        return this.rent;
    }

    public int getBalance() {
        return this.balance;
    }

    // change balance
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
