package mathdemo;

public class MathDemo3 {
    public static void main(String[] args) {
        /*int count = 0;

        for (int i = 100; i < 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            double sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if (i == sum) {
                count++;
                System.out.println(i);

            }

        }
        System.out.println(count);*/


        /*int count = 0;
        for (int i = 10; i < 99; i++) {
            int ge = i % 10;
            int shi = i / 10;
            double sum = Math.pow(ge,2) + Math.pow(shi,2);
            if (i == sum){
                count++;
            }

        }
        System.out.println(count);

    }*/

        int count = 0;
        for (int i = 1000; i < 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;
            double sum = Math.pow(ge,4) + Math.pow(shi,4) + Math.pow(bai,4) + Math.pow(qian,4);
            if (i == sum) {
                count++;
            }
        }
        System.out.println(count);

        }


}
