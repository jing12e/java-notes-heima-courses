import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StringDemo1 {
    public static void main(String[] args) {
        //1. 直接赋值
        String s1 = "abc";
        System.out.println(s1);
        //2. new
        //空参构造
        String s2 = new String();
        System.out.println(s2);
        //传递一个字符数组
        char[] chs = {'a', 'b', 'c'};
        String s4 = new String(chs);
        System.out.println(s4);



    }
}