import java.util.Scanner;

public class StringDemo6 {
    //统计字符次数
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scan.next();
        int upperCase = 0;
        int underCase = 0;
        int number = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (c >= 'a' && c <= 'z') {
                underCase++;
            } else if (c >= 'A' && c <= 'Z') {
                upperCase++;
            } else if (c >= '0' && c <= '9') {
                number++;
            }


        }
        System.out.println(upperCase);
        System.out.println(underCase);
        System.out.println(number);
        //CTRL + D 向下复制一行
    }
}
