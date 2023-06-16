package abstractdemo2;

public class Frog extends Animal{

    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }

    @Override
    public void eat() {
        System.out.println("frogs eat insects");
    }
}
