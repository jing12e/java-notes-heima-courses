package interfacedemo3;

public class Test {
//    - 允许接口中定义默认方法，需要使用关键字default修饰：解决接口升级问题
//
//            接口中默认方法的定义格式
//```public default void show() { }```
//
//    接口中默认方法的注意事项：
//            - 默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字
//- public可以省略，default不能省略
//- 如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法重写

    public static void main(String[] args) {
        InterImpl inter = new InterImpl();
        inter.method();
        inter.show();
    }


}
