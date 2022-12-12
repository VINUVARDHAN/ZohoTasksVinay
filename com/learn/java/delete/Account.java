//$Id$
package com.learn.java.delete;

class Wallet {
    static int amount;

    Wallet() {
        amount = 8000;
    }

    static void display() {
        System.out.println(amount);
    }

    static void add() {
        amount += 2500;
    }

    static void purchase() {
        amount -= 5000;
    }
}

public class Account {
    public static void main(String[] args) {
        // initialize the wallet by creating the object
        Wallet wallet = new Wallet();
        System.out.println("Amount in the wallet is : " + wallet.amount);
        // add method to add money to wallet
        wallet.add();
        System.out.println("Amount added is 2500 total is : " + wallet.amount);
        // purchase of 5000
        wallet.purchase();
        System.out.println("Amount remaining after purchase is : " + wallet.amount);

    }
}