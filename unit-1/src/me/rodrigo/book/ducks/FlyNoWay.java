package me.rodrigo.book.ducks;

public class FlyNoWay implements FlyBehiavior{
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
