package nuevo;

public class notas {
	
	/****************************************************************/
	public static void imprimir(int ma[][],String alum[],String asig[]) {
		double mediasAsig[]=new double[asig.length];
		
		System.out.printf("%20s", "");
		for (int i = 0; i < asig.length; i++) System.out.printf("%10s", asig[i]);
	    System.out.println();
		int suma;
		/************************************************/
	    for (int i = 0; i < ma.length; i++) {
	    	suma=0;
	    	System.out.printf("%20s", alum[i]);
	    	
			for (int j = 0; j < ma[i].length; j++) {
				System.out.printf("%10d", ma[i][j]);
				suma +=ma[i][j];
				mediasAsig[j] += ma[i][j];
			}
			System.out.printf("%10.2f\n",(double)suma/asig.length);
		}
	    /************************************************/
	    System.out.printf("%20s", "");
		for (int i = 0; i < mediasAsig.length; i++) 
			System.out.printf("%10.2f", mediasAsig[i]/alum.length);
		
	    System.out.println();
		
	}
	/****************************************************************/
	public static void rellenar(int ma[][]) {
		
	    for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				ma[i][j]=alea(0,10);
			}
		}
		
	}
	
	/****************************************************************/
	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	/****************************************************************/
	public static void main(String[] args) {
		String alumnos[]= {	"Alumno1","Alumno2","Alumno3","Alumno4",
				            "Alumno5","Alumno6","Alumno7","Alumno8",
				            "Alumno9", "Alumno10"};
	    String asignaturas[]= {"MATEMATICAS","FISICA","QUMICA","LENGUA","INGLES"};
	    
	    int notas[][]=new int[alumnos.length][asignaturas.length];
	    rellenar(notas);
	    imprimir(notas,alumnos,asignaturas);
	    
		}

	
/****************************************************************/
}
