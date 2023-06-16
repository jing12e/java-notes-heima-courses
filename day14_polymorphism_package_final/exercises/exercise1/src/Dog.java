public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println(this.getAge() + "岁的"+ getColor() + "颜色的狗两只前腿死死的抱住" + food + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}
