package me.rodrigo.book.ducks;

public abstract class Duck {
    FlyBehiavior flyBehiavior;
    QuackBehavior quackBehavior;
    public Duck(){}

    public abstract void display();

    public void performFly() {
        flyBehiavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
