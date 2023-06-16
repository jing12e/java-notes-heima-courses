package abstractdemo1;

public abstract class Person {

    private int age;
    private String name;

    //作用：当创建子类对象时，给属性进行赋值的
    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void work();
    public void sleep() {
        System.out.println("sleep");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
