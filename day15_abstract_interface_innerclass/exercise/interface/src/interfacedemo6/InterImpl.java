package interfacedemo6;

public class InterImpl extends InterAdapter {
    //需要用到哪个方法就重写哪个方法

    @Override
    public void method5() {
        System.out.println("只要重写一个method5就可以了");
    }
}
