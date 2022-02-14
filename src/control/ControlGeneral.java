package control;

import dao.DaoBasic;
import dao.DaoPaymentForm;
import dao.DaoProduct;
import dao.DaoSale;
import dao.DaoUser;
import java.util.List;

public class ControlGeneral implements ControlBasic {
    
    private DaoBasic dG;
    
    public ControlGeneral(int option) {
        switch(option) {
            case 1 : this.dG = new DaoProduct();
                break;
            case 2 : this.dG = new DaoSale();
                break;
            case 3 : this.dG = new DaoUser();
                break;
            case 4 : this.dG = new DaoPaymentForm();
        }
    }

    @Override
    public boolean setManipulate(Object o, char task) {
        boolean ok = false;
        if (dG instanceof DaoBasic)
            switch (task) {
                case 'C' : ok = (dG.create(o));
                    break;
                case 'D' : ok = (dG.delete(o));
                    break;
                case 'U' : ok = (dG.update(o));
            }
        return (ok);
    }
    
    @Override
    public boolean export(String path) {
        boolean ok = false;
        if (dG instanceof DaoBasic)
            ok = dG.export(path);
        return (ok);
    }

    @Override
    public Object getRead(String iD1, int iD2) {
        Object o = null;
        if (dG instanceof DaoBasic)
            o = dG.read(iD1, iD2);
        return (o);
    }

    @Override
    public List<Object> getList() {
        List<Object> list = null;
        if (dG instanceof DaoBasic)
            list = dG.list();
        return list;
    }
}
