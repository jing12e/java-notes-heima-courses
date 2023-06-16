package test_final_public_protected.demo1;

public class Test {
    public static void main(String[] args) {

        //private在同一个包中的其他类不能用
//        Animal animal = new Animal();
//        System.out.println(animal.name);

        //默认在同一个包中的其他类可以使用
        Animal animal = new Animal();
        System.out.println(animal.name1);

        //protected在同一个包中的其他类可以使用
        System.out.println(animal.name2);

        //public在同一个包中的其他类可以使用
        System.out.println(animal.name3);

    }
}
