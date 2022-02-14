package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Product;
import model.Sale;
import model.User;
import useful.Several;

public class DaoUseful {
    
    public boolean validateUser(User user) {
        boolean result = true;
        String inst = "select * from User where login = ? and password = ?;";
        ResultSet rS;
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setString(1, user.getLogin());
                pS.setString(2, user.getPassword());
                rS = pS.executeQuery();
                if (!rS.next()) 
                    result = false;
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }
    
    public Object readUserLogin(String login) {
        String inst = "select * from User where login = ?;";
        User u = null;
        ResultSet rS;
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setString(1, login);
                rS = pS.executeQuery();
                if (rS.next()) {
                    u = new User();
                    u.setCode(rS.getInt(1));
                    u.setName(rS.getString(2));
                    u.setLogin(rS.getString(3));
                    u.setPassword(rS.getString(4));
                }
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (u);
    }
    
    public int create(Object o) {
        int result = 0;
        Sale s = (Sale) o;
        String inst = "insert into Sale(date, value, discount) values(?,?,?);";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setDate(1, Several.dateConvert(s.getDate()));
                pS.setFloat(2, s.getValue());
                pS.setInt(3, s.getDiscount());
                result = pS.executeUpdate();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }
    
    public Object readProductDescription(String description) {
        String inst = "select * from Product where description = ?;";
        Product p = null;
        ResultSet rS;
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setString(1, description);
                rS = pS.executeQuery();
                if (rS.next()) {
                    p = new Product();
                    p.setCode(rS.getInt(1));
                    p.setDescription(rS.getString(2));
                    p.setValue(rS.getFloat(3));
                }
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (p);
    }
}