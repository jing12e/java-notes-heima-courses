package interfacedemo3;
//实现多个接口。要重写接口中所有的抽象方法
//如果两个接口中有重名的方法，只用重写其中一个就可以
public class InterImpl implements Inter1,Inter2{

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    @Override
    public void method4() {
        System.out.println("method4");
    }
}
