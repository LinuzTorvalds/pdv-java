package control;

import java.util.List;

public interface ControlBasic {
    
    public boolean setManipulate(Object o, char task);
    public boolean export(String path);
    public Object getRead(String iD1, int iD2);
    public List<Object> getList();
}