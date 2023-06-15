

public class Child extends Parent{

    public String name = "Child";
    public String childName = "childName";
    public static String staticName = "staticName";
    public static void main(String[] args) {
        Child child = new Child();
    }
    public Child(){
        System.out.println("Child构造函数");
        System.out.println("name:"+name);
        System.out.println("childName:"+childName);
        print();
    }
    public void print(){
        System.out.println("Child的print方法中的name:"+name);
    }
}


class OldParent {
    public String name = "OldParent";
    public String oldParentName = "oldParentName";
    public OldParent(){
        System.out.println("OldParent构造函数");
        System.out.println("name:"+name);
        System.out.println("oldParentName:"+oldParentName);
        print();
    }
    public void print(){
        System.out.println("OldParent的print方法中的name:"+name);
    }
}


class Parent extends OldParent{
    public String name = "Parent";
    public String parentName = "parentName";
    public Parent(){
        System.out.println("Parent构造函数");
        System.out.println("name:"+name);
        System.out.println("parentName:"+parentName);
        print();
    }
    public void print(){
        System.out.println("Parent的print方法中的name:"+name);
    }
}