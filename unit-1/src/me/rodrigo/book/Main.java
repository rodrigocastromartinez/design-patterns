package me.rodrigo.book;

import me.rodrigo.book.ducks.Duck;
import me.rodrigo.book.ducks.MallardDuck;

// MiniDuckSimulator
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();
    }
}