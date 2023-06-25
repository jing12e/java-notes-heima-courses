package systemdemo;

public class SystemDemo1 {
    /*public static long currentTimeMillis()			// 获取当前时间所对应的毫秒值（当前时间为0时区所对应的时间即就是英国格林尼治天文台旧址所在位置）
    public static void exit(int status)				// 终止当前正在运行的Java虚拟机，0表示正常退出，非零表示异常退出
    public static native void arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length); // 进行数值元素copy*/

    public static void main(String[] args) {
        //0
        //1
        /*System.exit(1);
        System.out.println("111");*/
        long start = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            boolean prime1 = isPrime1(i);
            if(prime1){
                System.out.println(i);
            }

        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }

    public static boolean isPrime2(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime1(int number){
        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
