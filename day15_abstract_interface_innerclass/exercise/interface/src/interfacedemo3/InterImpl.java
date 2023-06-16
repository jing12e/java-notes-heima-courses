package interfacedemo3;

public class InterImpl implements InterA,InterB {
    @Override
    public void method() {
        System.out.println("实现类重写了抽象方法");
    }


    //不可以加default
    @Override
    public void show() {
        System.out.println("重写接口中的默认方法");
    }
}
