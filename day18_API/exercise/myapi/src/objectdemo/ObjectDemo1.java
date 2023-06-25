package objectdemo;




public class ObjectDemo1 {
    /*public String toString()				//返回该对象的字符串表示形式(可以看做是对象的内存地址值)
    public boolean equals(Object obj)		//比较两个对象地址值是否相等；true表示相同，false表示不相同
    protected Object clone()    			//对象克隆*/




    public static void main(String[] args) {
        //1 toString
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1); //java.lang.Object@776ec8df

        Student stu = new Student();
        String str2 = stu.toString();
        System.out.println(str2);//objectdemo.Student@3b07d329

        //细节
        //当我们打印一个对象的时候，底层会调用对象的tostring方法，把对象变成字符串
        //然后再打印在控制台，打印完毕换行处理
        System.out.println(stu);//objectdemo.Student@3b07d329
        //默认情况下，object类中的tostring方法返回的是地址值
        //所以，默认情况下，打印一个对象打印的就是地址值

        //重写后
        //Student{name='null', age=0}

        //结论
        //如果我们打印一个对象，想要看到属性值的话，重写tostring方法就可以
        //在重写的方法中，把对象的属性值进行拼接

    }


}
