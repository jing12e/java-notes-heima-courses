public class Pingpangcoach extends Coach implements English{
    public Pingpangcoach(String name, int age) {
        super(name, age);
    }

    public Pingpangcoach() {
    }

    @Override
    public void teach() {
        System.out.println("teach Pingpang");
    }

    @Override
    public void english() {
        System.out.println("speak english");
    }
}
