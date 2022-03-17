package com.company;

public class Main {

    public static void main(String[] args) {

        Computer pc = new Computer();

        System.out.println(pc.turnOn());
        System.out.println(pc.turnOff());


        Dice firstDice = new Dice();
        Dice secondDice = new Dice();

        int a = firstDice.throwDice();
        int b = secondDice.throwDice();

        System.out.println("The sum from two dices is: " + a + " + " + b + " = " + (a + b));

        Coin coin = new Coin();

        System.out.println(coin.flip());

    }
}
