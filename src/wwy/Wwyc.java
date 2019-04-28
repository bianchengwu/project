package wwy;
//先有类，才有对象
public class Wwyc {

    //类中有属性和方法
    //private代表私有的方法，属性 只能在当前类中使用
    //属性一般public，而方法公共的
    private String name;
    //类的属性一般没有值
    private int age;
    //static是类方法，不用创建对象直接调用
    public static void demo(String name){
        System.out.println("name:"+name);
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
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
        //属性可以生成set和get
        //set开头的方法，都是有参无返
        //get开后的方法
        //编写一个方法 void代表没有返回值
        public void show () {
            //此方法仅仅用来对属性的打印输出
            //不同的对象都会调用此方法，this代表当前调用的对象
            System.out.println("姓名为:" + this.name + "年龄为:" + this.age);
        }
    }
