import java.util.Scanner;
//对称字符串
public class StringBuilderDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        System.out.println(sb);

        String string = sb.toString();
        if (string.equals(str)) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }


    }
}
