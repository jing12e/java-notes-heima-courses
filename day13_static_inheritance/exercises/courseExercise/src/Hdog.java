public class Hdog extends Dog {
    public Hdog() {
        super();
    }

    public Hdog(int age, int name) {
        super(age, name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("kkk");
        System.out.println(name);

    }




}
