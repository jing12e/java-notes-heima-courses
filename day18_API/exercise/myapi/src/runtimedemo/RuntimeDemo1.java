package runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        /*public static Runtime getRuntime()		//当前系统的运行环境对象
        public void exit(int status)			//停止虚拟机
        public int availableProcessors()		//获得CPU的线程数
        public long maxMemory()				    //JVM能从系统中获取总内存大小（单位byte）
        public long totalMemory()				//JVM已经从系统中获取总内存大小（单位byte）
        public long freeMemory()				//JVM剩余内存大小（单位byte）
        public Process exec(String command) 	//运行cmd命令*/

        //源码
       /* private static final Runtime currentRuntime = new Runtime();

        private static Runtime.Version version;


        public static Runtime getRuntime() {
            return currentRuntime;
        private Runtime() {}
        */




        //1
        Runtime  r1 = Runtime.getRuntime();
        Runtime  r2 = Runtime.getRuntime();
        if(r1 == r2){
            System.out.println(true);
        }
        //2
        /*r1.exit(0);
        Runtime.getRuntime().exit(0);

        System.out.println("111");*/

        //3
        System.out.println(Runtime.getRuntime().availableProcessors());//24

        //4
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //5 已经获取的总内存大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //6 剩余内存的大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //7 cmd
        //shutdown
        //-s 默认在一分钟后关机
        // -s -t 指定时间关机
        //-a 取消关机操作
        //-r 关机加重启
        Runtime.getRuntime().exec("shutdown -a");
    }
}
