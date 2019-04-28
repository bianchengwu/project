import wwy.Wwyc;

public class Main {

    public static void main(String[] args) {
        Wwyc p1=new Wwyc();//创建一个对象
        //给对象的属性赋值'.'代表
        p1.setName("张三");
        p1.setAge(18);
        p1.show();

        Wwyc p2=new Wwyc();//创建一个对象
        //给对象的属性赋值'.'代表
        p2.setName("李四");
        p2.setAge(20);
        p2.show();
        Wwyc.demo("李四");
    }
}
