package Ej_ResourceBundle;

import java.math.BigDecimal;
import java.util.ListResourceBundle;

public class Ejemplo_pl_PL extends ListResourceBundle {
	 
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
          {"currency", "polish zloty"},
          {"toUsdRate", new BigDecimal("3.401")},
          {"cities", new String[] { "Warsaw", "Cracow" }} 
        };
    }
}