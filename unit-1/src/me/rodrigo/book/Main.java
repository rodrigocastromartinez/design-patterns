package me.rodrigo.book;

import me.rodrigo.book.ducks.Duck;
import me.rodrigo.book.ducks.FlyRocketPowered;
import me.rodrigo.book.ducks.MallardDuck;
import me.rodrigo.book.ducks.ModelDuck;

// MiniDuckSimulator
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}