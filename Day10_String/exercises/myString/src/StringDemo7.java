public class StringDemo7 {
    public static void main(String[] args) {
        //定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
        int[] arr = {1,2,3};
        String str = arrToString(arr);
        System.out.println(str);
    }

    //遍历数组并把数组拼接成字符串
    //数组
    //返回一个拼接的字符串
    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        //表示数组不是null，也不是长度为0
        for (int i = 0; i < arr.length; i++) {
            //i索引，arr[i]元素
            if (i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ", ";
            }


        }
        return result + "]";

    }
}
