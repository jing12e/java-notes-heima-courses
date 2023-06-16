package test_final_public_protected.demo2;

import test_final_public_protected.demo1.Animal;

public class Dog extends Animal {
//    @Override
//    public void show() {
//        System.out.println(name);
//    }


    //默认在其他包中的子类不能用
//    @Override
//    public void show() {
//        System.out.println(name1);
//    }


    //protected在其他包中的子类可以用
//    @Override
//    public void show() {
//        System.out.println(name2);
//    }


    //public在其他包中的子类可以使用
    @Override
    public void show() {
        System.out.println(name3);
    }
}
