package com.itheima.a05innerclassdemo5;

public class Outer {

    int b = 20;

    public void show(){
        int a = 10;

        //局部内部类
        class Inner{
            String name;
            int age;

            public Inner() {
            }

            public Inner(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void method1(int age){
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的method1方法");
                System.out.println(this.age);
                System.out.println(age);
            }

            public static void method2(){
                System.out.println("局部内部类中的method2静态方法");
            }
        }


        //创建局部内部类的对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1(1);
        Inner.method2();


    }




}
