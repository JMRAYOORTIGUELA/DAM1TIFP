package nuevo;

public class paula1 {

	public static int alea(int li,int ls) {
		
		return (int)(Math.random()*(ls-li+1))+li;
		
	}
	
	public static void main(String[] args) {
     String cadena="abcdefgh",numero="01234567";
     
     int n=numero.indexOf("4");
     
     System.out.println(cadena.substring(n,n+1));
		
		
	}

}
