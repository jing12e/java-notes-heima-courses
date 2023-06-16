package interfacedemo1;

public class Frog extends Animal implements Swim{
    public Frog(String name, int age) {
        super(name, age);
    }


    public Frog() {
    }

    @Override
    public void eat() {
        System.out.println("flog eats insects");
    }

    @Override
    public void swim() {
        System.out.println("frog can swim");
    }
}
