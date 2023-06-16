package abstractdemo2;

import java.sql.SQLOutput;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("dogs eat bones");
    }
}
