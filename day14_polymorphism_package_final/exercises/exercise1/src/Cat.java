public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁" + getColor() + "颜色的猫眯着眼睛侧着头吃" + food);
    }

    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }
}
