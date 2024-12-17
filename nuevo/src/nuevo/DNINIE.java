package nuevo;

public class DNINIE {
	static String cadena="TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static String metodoDNINIE(String vdninie) {
		String primer=vdninie.substring(0,1);
		int numero,resto;
		
		int n="XYZ".indexOf(primer);
		if (n>=0) {
			numero=Integer.valueOf(String.valueOf(n)+vdninie.substring(1));
		}else {
			numero=Integer.valueOf(vdninie);
		}
		resto=numero%23;
		return cadena.substring(resto,resto+1);
	}

	public static void main(String[] args) {
		
	    String dninie="50691319";
	    
	    System.out.println(metodoDNINIE(dninie));
	}

}
