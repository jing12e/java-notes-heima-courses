## 1.Map集合

### 1.1Map集合概述和特点【理解】

- Map集合概述

  ```
  interface Map<K,V>  K：键的类型；V：值的类型
  ```
- Map集合的特点

  - 双列集合,一个键对应一个值
  - 键不可以重复,值可以重复
- Map集合的基本使用

  ```java
  public class MapDemo01 {
      public static void main(String[] args) {
          //创建集合对象
          Map<String,String> map = new HashMap<String,String>();

          //V put(K key, V value) 将指定的值与该映射中的指定键相关联
          map.put("itheima001","林青霞");
          map.put("itheima002","张曼玉");
          map.put("itheima003","王祖贤");
          map.put("itheima003","柳岩");

          //输出集合对象
          System.out.println(map);
      }
  }
  ```

### 1.2Map集合的基本功能【应用】

- 方法介绍


  | 方法名                              | 说明                                 |
  | ----------------------------------- | ------------------------------------ |
  | V   put(K key,V   value)            | 添加元素                             |
  | V   remove(Object key)              | 根据键删除键值对元素                 |
  | void   clear()                      | 移除所有的键值对元素                 |
  | boolean containsKey(Object key)     | 判断集合是否包含指定的键             |
  | boolean containsValue(Object value) | 判断集合是否包含指定的值             |
  | boolean isEmpty()                   | 判断集合是否为空                     |
  | int size()                          | 集合的长度，也就是集合中键值对的个数 |
- 示例代码

  ```java
  public class MapDemo02 {
      public static void main(String[] args) {
          //创建集合对象
          Map<String,String> map = new HashMap<String,String>();

          //V put(K key,V value)：添加元素
          map.put("张无忌","赵敏");
          map.put("郭靖","黄蓉");
          map.put("杨过","小龙女");

          //V remove(Object key)：根据键删除键值对元素
  //        System.out.println(map.remove("郭靖"));
  //        System.out.println(map.remove("郭襄"));

          //void clear()：移除所有的键值对元素
  //        map.clear();

          //boolean containsKey(Object key)：判断集合是否包含指定的键
  //        System.out.println(map.containsKey("郭靖"));
  //        System.out.println(map.containsKey("郭襄"));

          //boolean isEmpty()：判断集合是否为空
  //        System.out.println(map.isEmpty());

          //int size()：集合的长度，也就是集合中键值对的个数
          System.out.println(map.size());

          //输出集合对象
          System.out.println(map);
      }
  }
  ```

### 1.3Map集合的获取功能【应用】

- 方法介绍


  | 方法名                           | 说明                     |
  | -------------------------------- | ------------------------ |
  | V   get(Object key)              | 根据键获取值             |
  | Set<K>   keySet()                | 获取所有键的集合         |
  | Collection<V>   values()         | 获取所有值的集合         |
  | Set<Map.Entry<K,V>>   entrySet() | 获取所有键值对对象的集合 |
- 示例代码

  ```java
  public class MapDemo03 {
      public static void main(String[] args) {
          //创建集合对象
          Map<String, String> map = new HashMap<String, String>();

          //添加元素
          map.put("张无忌", "赵敏");
          map.put("郭靖", "黄蓉");
          map.put("杨过", "小龙女");

          //V get(Object key):根据键获取值
  //        System.out.println(map.get("张无忌"));
  //        System.out.println(map.get("张三丰"));

          //Set<K> keySet():获取所有键的集合
  //        Set<String> keySet = map.keySet();
  //        for(String key : keySet) {
  //            System.out.println(key);
  //        }

          //Collection<V> values():获取所有值的集合
          Collection<String> values = map.values();
          for(String value : values) {
              System.out.println(value);
          }
      }
  }
  ```

### 1.4Map集合的遍历(键找值)【应用】

- 遍历思路

  - 我们刚才存储的元素都是成对出现的，所以我们把Map看成是一个夫妻对的集合
    - 把所有的丈夫给集中起来
    - 遍历丈夫的集合，获取到每一个丈夫
    - 根据丈夫去找对应的妻子
- 步骤分析

  - 获取所有键的集合。用keySet()方法实现
  - 遍历键的集合，获取到每一个键。用增强for实现
  - 根据键去找值。用get(Object key)方法实现
- 代码实现

  ```java
  public class MapDemo01 {
      public static void main(String[] args) {
          //创建集合对象
          Map<String, String> map = new HashMap<String, String>();

          //添加元素
          map.put("张无忌", "赵敏");
          map.put("郭靖", "黄蓉");
          map.put("杨过", "小龙女");

          //获取所有键的集合。用keySet()方法实现
          Set<String> keySet = map.keySet();
          //遍历键的集合，获取到每一个键。用增强for实现
          for (String key : keySet) {
              //根据键去找值。用get(Object key)方法实现
              String value = map.get(key);
              System.out.println(key + "," + value);
          }
      }
  }
  ```

### 1.5Map集合的遍历(键值对)【应用】

- 遍历思路

  - 我们刚才存储的元素都是成对出现的，所以我们把Map看成是一个夫妻对的集合
    - 获取所有结婚证的集合
    - 遍历结婚证的集合，得到每一个结婚证
    - 根据结婚证获取丈夫和妻子
- 步骤分析

  - 获取所有键值对对象的集合
    - Set<Map.Entry<K,V>> entrySet()：获取所有键值对对象的集合
  - 遍历键值对对象的集合，得到每一个键值对对象
    - 用增强for实现，得到每一个Map.Entry
  - 根据键值对对象获取键和值
    - 用getKey()得到键
    - 用getValue()得到值
- 代码实现

  ```java
  public class MapDemo02 {
      public static void main(String[] args) {
          //创建集合对象
          Map<String, String> map = new HashMap<String, String>();

          //添加元素
          map.put("张无忌", "赵敏");
          map.put("郭靖", "黄蓉");
          map.put("杨过", "小龙女");

          //获取所有键值对对象的集合
          Set<Map.Entry<String, String>> entrySet = map.entrySet();
          //遍历键值对对象的集合，得到每一个键值对对象
          for (Map.Entry<String, String> me : entrySet) {
              //根据键值对对象获取键和值
              String key = me.getKey();
              String value = me.getValue();
              System.out.println(key + "," + value);
          }
      }
  }
  ```

### 1.6Map集合的遍历（Lambda表达式）
```java
public class A04_MapDemo4 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式


        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        //键：人物的名字
        //值：名人名言
        map.put("鲁迅","这句话是我说的");
        map.put("曹操","不可能绝对不可能");
        map.put("刘备","接着奏乐接着舞");
        map.put("柯镇恶","看我眼色行事");

        //3.利用lambda表达式进行遍历
        //底层：
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //再调用accept方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        System.out.println("-----------------------------------");

        map.forEach((String key, String value)->{
                System.out.println(key + "=" + value);
            }
        );

        System.out.println("-----------------------------------");

        map.forEach((key, value)-> System.out.println(key + "=" + value));


    }
}
```

## 2.HashMap集合

### 2.1HashMap集合概述和特点【理解】

- HashMap是Map里面的一个实现类
- 没有额外需要学习的特有方法，直接使用Map里面的方法就可以了
- 特点都是由**键**决定的：**无序，不重复，无索引**
- put方法隐藏的覆盖功能：调用equals方法，如果键的属性值相同，直接覆盖（与hashSet不同，hashSet是直接丢掉不存入

+ HashMap底层是哈希表结构的
+ 依赖hashCode方法和equals方法保证键的唯一
+ 如果键要存储的是自定义对象，需要重写hashCode和equals方法

### 2.2HashMap集合应用案例【应用】

- 案例需求

  - 创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个元素，并遍历。
  - 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
- 代码实现

  学生类

```java
public class Student {
  private String name;
  private int age;


  public Student() {
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  
  public void setName(String name) {
    this.name = name;
  }

 
  public int getAge() {
    return age;
  }

  
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return age == student.age && Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    //return Objects.hash(name, age);
    return name.hashCode();
  }

  public String toString() {
    return "Student{name = " + name + ", age = " + age + "}";
  }
}


```

  测试类

```java
public class A01_HashMapDemo1 {
  public static void main(String[] args) {
       /*
        需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        存储三个键值对元素，并遍历
        要求：同姓名，同年龄认为是同一个学生

        核心点：
            HashMap的键位置如果存储的是自定义对象，需要重写hashCode和equals方法。
       */


    //1.创建HashMap的对象
    HashMap<Student,String> hm = new HashMap<>();

    //2.创建三个学生对象
    Student s1 = new Student("zhangsan",23);
    Student s2 = new Student("lisi",24);
    Student s3 = new Student("wangwu",25);
    Student s4 = new Student("wangwu",25);

    //3.添加元素
    hm.put(s1,"江苏");
    hm.put(s2,"浙江");
    hm.put(s3,"福建");
    hm.put(s4,"山东");

    //4.遍历集合
    Set<Student> keys = hm.keySet();
    for (Student key : keys) {
      String value = hm.get(key);
      System.out.println(key + "=" + value);
    }

    System.out.println("--------------------------");

    Set<Map.Entry<Student, String>> entries = hm.entrySet();
    for (Map.Entry<Student, String> entry : entries) {
      Student key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + "=" + value);
    }

    System.out.println("--------------------------");

    hm.forEach((student, s)-> System.out.println(student + "=" +  s));

  }
}
```
  


练习2
```java
public class A02_HashMapDemo2 {
    public static void main(String[] args) {
        /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */
        //1.需要先让同学们投票
        //定义一个数组，存储4个景点
        String[] arr = {"A","B","C","D"};
        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        //2.如果要统计的东西比较多，不方便使用计数器思想
        //我们可以定义map集合，利用集合进行统计。
        HashMap<String,Integer> hm = new HashMap<>();
        for (String name : list) {
            //判断当前的景点在map集合当中是否存在
            if(hm.containsKey(name)){
                //存在
                //先获取当前景点已经被投票的次数
                int count = hm.get(name);
                //表示当前景点又被投了一次
                count++;
                //把新的次数再次添加到集合当中
                hm.put(name,count);
            }else{
                //不存在
                hm.put(name,1);
            }
        }

        System.out.println(hm);

        //3.求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count > max){
                max = count;
            }
        }
        System.out.println(max);
        //4.判断哪个景点的次数跟最大值一样，如果一样，打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count == max){
                System.out.println(entry.getKey());
            }
        }



    }
}
```

## 3.LinkedHashMap
- 由键决定的，**有序，不重复，无索引**
- 这里的有序指的是保证存储和取出元素顺序一致
- 原理：底层数据结构是哈希表，只是每个键值对元素又额外的多了一个双链表的机制，用来记录存储的数据
- 可以保证键的唯一
- 覆盖：`put()`

```java
public class A01_LinkedHashMapDemo1 {
    public static void main(String[] args) {
        /*
           LinkedHashMap:
               由键决定：
                   有序、不重复、无索引。
               有序：
                   保证存储和取出的顺序一致
               原理：
                   底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。
         */



        //1.创建集合
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        //2.添加元素
        lhm.put("c",789);
        lhm.put("b",456);
        lhm.put("a",123);
        lhm.put("a",111);

        //3.打印集合
        System.out.println(lhm);
        
    }
}
```
## 4.TreeMap集合

### 4.1TreeMap集合概述和特点【理解】

+ TreeMap和TreeSet一样，底层是红黑树结构
+ 由键决定特性：不重复，无索引，可排序
+ 可排序：对键进行排序
+ 注意：默认按照键从小到大进行排序，也可以自己规定键的排序规则
+ 如果键存储的是自定义对象,需要**实现Comparable接口**或者在创建TreeMap对象时候**传递Comparator比较器对象，指定排序规则**

### 4.2TreeMap集合应用案例【应用】

**练习1**
  - 键：整数表示id
  - 值：字符串表示商品名称
  - 要求1：按照id的升序排列
  - 要求2：按照id的降序排列
```java
public class A01_TreeMapDemo1 {
    public static void main(String[] args) {
        /*
           TreeMap集合：基本应用
            需求1：
                键：整数表示id
	            值：字符串表示商品名称
	            要求1：按照id的升序排列

	            要求2：按照id的降序排列
         */

        //1.创建集合对象
        //Integer Double 默认情况下都是按照升序排列的
        //String 按照字母再ASCII码表中对应的数字升序进行排列
        //abcdefg ...
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:当前要添加的元素
                //o2：表示已经在红黑树中存在的元素
                return o2 - o1;
            }
        });

        //2.添加元素
        tm.put(5,"可恰可乐");
        tm.put(4,"雷碧");
        tm.put(3,"九个核桃");
        tm.put(2,"康帅傅");
        tm.put(1,"粤利粤");

        //3.打印集合
        System.out.println(tm);
        
    }
}
```

**练习2: 自定义对象**

- 测试类

```java
public class A02_TreeMapDemo2 {
    public static void main(String[] args) {
        /*
           TreeMap集合：基本应用
            需求2：
                键：学生对象
	            值：籍贯
	            要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
         */


        //1.创建集合
        TreeMap<Student,String> tm = new TreeMap<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        //3.添加元素
        tm.put(s1,"江苏");
        tm.put(s2,"天津");
        tm.put(s3,"北京");

        //4.打印集合
        System.out.println(tm);
        
    }
}
```

- Student类

```java
public class Student implements Comparable<Student>{
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public String getName() {
        return name;
    }

 
    public void setName(String name) {
        this.name = name;
    }

  
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        //按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。

        //this：表示当前要添加的元素
        //o：表示已经在红黑树中存在的元素

        //返回值：
        //负数：表示当前要添加的元素是小的，存左边
        //正数：表示当前要添加的元素是大的，存右边
        //0：表示当前要添加的元素已经存在，舍弃

        int i = this.getAge() - o.getAge();
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}

```

**练习3 统计个数**  
新的统计思想：利用map集合进行统计  
如果题目中没有要求对结果进行排序，默认使用HashMap  
如果题目中要求对结果进行排序，请使用TreeMap  
键：表示要统计的内容  
值：表示次数  

```java
public class A03_TreeMapDemo3 {
    public static void main(String[] args) {
       /* 需求：
        字符串“aababcabcdabcde”
        请统计字符串中每一个字符出现的次数，并按照以下格式输出
        输出结果：
        a（5）b（4）c（3）d（2）e（1）

            新的统计思想：利用map集合进行统计

          如果题目中没有要求对结果进行排序，默认使用HashMap
          如果题目中要求对结果进行排序，请使用TreeMap

          键：表示要统计的内容
          值：表示次数

        */


        //1.定义字符串
        String s = "aababcabcdabcde";

        //2.创建集合
        TreeMap<Character,Integer> tm = new TreeMap<>();

        //3.遍历字符串得到里面的每一个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //拿着c到集合中判断是否存在
            //存在，表示当前字符又出现了一次
            //不存在，表示当前字符是第一次出现
            if(tm.containsKey(c)){
                //存在
                //先把已经出现的次数拿出来
                int count = tm.get(c);
                //当前字符又出现了一次
                count++;
                //把自增之后的结果再添加到集合当中
                tm.put(c,count);
            }else{
                //不存在
                tm.put(c,1);
            }
        }

        //4.遍历集合，并按照指定的格式进行拼接
        // a（5）b（4）c（3）d（2）e（1）
        //StringBuilder sb = new StringBuilder();
        //tm.forEach((key, value)->sb.append(key).append("(").append(value).append(")"));

        StringJoiner sj = new StringJoiner("","","");
        tm.forEach((key, value)->sj.add(key + "").add("(").add(value + "").add(")"));

        System.out.println(sj);


    }
}
```

## 5.对比
- HashMap： 无序，不重复，无索引；哈希表
- LinkedHashMap： 有序，不重复，无索引；哈希表+双链表
- TreeMap： 可排序，不重复，无索引；红黑树


## 6. 可变参数

在**JDK1.5**之后，如果我们定义一个方法需要接受多个参数，并且多个参数类型一致，我们可以对其简化.

**格式：**

```
修饰符 返回值类型 方法名(参数类型... 形参名){  }
```

**底层：**

```
其实就是一个数组
```


**好处：**

```
在传递数据的时候，省的我们自己创建数组并添加元素了，JDK底层帮我们自动创建数组并添加元素了
```


**代码演示:**

```java
  public class ChangeArgs {
    public static void main(String[] args) {
        int sum = getSum(6, 7, 2, 12, 2121);
        System.out.println(sum);
    }
  
    public static int getSum(int... arr) {
   		int sum = 0;
   	     for (int a : arr) {
         sum += a;
        }
   		 return sum;
    }
}
```

**注意：**


1. 一个方法只能有一个可变参数
2. 如果方法中有多个参数，可变参数要放到最后。



**应用场景: Collections**


在Collections中也提供了添加一些元素方法：

`public static <T> boolean addAll(Collection<T> c, T... elements)  `:往集合中添加一些元素。

**代码演示:**

```java
public class CollectionsDemo {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //原来写法
        //list.add(12);
        //list.add(14);
        //list.add(15);
        //list.add(1000);
        //采用工具类 完成 往集合中添加元素  
        Collections.addAll(list, 5, 222, 1, 2);
        System.out.println(list);
    }
}
```

## 7. Collections类

### 7.1 Collections常用功能
- `java.utils.Collections`是集合工具类，用来对集合进行操作。

- 在Collections中也提供了添加一些元素方法：

`public static <T> boolean addAll(Collection<T> c, T... elements)  `:往集合中添加一些元素。

**代码演示:**

```java
public class CollectionsDemo {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //原来写法
        //list.add(12);
        //list.add(14);
        //list.add(15);
        //list.add(1000);
        //采用工具类 完成 往集合中添加元素  
        Collections.addAll(list, 5, 222, 1, 2);
        System.out.println(list);
    }
}
```



  常用方法如下：
- `public static void shuffle(List<?> list) `:打乱集合顺序。
- `public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
- `public static <T> void sort(List<T> list，Comparator<? super T> )`:将集合中元素按照指定规则排序。

代码演示：

```java
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
   
        list.add(100);
        list.add(300);
        list.add(200);
        list.add(50);
        //排序方法 
        Collections.sort(list);
        System.out.println(list);
    }
}
//结果：
//[50,100, 200, 300]
```
一些其他方法：
```java
public class CollectionsDemo2 {
    public static void main(String[] args) {
      /*
        public static <T> void sort(List<T> list)                       排序
        public static <T> void sort(List<T> list, Comparator<T> c)      根据指定的规则进行排序
        public static <T> int binarySearch (List<T> list,  T key)       以二分查找法查找元素
        public static <T> void copy(List<T> dest, List<T> src)          拷贝集合中的元素
        public static <T> int fill (List<T> list,  T obj)               使用指定的元素填充集合
        public static <T> void max/min(Collection<T> coll)              根据默认的自然排序获取最大/小值
        public static <T> void swap(List<?> list, int i, int j)         交换集合中指定位置的元素
     */


        System.out.println("-------------sort默认规则--------------------------");
        //默认规则，需要重写Comparable接口compareTo方法。Integer已经实现，按照从小打大的顺序排列
        //如果是自定义对象，需要自己指定规则
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 10, 1, 2, 4, 8, 5, 9, 6, 7, 3);
        Collections.sort(list1);
        System.out.println(list1);


        System.out.println("-------------sort自己指定规则规则--------------------------");
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list1);

        Collections.sort(list1, (o1, o2) -> o2 - o1);
        System.out.println(list1);

        System.out.println("-------------binarySearch--------------------------");
        //需要元素有序
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.binarySearch(list2, 9));//8
        System.out.println(Collections.binarySearch(list2, 1));//0
        System.out.println(Collections.binarySearch(list2, 20));//-11

        System.out.println("-------------copy--------------------------");
        //把list3中的元素拷贝到list4中
        //会覆盖原来的元素
        //注意点：如果list3的长度 > list4的长度，方法会报错
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(list4, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        Collections.copy(list4, list3);
        System.out.println(list3);
        System.out.println(list4);

        System.out.println("-------------fill--------------------------");
        //把集合中现有的所有数据，都修改为指定数据
        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.fill(list5, 100);
        System.out.println(list5);
        //[100, 100, 100, 100, 100, 100, 100, 100, 100, 100]

        System.out.println("-------------max/min--------------------------");
        //求最大值或者最小值
        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.max(list6));
        System.out.println(Collections.min(list6));

        System.out.println("-------------max/min指定规则--------------------------");
        // String中默认是按照字母的abcdefg顺序进行排列的
        // 现在我要求最长的字符串
        // 默认的规则无法满足，可以自己指定规则
        // 求指定规则的最大值或者最小值
        ArrayList<String> list7 = new ArrayList<>();
        Collections.addAll(list7, "a","aa","aaa","aaaa");
        System.out.println(Collections.max(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }));
        System.out.println(Collections.max(list7, Comparator.comparingInt(String::length)));
        System.out.println(Collections.max(list7,(o1, o2) -> o1.length()-o2.length()));

        System.out.println("-------------swap--------------------------");
        ArrayList<Integer> list8 = new ArrayList<>();
        Collections.addAll(list8, 1, 2, 3);
        Collections.swap(list8,0,2);
        System.out.println(list8);
        //[3, 2, 1]
        
    }
}

```
我们的集合按照默认的自然顺序进行了排列，如果想要指定顺序那该怎么办呢？

### 7.2 Comparator比较器指定排序规则

创建一个学生类，存储到ArrayList集合中完成指定排序操作。

Student 类

```java
public class Student{
    private String name;
    private int age;
	//构造方法
    //get/set
 	//toString
}
```

测试类：

```java
public class Demo {
    public static void main(String[] args) {
        // 创建四个学生对象 存储到集合中
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("rose",18));
        list.add(new Student("jack",16));
        list.add(new Student("abc",20));
		Collections.sort(list, new Comparator<Student>() {
  		  @Override
    		public int compare(Student o1, Student o2) {
        	return o1.getAge()-o2.getAge();//以学生的年龄升序
   		 }
		});


        for (Student student : list) {
            System.out.println(student);
        }
    }
}
//Student{name='jack', age=16}
//Student{name='rose', age=18}
//Student{name='abc', age=20}
```



## 8.不可变集合

### 8.1 什么是不可变集合

是一个长度不可变，内容也无法修改的集合

### 8.2 使用场景

如果某个数据不能被修改，把它防御性地拷贝到不可变集合中是个很好的实践。

当集合对象被不可信的库调用时，不可变形式是安全的。

简单理解：

不想让别人修改集合中的内容

比如说：

1. 斗地主的54张牌，是不能添加，不能删除，不能修改的
2. 斗地主的打牌规则：单张，对子，三张，顺子等，也是不能修改的
3. 用代码获取的操作系统硬件信息，也是不能被修改的

### 8.3 不可变集合分类

* 不可变的list集合
* 不可变的set集合
* 不可变的map集合

### 8.4 不可变的list集合

```java
public class ImmutableDemo1 {
    public static void main(String[] args) {
        /*
            创建不可变的List集合
            "张三", "李四", "王五", "赵六"
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        List<String> list = List.of("张三", "李四", "王五", "赵六");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("---------------------------");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------");


        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("---------------------------");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("---------------------------");

        //list.remove("李四");
        //list.add("aaa");
        list.set(0,"aaa");
    }
}
```

### 8.5 不可变的Set集合

```java
public class ImmutableDemo2 {
    public static void main(String[] args) {
        /*
           创建不可变的Set集合
           "张三", "李四", "王五", "赵六"


           细节：
                当我们要获取一个不可变的Set集合时，里面的参数一定要保证唯一性
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Set<String> set = Set.of("张三", "张三", "李四", "王五", "赵六");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("-----------------------");
        //set.remove("王五");
    }
}
```

### 8.6 不可变的Map集合

#### 8.6.1 键值对个数小于等于10

```java
public class ImmutableDemo3 {
    public static void main(String[] args) {
       /*
        创建Map的不可变集合
            细节1：
                键是不能重复的
            细节2：
                Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
            细节3：
                如果我们要传递多个键值对对象，数量大于10个，在Map接口中还有一个方法
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Map<String, String> map = Map.of("张三", "南京", "张三", "北京", "王五", "上海",
                "赵六", "广州", "孙七", "深圳", "周八", "杭州",
                "吴九", "宁波", "郑十", "苏州", "刘一", "无锡",
                "陈二", "嘉兴");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("--------------------------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("--------------------------");
    }
}
```

#### 8.6.2 键值对个数大于10

```java
public class ImmutableDemo4 {
    public static void main(String[] args) {

        /*
            创建Map的不可变集合,键值对的数量超过10个
        */

        //1.创建一个普通的Map集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "南京");
        hm.put("李四", "北京");
        hm.put("王五", "上海");
        hm.put("赵六", "北京");
        hm.put("孙七", "深圳");
        hm.put("周八", "杭州");
        hm.put("吴九", "宁波");
        hm.put("郑十", "苏州");
        hm.put("刘一", "无锡");
        hm.put("陈二", "嘉兴");
        hm.put("aaa", "111");

        //2.利用上面的数据来获取一个不可变的集合
/*
        //获取到所有的键值对对象（Entry对象）
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度 > 数组的长度 ：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        //如果集合的长度 <= 数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用
        Map.Entry[] arr2 = entries.toArray(arr1);
        //不可变的map集合
        Map map = Map.ofEntries(arr2);
        map.put("bbb","222");*/


        //Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

        Map<String, String> map = Map.copyOf(hm);
        map.put("bbb","222");
    }
}
```

