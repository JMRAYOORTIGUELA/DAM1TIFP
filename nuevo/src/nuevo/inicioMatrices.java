package nuevo;

import java.util.Scanner;

public class inicioMatrices {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		String matriz[]= {"1.-gc","2.-gf","3.-gk","4.-salir"};
		int op;
		
		do {
			System.out.println("Opciones ");
			for (String a : matriz) System.out.println(a);
			System.out.print("\tDime la opcion a ejecutar ");
			op=Integer.valueOf(sc.nextLine());
				
		}while(op<1||op>matriz.length);
		/*********************************************************************/
		switch(op) {
		case 1:  //gc
			System.out.println("Primero opcion");
			break;
		case 2:  //gc
			System.out.println("Primero opcion");
			break;
		case 3:  //gk
			System.out.println("Primero opcion");
			break;
		default:
			System.out.println("Salir");
			break;
		}

	}

}
