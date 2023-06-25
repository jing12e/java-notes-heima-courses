package bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    /*public BigInteger(int num, Random rnd) 		//获取随机大整数，范围：[0 ~ 2的num次方-1]
    public BigInteger(String val) 				//获取指定的大整数
    public BigInteger(String val, int radix) 	//获取指定进制的大整数

    下面这个不是构造，而是一个静态方法获取BigInteger对象
    public static BigInteger valueOf(long val) 	//静态方法获取BigInteger的对象，内部有优化*/

    // 1. 获取一个随机大整数
    public static void main(String[] args) {

        // 1. 获取一个随机大整数
        for (int i = 0; i < 100; i++) {
            BigInteger bd1 = new BigInteger(4, new Random());//0-15
            System.out.println(bd1);

        }
        //2.获取一个指定的大整数
        BigInteger bd2 = new BigInteger("100565646");
        System.out.println(bd2);

        //3.获取指定进制的大整数
        BigInteger bd3 = new BigInteger("100",2);
        System.out.println(bd3);

        //4.静态方法获取BigInteger对象
        //能表示的范围小，在long的取值范围内
        //在内部，对-16 - 16 进行了优化。
          //提前把-16 - 16 先创建好biginteger的对象，如果多次获取不会重新创建新的
        BigInteger bd5 = BigInteger.valueOf(100);
        System.out.println(bd5);


    }



}
