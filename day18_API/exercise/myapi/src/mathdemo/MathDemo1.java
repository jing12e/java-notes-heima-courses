package mathdemo;

public class MathDemo1 {
    /*public static int abs(int a)					// 返回参数的绝对值
    public static double ceil(double a)				// 返回大于或等于参数的最小整数
    public static double floor(double a)			// 返回小于或等于参数的最大整数
    public static int round(float a)				// 按照四舍五入返回最接近参数的int类型的值
    public static int max(int a,int b)				// 获取两个int值中的较大值
    public static int min(int a,int b)				// 获取两个int值中的较小值
    public static double pow (double a,double b)	// 计算a的b次幂的值
    public static double random()					// 返回一个[0.0,1.0)的随机值*/
    public static void main(String[] args) {

        System.out.println(Math.abs(-5555));
        System.out.println(Math.abs(5555));
        System.out.println(Math.absExact(-2147483647));

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.54));
        System.out.println(Math.ceil(-12.54));

        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.54));
        System.out.println(Math.floor(-12.54));

        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.54));

        System.out.println(Math.max(20, 30));
        System.out.println(Math.min(20, 30));

        System.out.println(Math.pow(2, 3));//8

        System.out.println(Math.sqrt(4));//2.0
        System.out.println(Math.cbrt(8));//2.0

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());

        }



    }
}
