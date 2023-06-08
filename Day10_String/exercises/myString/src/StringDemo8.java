import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //字符串的反转
        //定义一个方法键盘录入abc，输出结果cba
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = scan.next();
        System.out.println(reverse(str));

    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //shift + f6批量改变量
            char c = str.charAt(i);
            result = result + c;

        }
        return result;

    }
}
