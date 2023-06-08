public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        int len = sb.length();
        System.out.println(len);
    }
}
