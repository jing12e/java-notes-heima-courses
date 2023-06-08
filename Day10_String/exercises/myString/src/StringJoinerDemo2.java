import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        sj.add("aaa").add("bbb").add("ccc");
        sj.length();
        //最终效果的字符的个数
        System.out.println(sj.length());
        System.out.println(sj);

        String string = sj.toString();
        System.out.println(string);
    }
}
