package nuevo;

import java.util.Scanner;

public class capicua {
     static Scanner sc=new Scanner(System.in);
     
    public static boolean isCapicua(int n) {
    	int guardado=n;
    	int reverso=0,resto;
    	while(n>0) {
    		resto=n%10;
    		reverso=reverso*10+resto;
    		n=(int)n/10;
    	}
       return reverso==guardado;
    }
    public static boolean isCapicua(String n) {
       String reverso="";
       for(int i=n.length()-1;i>=0;i--) {
    	   //reverso=reverso+String.valueOf(n.charAt(i));
    	   reverso=reverso+n.substring(i, i+1);
       } 
       return reverso.equals(n);
       }
     
	public static void main(String[] args) {
		System.out.print("Dime el numero ");
        int numero=Integer.valueOf(sc.nextLine());
        String cadena=isCapicua(numero)? "capicua" :"No capicua";
        System.out.println(cadena);
        
       cadena=isCapicua(String.valueOf(numero))? "capicua" :"No capicua";
       System.out.println(cadena);
	}

}
