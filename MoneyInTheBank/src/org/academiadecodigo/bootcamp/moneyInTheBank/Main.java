package org.academiadecodigo.bootcamp.moneyInTheBank;

public class Main {

    public static void main(String[] args) {



        Person sara = new Person("Sara", new PiggyBank(500), new SavingsAccount(), new Landlord());



        //sara.withdrawMoney(50);
        //sara.withdrawMoney(1000);


        //System.out.println(sara.getPiggyBank().getBalance());
        //sara.depositMoney(4500);

        //sara.payRent();
        //sara.payRent();
        //System.out.println(sara.getLandlord().getBalance());

        sara.buy(Gift.PEN.getPrice());
        sara.buy(Gift.IPHONE.getPrice());











    }
}
