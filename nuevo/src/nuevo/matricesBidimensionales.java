package nuevo;

public class matricesBidimensionales {

	public static void main(String[] args) {
		int tb[][]= { {1,2,3},
				      {5,6,7,8},
				      {10,11,12,13,14}
				    };
		
		int nf=tb.length; //nº de filas
		int nf0=tb[0].length;  //3 
		int nf1=tb[1].length;  //4
		int nf2=tb[2].length;  //5
		int suma;
		System.out.printf("Nº de filas=%d  ncf0=%d  ncf1=%d ncf2=%d \n",nf,nf0,nf1,nf2);
		
        for (int i = 0; i < tb.length; i++) {
        	   suma=0;
			for (int j = 0; j < tb[i].length; j++) {
				System.out.printf("%5d ",tb[i][j]);
				suma +=tb[i][j];
			}
			System.out.printf("%5d \n",suma);
		}
		
		
	}

}
