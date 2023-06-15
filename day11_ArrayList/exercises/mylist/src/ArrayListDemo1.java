import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合的对象
        //泛型：限定集合中存储数据的类型
        //jdk7以前:
        // ArrayList<String> list = new ArrayList<String>();
        // 只能存字符串
        ArrayList<String> list = new ArrayList<>();


        //2.添加元素
        //boolean result = list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        //3.删除元素
        list.remove("aaa");
        System.out.println(list);


        String str = list.remove(0);
        System.out.println(str);
        //返回的是被删除的对象
        System.out.println(list); //[]

        //4.修改元素
        String result = list.set(1, "ddd");
        System.out.println(result);
        //返回被覆盖的元素
        System.out.println(list);

        //5.查询
        String s = list.get(0);
        System.out.println(s);

        //6. 获取长度,int size(),方法,list.fori
        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            System.out.println(s1);

        }

    }

}