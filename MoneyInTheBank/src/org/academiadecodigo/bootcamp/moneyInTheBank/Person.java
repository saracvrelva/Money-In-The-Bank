package org.academiadecodigo.bootcamp.moneyInTheBank;

public class Person {

    private String name;
    private PiggyBank piggyBank;
    private SavingsAccount savingsAccount;
    private Landlord landlord;
    private boolean youCanBuy = false;


    //create person with a name and a piggyBank, savingAccount and a Landlord
    public Person(String name, PiggyBank piggyBank, SavingsAccount savingsAccount, Landlord landlord) {
        this.name = name;
        this.piggyBank = piggyBank;
        this.landlord = landlord;
        this.savingsAccount = savingsAccount;
    }

    //access person's piggyBank
    public PiggyBank getPiggyBank() {
        return piggyBank;
    }

    //access person's Landlord
    public Landlord getLandlord() {
        return landlord;
    }

    public SavingsAccount getSavingsAccount() {
        return this.savingsAccount;
    }

    //Withdraw money - give the value to withdraw, access piggyBank (getPiggyBank) and set balance = balance - value to withdraw
    // if withdraw value is bigger than balance, I can not withdraw
    //use the boolean propertie youCanBuy to interact with method buy()§
    public void withdrawMoney(int withdrawValue) {
        if (withdrawValue <= piggyBank.getBalance()) {
            youCanBuy = true;
            piggyBank.setBalance(piggyBank.getBalance() - withdrawValue);
            System.out.println("You withdraw " + withdrawValue + " €.");
            return;
        }
            youCanBuy = false;
            System.out.println("Your balance is too low to withdraw. Please withdraw a lower value!");

    }

    //Add money - give the value to add, access piggyBank (getPiggyBank) and set balance = balance + value to add
    // when my balance is bigger than 5000 I will withdraw 200 by 200 to my saving account until I have 5000 or less in my piggy bank
    public void depositMoney(int valueToAdd) {
        piggyBank.setBalance(piggyBank.getBalance() + valueToAdd);
        System.out.println("You just deposit " + valueToAdd + " €.");
        while (getPiggyBank().getBalance() > 5000) {
            withdrawMoney(200);
            getSavingsAccount().setBalance(savingsAccount.getBalance() + 200);
        }
        System.out.println("Your piggyBank now has " + getPiggyBank().getBalance() + "€ and your savings account has " + getSavingsAccount().getBalance() + "€!");
    }


    //pay rent directly - access Rent value with getLandlord.getRent that is passed to the withdraw method.
    //Set landlord balance to her balance + payed rent
    public void payRent() {
        if(piggyBank.getBalance() < 300){
            System.out.println( "You don't have enough money to pay the rent! Get a job!");
            return;
        }
        withdrawMoney(landlord.getRent());
        landlord.setBalance(landlord.getBalance() + 300);
    }

    // buy gifts; access withdrawMoney method to withdraw the money to pay the gift
    // in the withdraw method , if my money balance is higher/= than the money to withdraw it sets youCanBuy to true
    //if my youCanBuy = true prints the message below if its not, it will print the message in withdraw method
    public void buy(int price) {
        withdrawMoney(price);
        if (youCanBuy == true) {
            System.out.println("Congrats, you just got poorer!");
        }

    }

}
