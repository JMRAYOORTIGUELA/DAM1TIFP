package Principal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Reto {
	static Scanner sc=new Scanner(System.in);
	static final String[] TablaColores= {"R", "A","V", "Z", "M","B","C","D","E","F"};
	static final int NumColoresCombinacion=7;
	static final int NumColoresJuego=TablaColores.length;
	
	private static String[] Combi=new String[NumColoresCombinacion];
	
	private static String[] CombiUsuario=new String[NumColoresCombinacion];
	/**********************************************************************************/	
	public static int alea(int li,int ls) {return (int)(Math.random()*(ls-li+1))+li;}
	/**********************************************************************************/
	public static void rellenarConRepeticion() {
		for(int i=0;i<Combi.length;i++)Combi[i]=TablaColores[alea(0,NumColoresJuego-1)];
	}
	/**********************************************************************************/
	public static void rellenarSinRepeticion() {
		int tb[]=new int[NumColoresJuego],n;
		boolean colocada=false;
	
		for(int i=0;i<Combi.length;i++) {
			colocada=false;
			while(!colocada) {
				n=alea(0,NumColoresJuego-1);
				if (tb[n]==0) {
					Combi[i]=TablaColores[n];
					tb[n]=1;
					colocada=true;
				}
			}
			
		}
	}
	/**********************************************************************************/
	public static void rellenarUsuario(int inten) {
		System.out.println("Nº de intento "+inten);
		System.out.print("\t\tCombinación ");
		String cadena=sc.nextLine();
		for(int i=0;i<CombiUsuario.length;i++) {
			CombiUsuario[i]=String.valueOf(cadena.charAt(i));		
		}
	}
	/**********************************************************************************/
	public static void imprimir(String[] ma) {
		for(int i=0;i<ma.length;i++)System.out.print(ma[i]);
		System.out.println();
	}
	/**********************************************************************************/
	public static void comprobar(int resul[]) {
		resul[0]=resul[1]=0;
		String[] Combi2=Arrays.copyOf(Combi,Combi.length);
		String[] CombiUsuario2=Arrays.copyOf(CombiUsuario,CombiUsuario.length);
		
		for(int i=0;i<Combi2.length;i++) {
			if (Combi2[i].equals(CombiUsuario2[i])){
				resul[0]++;
				Combi2[i]=CombiUsuario2[i]="-";
			}
		}
		/*======================================*/
		 for(int i=0;i<CombiUsuario2.length;i++){
	            if (CombiUsuario2[i].equals("-"))continue;
	            for(int j=0;j<Combi2.length;j++){
	                if (Combi2[j].equals(CombiUsuario2[i]) ){
	                    resul[1]++;
	                    Combi2[j]="-";
	                }
	            }
	            CombiUsuario2[i]="-";
	        }
	}
	/**********************************************************************************/
	
public static void main(String[] args) {
	
	  int intentos=0,numerointentos=5;
      int resultados[]=new int[2];
      //rellenarConRepeticion();
      rellenarSinRepeticion();
      imprimir(TablaColores);
      imprimir(Combi);
      do {
          rellenarUsuario(++intentos);
          comprobar(resultados);
          System.out.printf("\t\tNº de Aciertos=%d Nº de aproximaciones=%d\n",resultados[0],resultados[1]);
      }while(intentos<numerointentos && resultados[0]!=NumColoresCombinacion);
      if(resultados[0]==NumColoresCombinacion){
          System.out.println("Enhorabuena ha acertado en el intento "+intentos);
      }else{
          System.out.println("Demasiados intentos.");
      }
	
	
	

}
}
