package abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("sheep1", 3);
        System.out.println(sheep1.getAge());
        System.out.println(sheep1.getName());
        sheep1.eat();
        sheep1.drink();

        Frog f = new Frog("xiaolv", 44);
        f.drink();
        f.eat();

    }
}
