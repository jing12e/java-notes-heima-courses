package interfacedemo1;

import java.sql.SQLOutput;

public class Dog extends Animal implements Swim{

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("dog eats bone");
    }

    @Override
    public void swim() {
        System.out.println("dog can swim");

    }
}
