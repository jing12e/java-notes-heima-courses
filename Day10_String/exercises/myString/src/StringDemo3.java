import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str1 = scan.next(); //是new出来的
        String str2 = "abc";
        System.out.println(str1 == str2);

        //只要比较字符串的内容，就要用string里的方法，equals()
    }
}
