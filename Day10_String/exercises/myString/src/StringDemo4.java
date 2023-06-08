import java.util.Scanner;
//用户登录问题
public class StringDemo4 {
    public static void main(String[] args) {
        //1.定义两个变量记录正确的用户名和代码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        //2.键盘录入用户名和密码
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter username:");
            String username = scan.next();
            System.out.println("Enter password:");
            String password = scan.next();
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("okay");
                break;
                //break跳出当前循环
            } else {
                if (i == 2) {
                    System.out.println("账户被锁定");
                } else {
                    System.out.println("left " + (2 - i) + " opportunity");
                }
            }


        }

    }
}
