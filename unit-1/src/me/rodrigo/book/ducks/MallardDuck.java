package me.rodrigo.book.ducks;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehiavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a real Mallard Duck !!");
    }
}
