public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");
        System.out.println(sb);

        //把string builder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
