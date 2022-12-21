package org.academiadecodigo.bootcamp.moneyInTheBank;

public enum Gift {
    COMPUTER(2000),
    SNEAKERS(100),
    PEN(2),
    IPHONE(1500),
    TSHIRT(26);


    private int price;

    Gift(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
