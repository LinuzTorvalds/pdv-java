package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.Sale;
import model.Sale_Product;

public class DaoSale_Product {
    
    public DaoSale_Product() {
        String inst = "create table if not exists Sale_Product ("
                + " code serial not null auto_increment"
                + ",sale bigint(20) unsigned"
                + ",product bigint(20) unsigned"
                + ",value float"
                + ",amount int"
                + ",constraint sale foreign key (sale) references Sale(code) on delete cascade on update cascade"
                + ",constraint product foreign key (product) references Product(code) on delete cascade on update cascade"
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
    
    public boolean create(List<Object> list) {
        boolean result = true;
        for (Object o : list) {
            Sale_Product s = (Sale_Product) o;
            String inst = "insert into Sale_Product(sale, product, value, amount) values(?,?,?,?);";
            try {
                Connection con = DaoConnection.getInstance().getCon();
                try (PreparedStatement pS = con.prepareStatement(inst)) {
                    pS.setInt(1, s.getSale().getCode());
                    pS.setInt(2, s.getProduct().getCode());
                    pS.setFloat(3, s.getValue());
                    pS.setInt(4, s.getAmount());
                    pS.execute();
                }
                DaoConnection.getInstance().setCon(con);
            } catch (SQLException ex) {
                result = false;
                throw new RuntimeException(ex.getMessage());
            }
        }
        return (result);
    }
    
    public boolean delete(Object o) {
        boolean result = true;
        Sale_Product s = (Sale_Product) o;
        String inst = "delete from Sale_Product where code = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, s.getCode());
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            result = false;
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }
    
    public boolean export(String path) {
        boolean result = true;
        String inst = "select * from Sale_Product into outfile '../../../" + path + "';";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            result = false;
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }
    
    public Object read(String nada, int code) {
        String inst = "select * from Sale_Product where code = ?;";
        Sale_Product s = null;
        DaoSale dS = new DaoSale();
        DaoProduct dP = new DaoProduct();
        ResultSet rS;
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, code);
                rS = pS.executeQuery();
                if (rS.next()) {
                    s = new Sale_Product();
                    s.setCode(rS.getInt(1));
                    Object o = dS.read("", rS.getInt(2));
                    Sale sale = (Sale) o;
                    s.setSale(sale);
                    Object a = dP.read("", rS.getInt(3));
                    Product product = (Product) a;
                    s.setProduct(product);                    
                    s.setValue(rS.getFloat(4));
                    s.setAmount(rS.getInt(5));
                }
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (s);
    }
    
    public List<Object> list() {
        String inst = "select * from Sale_Product order by code";
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