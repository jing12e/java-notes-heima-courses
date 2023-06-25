package objectdemo;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(s.equals(sb));//false
        //因为equals方法是被s调用的，而s是字符串
        //所以equals要看string类中的equals方法
        //string类中的equals方法，先判断参数是否为字符串，如果是字符串，再判断内部属性
        //sb参数不是字符串，所以返回false
        System.out.println(sb.equals(s));//false
        //因为equals方法是sb调用的，而sb是stringbuilder
        //那么在string builder中，没有重写equals方法
        //使用的是object中的
        //在object当中默认的是使用==比较两个对象的地址值
        //s和sb记录的地址值不同



    }
}
