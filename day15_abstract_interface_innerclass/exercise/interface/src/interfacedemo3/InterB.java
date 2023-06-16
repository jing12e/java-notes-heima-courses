package interfacedemo3;

public interface InterB {
    public default void show(){
        System.out.println("interb接口中的默认方法");
    }
}
