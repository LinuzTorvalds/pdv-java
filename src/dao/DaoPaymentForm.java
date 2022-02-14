package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.PaymentForm;

public class DaoPaymentForm implements DaoBasic {

    public DaoPaymentForm() {
        String inst = "create table if not exists PaymentForm("
                + "code serial auto_increment"
                + ",descripition varchar(255)"
                + ",discount float(10,2)"
                + ",parcelas int"
                + ",situation int"
                + ",primary key(code));";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }   
    
    @Override
    public boolean create(Object o) {
        boolean result = true;
        PaymentForm p = (PaymentForm) o;
        String inst = "insert into PaymentForm(description, discount, parcelas, situation) values(?,?,?,?);";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setString(1, p.getDescription());
                pS.setFloat(2, p.getDiscount());
                pS.setInt(3, p.getParcelas());
                pS.setInt(4, p.getSituation());
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            result = false;
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }

    @Override
    public boolean update(Object o) {
        boolean result = true;
        PaymentForm p = (PaymentForm) o;
        String inst = "update PaymentForm set description = ?, discount = ?, parcelas = ?, situation = ? where code = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setString(1, p.getDescription());
                pS.setFloat(2, p.getDiscount());
                pS.setInt(3, p.getParcelas());
                pS.setInt(4, p.getSituation());
                pS.setInt(5, p.getCode());
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            result = false;
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }

    @Override
    public boolean delete(Object o) {
        boolean result = true;
        PaymentForm p = (PaymentForm) o;
        String inst = "delete from PaymentForm where code = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, p.getCode());
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            result = false;
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }

    @Override
    public boolean export(String path) {
        boolean result = true;
        String inst = "select * from PaymentForm into outfile '../../../" + path + "';";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }

    @Override
    public Object read(String nada, int code) {
        String inst = "select * from PaymentForm where code = ?;";
        PaymentForm p = null;
        ResultSet rS;
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, code);
                rS = pS.executeQuery();
                if (rS.next()) {
                    p = new PaymentForm();
                    p.setCode(rS.getInt(1));
                    p.setDescription(rS.getString(2));
                    p.setDiscount(rS.getFloat(3));
                    p.setParcelas(rS.getInt(4));
                    p.setSituation(rS.getInt(5));
                }
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (p);
    }

    @Override
    public List<Object> list() {
        String inst = "select * from PaymentForm";
        List<Object> list = new ArrayList<>();
        ResultSet rS;
        Object o;
        try {
            try (PreparedStatement pS = DaoConnection.getInstance().getCon().prepareStatement(inst)) {
                rS = pS.executeQuery();
                DaoConnection.getInstance().setCon(DaoConnection.getInstance().getCon());
                if (rS != null)
                    while (rS.next()) {
                        o = read("", rS.getInt(1));
                        list.add(o);
                    }
                pS.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return list;
    }
}