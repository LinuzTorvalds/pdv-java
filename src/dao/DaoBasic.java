package dao;

import java.util.List;

public interface DaoBasic {
    
    public boolean create(Object o);
    public boolean update(Object o);
    public boolean delete(Object o);
    public boolean export(String path);
    public Object read(String iD1, int iD2);
    public List<Object> list();
}