package dao;

import useful.Several;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConnection {
    
    private static DaoConnection instance = null;
    private Connection con;
    private String host, bD, user, password, url;
    
    private DaoConnection() {
        this.con = null;
        this.host = "172.21.0.3";
        this.bD = "sale_pdv";
        this.user = "root";
        this.password = "root";
        
        final String Driver = "com.mysql.jdbc.Driver";
        
        url  = "jdbc:mysql://" + host + '/' + bD;
        url += "?createDatabaseIfNotExist=true";
        url += "&user=" + user + "&password=" + password;
        
        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            Several.showData("Erro no acesso ao banco de dados " + ex.getMessage(), "Erro na conexão", false);
        }
    }
    
    public synchronized static DaoConnection getInstance() {
        if (instance == null)
            instance = new DaoConnection();
        return instance;
    }
    
    public void setInstance(DaoConnection instance) {
        DaoConnection.instance = instance;
    }
    
    public Connection getCon() {
        if (con == null) 
            getInstance();
        return con;
    }
    
    public void setCon(Connection con) {
        this.con = con;
    }
}