package Ej_ResourceBundle;

import java.util.ListResourceBundle;


public class Ejemplo_de_DE extends ListResourceBundle {
	protected Object[][] getContents() {
	
		return new Object[][] {
	          {"title", "Mein Programm"},
	          {"StopText", "Anschlag"},
	          {"StartText", "Anfang"} 
	        };
	}
}
