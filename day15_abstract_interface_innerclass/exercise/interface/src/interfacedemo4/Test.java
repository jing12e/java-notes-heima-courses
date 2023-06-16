package interfacedemo4;
//```public static void show() { }```
//        - 静态方法只能使用接口名调用，不能通过实现类名或者对象名调用
//        - public可以省略，static不能省略
//        - 静态方法不能被重写
public class Test {
    public static void main(String[] args) {
        //调用接口中的静态方法
        Inter.show();
        //调用实现类中的静态方法
        InterImpl.show();


    }
}
