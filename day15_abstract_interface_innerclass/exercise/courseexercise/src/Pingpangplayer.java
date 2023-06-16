public class Pingpangplayer extends Player implements English {
    public Pingpangplayer(String name, int age) {
        super(name, age);
    }

    public Pingpangplayer() {
    }

    @Override
    public void english() {
        System.out.println("speak english");
    }

    @Override
    public void study() {
        System.out.println("study pingpang");

    }
}
