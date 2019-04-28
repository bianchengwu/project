package cn.dao;

import cnn.Product;
import wwyl.wwyi;

import java.sql.Connection;
import java.sql.PreparedStatement;
public class ProdDao {
    public static void main(String[] args) {
        ProdDao dao = new ProdDao();
        Product product=new Product();
        product.setId(1);
        product.setName("小米手机");
        product.setPrice(2999);
        product.setRemark("手机介绍");
        dao.update(Product);

    }

    public void delete(int id) {
        String sql = "delete from product where id=?";
        Connection con = wwyi.getConnection();
        //通过connection对象生成ProparedStatement对象，此对象用来接受SQL语句
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            //配置对象参数
            pre.setInt(1, id);
            //执行最后的SQL语句
            pre.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void update(Product product) {
        String sql = "update product set name=?,price=?,remark=? where id=?";
        Connection con = wwyi.getConnection();
        //通过connection对象生成ProparedStatement对象，此对象用来接受SQL语句
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            //配置对象参数
            pre.setString(1,product.getName());
            pre.setDouble(2,product.getPrice());
            pre.setString(3,product.getRemark());
            pre.setInt(4, id);
            //执行最后的SQL语句
            pre.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //获取数据库的连接对象（Connection当前java项目与数据库进行连接）
    public void save(String name, double price, String remark) {
        String sql = "insert into product (name,price,remark)values(?,?,?)";
        Connection con = wwyi.getConnection();
        //通过connection对象生成ProparedStatement对象，此对象用来接受SQL语句
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            //配置对象参数
            pre.setString(1, name);
            pre.setDouble(2, price);
            pre.setString(3, remark);
            //执行最后的SQL语句
            pre.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
