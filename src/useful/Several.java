package useful;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Several {
    
    public static String readData(String message, String title) {
        String data = "";
        do
            data = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
        while (data == null || data.isEmpty());
        return (data);
    }
    
    public static void showData(String message, String title, boolean icon) {
        if (icon)
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean confirm(String message, String title) {
        return (JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION) == 0);
    }
    
    public static boolean testNum(String data, String title) {
        boolean forehead;
        try {
            forehead = true;
            Double.parseDouble(data);
        } catch (NumberFormatException ex) {
            showData("Houve um erro na conversão\n"
                    + "Digite apenas caracteres numéricos " + ex.getMessage(), title, false);
            forehead = false;
        }
        return (forehead);
    }
    
    public static boolean testBreak(double n, double n1, double n2, String title) {
        if (n1 != n2 && (n <n1 || n > n2)) {
            showData("valor fora do intervalo de " + n1 + " e " + n2, title, false);
            return (false);
        }
        else
            return (true);
    }
    
    public static NumberFormat twoDigits(boolean type) {
        NumberFormat twoDigits;
        if (type)
            twoDigits = NumberFormat.getNumberInstance(Locale.US);
        else 
            twoDigits = NumberFormat.getCurrencyInstance(Locale.US);
        
        twoDigits.setMinimumFractionDigits(2);
        twoDigits.setMaximumFractionDigits(2);
        
        return twoDigits;
    }
    
    public static String convertValue(String number) {
        number = number.replace(".", "");
        number = number.replace(",", ".");
        number = number.replace("R$", "");
        
        return number;
    }
    
    public static java.sql.Date dateConvert(Date date) {
        java.sql.Date data = new java.sql.Date(date.getTime());
        
        return data;
    }
}