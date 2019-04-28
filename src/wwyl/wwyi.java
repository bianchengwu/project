package wwyl;


import java.sql.Connection;
import java.sql.DriverManager;

//此类用来完成数据库连接操作
public class wwyi {
    public static void main(String[] args){
        Connection conn=wwyi.getConnection();

                    System.out.println(conn);
    }
    //加载数据库驱动文件
    //配置连接数据库4参数
    //返回一个连接对象

    public static Connection getConnection(){
        //加载驱动中的driver类mysql驱动的入口
        try {
            //try里面的代码有错误，将会终止后面的代码，直接跳转到catch
            Class.forName("com.mysql.jdbc.Driver");
           return  DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/demo","root","root");
                    //驱动管理类，通过此类设置账号，密码，url地址并且返回connection对象
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
