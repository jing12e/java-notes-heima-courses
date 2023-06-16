public class LanqiuCoach extends Coach {
    public LanqiuCoach(String name, int age) {
        super(name, age);
    }

    public LanqiuCoach() {
    }

    @Override
    public void teach() {
        System.out.println("teach lanqiu");
    }
}
