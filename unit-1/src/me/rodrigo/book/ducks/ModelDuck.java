package me.rodrigo.book.ducks;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehiavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a Model Duck");
    }
}
