package nuevo;

public class MetodoSinRepeticion {

	public static String[] sinRepeticion(String m[]) {
		String c[]=new String[m.length];
		boolean existe;
		int conta=0;
		
		for (int i = 0; i < m.length; i++) {
			   existe=false;
			for (int j = 0; j < c.length; j++) {
		        if (m[i].equals(c[j])) {
		        	existe=true;
		        	break;
		        }
			}
			if (!existe)c[conta++]=m[i];
			
		}
		String resultado[]=new String[conta];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i]=c[i];
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		String v[]={"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador",
				"sol", "CASA"};


		for (String cadena : sinRepeticion(v)) {
			System.out.println(cadena);
		}
     
	}

}
