package nuevo;

import java.util.Scanner;

public class ejer01 {   
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	   int ndias;
		System.out.print("Dime el mes ");
       int mes=Integer.valueOf(sc.nextLine());
       
       switch(mes) {
       case 1:  case 3:  case 5:  case 7:  case 8:  case 10:  case 12:
    	   ndias=31;
    	   break;
       case 2:
    	   System.out.print("Dime el año ");
    	   int a=Integer.valueOf(sc.nextLine());
    	   
    	     if (((a%4==0) && (a%100!=0)) || (a%400==0)) {
    	    	 ndias=29;
    	     }else {
    	    	 ndias=28;
    	     }
    	   break;
       default:
    	   ndias=30;
    	   break;
       }
       
       
       System.out.printf("El mes %d tiene %d dias    \n",mes,ndias);
       System.out.println("=================");
		
		
	}

}
