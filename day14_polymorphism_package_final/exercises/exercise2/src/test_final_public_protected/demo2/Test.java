package test_final_public_protected.demo2;

import test_final_public_protected.demo1.Animal;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        //private在不同包下的无关类不能使用
//        Animal animal = new Animal();
//        System.out.println(animal.name);

        //默认在不同包下的无关类不可以使用
//        Animal animal = new Animal();
//        System.out.println(animal.name1);

        //protected在不同包中的其他类不可以使用
//        System.out.println(animal.name2);


        //public在不同包中的其他类不能使用
        Animal animal = new Animal();
        System.out.print(animal.name3);
    }
}
