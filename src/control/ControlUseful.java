package control;

import dao.DaoSale_Product;
import dao.DaoUseful;
import java.util.List;
import model.User;

public class ControlUseful {
    
    private final DaoUseful dU;
    private final DaoSale_Product dSP;
    
    public ControlUseful() {
        dU = new DaoUseful();
        dSP = new DaoSale_Product();
    }    
    
    public boolean validateUser(User user) {
        boolean ok = false;
        if (dU instanceof DaoUseful)
            ok = dU.validateUser(user);
        return (ok);
    }
    
    public Object readUserLogin(String login) {
        Object o = null;
        if (dU instanceof DaoUseful)
            o = dU.readUserLogin(login);
        return (o);
    }
    
    public int create(Object o) {
        int ok = 0;
        if (dU instanceof DaoUseful)
            ok = dU.create(o);
        return (ok);
    }
    
    public boolean create(List<Object> list) {
        boolean ok = false;
        if (dSP instanceof DaoSale_Product)
            ok = (dSP.create(list));
        return (ok);
    }
    
    public boolean delete(Object o) {
        boolean ok = false;
        if (dSP instanceof DaoSale_Product)
            ok = (dSP.delete(o));
        return (ok);
    }
    
    public boolean export(String path) {
        boolean ok = false;
        if (dSP instanceof DaoSale_Product)
            ok = dSP.export(path);
        return (ok);
    }
    
    public Object getRead(String iD1, int iD2) {
        Object o = null;
        if (dSP instanceof DaoSale_Product)
            o = dSP.read(iD1, iD2);
        return (o);
    }

    public List<Object> getList() {
        List<Object> list = null;
        if (dSP instanceof DaoSale_Product)
            list = dSP.list();
        return list;
    }
    
    public Object getReadProductDescription(String description) {
        Object o = null;
        if (dU instanceof DaoUseful)
            o = dU.readProductDescription(description);
        return (o);
    }
}
