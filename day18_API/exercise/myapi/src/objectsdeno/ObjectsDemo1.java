package objectsdeno;

import objectdemo.Student;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        Student stu1 = null;
        Student stu2 = new Student("zhangsan", 25);
        /*if (stu1 != null) {
            boolean result = stu1.equals(stu2);
            System.out.println(result);

        }else {
            System.out.println(false);
        }*/

        boolean result = Objects.equals(stu1,stu2);
        System.out.println(result);

        //源码
        /*public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }*/

        //细节
        //1. 方法底层会判断stu1是否为null
        //2. 如果stu1不为null，就利用stu1再次调用equals方法
        //3. 此时stu1是student类型的，所以最终还是会调用student类中的equals方法

        Student student3 = new Student();
        Student student4 = null;
        System.out.println(Objects.isNull(student4));
        System.out.println(Objects.isNull(student3));



    }
}
