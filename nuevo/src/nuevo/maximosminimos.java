package nuevo;

public class maximosminimos {

	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	public static void rellenar(int ma[]) {
		
		for (int i = 0; i < ma.length; i++) ma[i]=alea(0,5);
	}
    public static void imprimir(int ma[]) {
		
		for (int i = 0; i < ma.length; i++) 
		System.out.printf("i=%d ma[%d]=%d\n",i,i,ma[i]);
	}
	public static void maximominimo(int ma[]) {
		int maximo,minimo;
		
		maximo=minimo=ma[0];
		for(int i=1;i<ma.length;i++) {
			
			if (ma[i]>maximo) {
				maximo=ma[i];
			}else if(ma[i]<minimo) {
				minimo=ma[i];
			}
		}
		System.out.printf("Maximo=%5d Minimo=%5d",maximo,minimo);
	}
	public static void maxminCount(int ma[]) {
		int maximo,minimo,cmaximo,cminimo;
		
		maximo=minimo=ma[0];
		cmaximo=cminimo=1;
		
		for(int i=1;i<ma.length;i++) {
			
			if (ma[i]>maximo) {
				maximo=ma[i];
				cmaximo=1;
			}else if(ma[i]==maximo) {
				cmaximo++;
			}
			/*********************************/
			if (ma[i]<minimo) {
				minimo=ma[i];
				cminimo=1;
			}else if(ma[i]==minimo) {
				cminimo++;
			}
			/*********************************/
		}
		System.out.printf("Maximo=%5d nº=%5d\n",maximo,cmaximo);
		System.out.printf("Minimo=%5d nº=%5d\n",minimo,cminimo);
	}
	public static void main(String[] args) {
		
		int vector[]=new int[10];
		rellenar(vector);
		imprimir(vector);
		maxminCount(vector);
		

	}

}
