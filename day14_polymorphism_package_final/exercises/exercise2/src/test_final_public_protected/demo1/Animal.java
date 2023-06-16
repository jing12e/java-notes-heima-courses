package test_final_public_protected.demo1;

public class Animal {

    private String name;
    //private只能在本类里用

    String name1;
    //默认可以在同一个包中的其他类使用

    protected String name2;

    public  String name3;

    public void show() {
        System.out.println(name);
    }
}
