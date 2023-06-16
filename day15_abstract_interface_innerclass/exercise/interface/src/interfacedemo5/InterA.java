package interfacedemo5;

public interface InterA {
    public default void show1(){
        System.out.println("intera接口中的默认方法show1");
        method1();

    }

    public static void show2(){
        //静态方法只能调用静态成员
        System.out.println("intera接口中的默认方法show2");
        method2();

    }

    private void method1() {
        System.out.println("intera接口中默认的私有方法");
    }

    private static void method2() {
        System.out.println("intera接口中静态的私有方法");
    }
}
