package objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        /*
        public boolean equals(Object obj)		//比较两个对象地址值是否相等；true表示相同，false表示不相同
        */
        Student student1 = new Student("zhangsan", 23);
        Student student2 = new Student("zhangsan", 23);
        boolean result = student1.equals(student2);
        System.out.println(result);//false
        //比较的是对象的地址值

        //重写
        //true

        //1.没有重写：默认使用object中的，比较的是地址值
        //2.一把地址值意义不大，需要重写，比较属性值

    }
}
