/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Ducphi
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Account getAccount(String user, String pass) {
        String query = "select * from Account where [user] = ? and pass = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString("user"),
                        rs.getString("pass"));
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account rigisterAccount(String user, String pass) {
        String query = "insert into Account\n"
                + "values (?,?,0,0)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
            while (rs.next()) {
                Account a = new Account(rs.getInt("id"),
                        rs.getString("user"),
                        rs.getString("pass"),
                        rs.getString("isSell"),
                        rs.getString("isAdmin"));
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountExits(String user) {
        String query = "select * from Account where [user] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getInt("id"),
                        rs.getString("user"),
                        rs.getString("pass"),
                        rs.getString("isSell"),
                        rs.getString("isAdmin"));
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getAllProduct() {
        String query = "select * from product ";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("image"),
                        rs.getDouble("price"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getInt("sell_ID"),
                        rs.getInt("cateID")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductcID(String id) {
        String query = "select * from product where id =?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("image"),
                        rs.getDouble("price"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getInt("sell_ID"),
                        rs.getInt("cateID"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> searchProduct(String txtSearch) {
        String query = "select * from product where [name] like ?";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("image"),
                        rs.getDouble("price"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getInt("sell_ID"),
                        rs.getInt("cateID")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> pagingProduct(int index) {
        String query = "select * from product\n"
                + "order by id offset ? rows fetch next 5 rows only";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("image"),
                        rs.getDouble("price"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getInt("sell_ID"),
                        rs.getInt("cateID")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int getToTalProduct() {
        String query = "select count(*) from product";  
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> getProductInCateID(int cateID) {
        String query = "select * from product where cateID = ?";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cateID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("image"),
                        rs.getDouble("price"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getInt("sell_ID"),
                        rs.getInt("cateID")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductBySellID(int sellID) {
        String query = "select * from product where sell_ID = ?";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, sellID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("image"),
                        rs.getDouble("price"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getInt("sell_ID"),
                        rs.getInt("cateID")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deleteProduct(String id) {
        String query = "delete from product where id =?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editProduct(String name, String image, String price,
            String title, String description, String category, String pid) {
        String query = "update product\n"
                + "set [name] = ?,\n"
                + "[image] = ?,\n"
                + "price = ?,\n"
                + "title = ?,\n"
                + "[description] = ?,\n"
                + "cateID = ?\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, category);
            ps.setString(7, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void insertProduct(String name, String image, String price,
            String title, String description, String cateID) {
         String query = "INSERT [dbo].[product]\n"
            + "([name], [image], [price], [title], [description], [cateID], [sell_ID]) \n"
            + "VALUES(?,?,?,?,?,?,1)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, cateID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        DAO dao = new DAO();
        Account a = dao.rigisterAccount("demo","demo");
        System.out.println(a);
    }
}
