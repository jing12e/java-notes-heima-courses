public abstract class Person {
    //不想让外界直接去创建person的对象
    //因为直接创建顶层父类person的对象此时是没有意义的
    //所以写成抽象类
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
