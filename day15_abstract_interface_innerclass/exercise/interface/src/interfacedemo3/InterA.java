package interfacedemo3;

public interface InterA {

    public abstract void method();
    public default void show() {
        System.out.println("intera接口中的默认方法---show");
    }
}
