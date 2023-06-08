import java.util.Scanner;

public class StringDemo5 {
    //遍历字符串,键盘录入一个字符串，使用程序实现在控制台遍历该字符串
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scan.next();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));

        }



    }
}
