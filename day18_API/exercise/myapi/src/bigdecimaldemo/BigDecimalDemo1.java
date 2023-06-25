package bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {

        //1 public BigDecimal(double val)
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        //2** public BigDecimal(String val)
        BigDecimal bd3 = new BigDecimal("0.09");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd3 == bd4);//false

        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd5);
        //3. 不精确
        System.out.println(0.01 + 0.09);

        //4** public static BigDecimal ValueOf(double val)
        BigDecimal bd6  = BigDecimal.valueOf(10);//10.0
        BigDecimal bd7  = BigDecimal.valueOf(10);//10.0
        System.out.println(bd6);
        System.out.println(bd6 == bd7);//true

        /*public static BigDecimal valueOf(double val) {
            // Reminder: a zero double returns '0.0', so we cannot fastpath
            // to use the constant ZERO.  This might be important enough to
            // justify a factory approach, a cache, or a few private
            // constants, later.
            return new BigDecimal(Double.toString(val));
        }*/

        //details:
        //1. 如果表示的数字不大，没有超过double的取值范围，建议使用静态方法
        //2. 如果表示的数字比较大，超出，使用构造方法
        //3. 如果我们传递的是0-10之间的整数，包含0，包含10，那么方法会返回已经创建好的对象，不会重新new，节约内存

    }

}
