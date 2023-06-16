public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.setAge(2);
        dog.setColor("黑");
        Person person = new Person();
        person.setAge(30);
        person.setName("老王");
        person.keepPet(dog, "骨头");


        Animal cat = new Cat(2, "黄");
        Person person1 = new Person("李四", 22);
        person.keepPet(cat, "鱼");



    }
}