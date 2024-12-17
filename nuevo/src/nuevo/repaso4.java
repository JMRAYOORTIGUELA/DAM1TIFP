package nuevo;

public class repaso4 {

	public static int[] cocienteResto(int numerador,int denominador) {
		int tb[]=new int[2];
		int c=0;
		
		while(numerador>=denominador) {
		    numerador -=denominador;
		    c++;
		}
		tb[0]=c;
		tb[1]=numerador;
		return tb;
		
	}
	
	public static double potencia(double b,int exponente) {
        double resultado=1;
		
		for(int i=1;i<=exponente;i++) resultado *=b;
		
		return resultado;
	}
	
	public static void main(String[] args) {
		int ex=5;
		double base=2;
		
		System.out.println(potencia(base,ex));
		
		int matriz[]=cocienteResto(7,2);
		
		System.out.println("cociente="+matriz[0]+" y el resto="+matriz[1]);
				
		

	}

}
