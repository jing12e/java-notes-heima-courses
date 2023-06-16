package interfacedemo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(Inter.a);

//        Inter.a = 20;

        //创建实现类对象并调用方法
        InterImp1 interImp1 = new InterImp1();
        interImp1.method();

        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
