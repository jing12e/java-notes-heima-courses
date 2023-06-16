package abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //Person p = new Person(); 报错，抽象类不能创建对象

        Student s = new Student(11, "zhangsan");
        System.out.println(s.getAge() + s.getName());;
    }
}
