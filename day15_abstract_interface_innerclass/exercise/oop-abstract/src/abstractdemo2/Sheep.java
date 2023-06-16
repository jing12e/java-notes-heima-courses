package abstractdemo2;

public class Sheep extends Animal{

    public Sheep(String name, int age) {
        super(name, age);
    }

    public Sheep() {
    }

    @Override
    public void eat() {
        System.out.println("sheep eat grass");
    }
}
