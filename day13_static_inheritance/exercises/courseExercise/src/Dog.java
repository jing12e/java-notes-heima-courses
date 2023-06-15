public class Dog {
    private int age;
    public static int name = 111;
    public void eat() {
        System.out.println("eat food");
    }
    protected void play() {
        System.out.println("play");
    }

    public Dog() {
    }

    public Dog(int age, int name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
