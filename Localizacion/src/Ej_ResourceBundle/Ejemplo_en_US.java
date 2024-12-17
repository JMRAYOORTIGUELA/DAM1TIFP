package Ej_ResourceBundle;

import java.util.ListResourceBundle;

public class Ejemplo_en_US extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] {
	          {"title", "My Program"},
	          {"StopText", "Stop"},
	          {"StartText", "Start"} 
	        };
	}
}
