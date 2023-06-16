public class TTT {

        public static void main(String[] args) {
                Pingpangplayer pingpangplayer = new Pingpangplayer("ZHANGSAN", 25);
                pingpangplayer.study();
                pingpangplayer.english();
                Pingpangcoach pingpangcoach = new Pingpangcoach("san", 55);
                pingpangcoach.english();
                pingpangcoach.teach();

                Lanqiuplayer lanqiuplayer = new Lanqiuplayer("ZZZ", 11);
                lanqiuplayer.study();
                LanqiuCoach lanqiuCoach = new LanqiuCoach("jjj", 222);
                lanqiuCoach.teach();
                //Person person = new Person();
                //抽象类不能被实例化

        }
}
