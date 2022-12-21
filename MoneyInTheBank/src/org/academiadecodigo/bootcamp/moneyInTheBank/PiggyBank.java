package org.academiadecodigo.bootcamp.moneyInTheBank;

public class PiggyBank {
    private int balance;
    //I can save 4 cards in my Piggy Bank 
    private String[] cards = new String[3];

    private static int numberOfCards;

    public PiggyBank(int balance) {
        this.balance = balance;
    }

    //define piggyBank Balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    //get piggyBankBalance
    public int getBalance() {
        return this.balance;
    }

    //save cards in my piggyBank as it was a wallet
    //everytime I saveCard I add 1 to numberOfCards
    //If numberOfCards gets bigger than the array of cards length it will print a message of "fullness"
    public void saveCard(String cardToSave) {
        numberOfCards++; 
        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i] == null) {
                this.cards[i] = cardToSave;
                break;
            }
        }
        if(numberOfCards > cards.length){
            System.out.println("Your piggy is full. Discard one card!");
        }

    }

    //prints all the cards I have saved in my piggy Bank one by one or prints a message if I dont have any
    public void getCards() {

        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i] != null) {
                System.out.println("You have a card to: " + this.cards[i]);
            }
        }
        if (this.numberOfCards == 0) {
            System.out.println("You don't have any cards!");
        }

    }
}




