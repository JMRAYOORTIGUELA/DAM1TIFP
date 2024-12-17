package nuevo;

public class ejerf4Matrices {
	
	public static int alea(int li,int ls) {
		return   (int) ( Math.random()*(ls-li+1))+li;
	}
	public static void rellenar(int m[][]) {

			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[i].length;j++) {
					m[i][j]=alea(5,10);
				}
			}
		}
	
public static void imprimir(int m[][],String as[]) {
	int totalColumna[]=new int[ m[0].length    ];
	int aprobados[]=new int[ m[0].length    ];
	int suspenso[]=new int[ m[0].length    ];
	int suma=0;
	boolean todas;
	
	 System.out.printf("%15S","");
	 for(int i=0;i<as.length;i++) {
		 System.out.printf("%15S",as[i]);
	 }
	 System.out.printf("%15S\n","Totales");
	
	for(int i=0;i<m.length;i++) {
		  suma=0;  //empiez la fila 
		  System.out.printf("%15S","alumno"+(i+1));
		  todas=true;
		for(int j=0;j<m[i].length;j++) {
			System.out.printf("%15d",m[i][j]);
			suma +=m[i][j]; //suma =suma +m[i][j]
			if (m[i][j]<5) {
				suspenso[j]++;
				todas=false;
			}else {
				aprobados[j]++;
			}
			totalColumna[j] +=m[i][j];
		}
		//termina fila
		System.out.printf("%15d %2s\n",suma, todas ? "*" :" ");
	}
	// Impresion por columna
	int total=0;
	 System.out.printf("%15S","Totales");
	for(int i=0;i<totalColumna.length;i++) {
		System.out.printf("%15d",totalColumna[i]);
		total +=totalColumna[i];
	}
	System.out.printf("%15d\n",total);
	/*****************************************************/
	 System.out.printf("%15S","Medias");
		for(int i=0;i<totalColumna.length;i++) {
			System.out.printf("%15.2f",(double)totalColumna[i]/m.length);
		}
		  System.out.println();
		/*****************************************************/
		System.out.printf("%15S","Aprobados");
		for(int i=0;i<aprobados.length;i++) {
		  System.out.printf("%15d",aprobados[i]);
		}
	    System.out.println();
		/*****************************************************/
		System.out.printf("%15S","Suspenso");
		for(int i=0;i<suspenso.length;i++) {
		  System.out.printf("%15d",suspenso[i]);
		}
	    System.out.println();
	
}

	public static void main(String[] args) {
		String asig[]= {"Matematicas","Fisica","Quimica","Ingles","Lengua"};
		int tb[][]=new int[4][5];
         rellenar(tb);
         imprimir(tb,asig);
	}

}
