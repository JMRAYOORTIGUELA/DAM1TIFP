package Ej_ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.math.BigDecimal;
import java.util.ListResourceBundle;

class Ejemplo extends ListResourceBundle {
	protected Object[][] getContents() {
		Object[][] resources = new Object[3][2];

		resources[0][0] = "title";
		resources[0][1] = "My Program";

		resources[1][0] = "StopText";
		resources[1][1] = "Stop";

		resources[2][0] = "StartText";
		resources[2][1] = "Start";

		return resources;
	}
}



public class Inicio {
	public static void main(String[] args) {
		ResourceBundle rd =null;
		
		rd = ResourceBundle.getBundle("Ej_ResourceBundle.Ejemplo", new Locale("pl", "PL"));
		System.out.println(rd.getString("currency"));
		
		
		  rd = ResourceBundle.getBundle("Ej_ResourceBundle.Ejemplo", new Locale("en","US"));
		  System.out.println("English Version:");
		  System.out.println("String for Title key: " + rd.getString("title"));
		  System.out.println("String for StopText key: " + rd.getString("StopText"));
		  System.out.println("String for StartText key: " + rd.getString("StartText"));
		  
		  rd = ResourceBundle.getBundle("Ej_ResourceBundle.Ejemplo", new Locale("de","DE"));
		  System.out.println("Aleman Version:");
		  System.out.println("String for Title key: " + rd.getString("title"));
		  System.out.println("String for StopText key: " + rd.getString("StopText"));
		  System.out.println("String for StartText key: " + rd.getString("StartText"));
	
	}
}