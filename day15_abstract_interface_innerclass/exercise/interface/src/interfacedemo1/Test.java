package interfacedemo1;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog("frog", 1);
        dog.eat();
        dog.swim();
        Dog.drink();
        System.out.println(dog.getAge() + dog.getName());

    }
}
