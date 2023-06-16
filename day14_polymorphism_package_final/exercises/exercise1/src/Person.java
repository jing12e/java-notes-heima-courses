public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal, String food) {
        System.out.println("年龄为" + this.age + "的" + this.name + "养了一只" + animal.getColor() + "颜色的" + animal.getAge() + "岁的宠物");
        animal.eat(food);

    }
}
