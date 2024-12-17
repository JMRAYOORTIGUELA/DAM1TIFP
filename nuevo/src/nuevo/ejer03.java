package nuevo;

public class ejer03 {

	public static void main(String[] args) {
		int notas[]=new int[10];
		int li=0,ls=10,n;
		String literales[]= {"Suspenso","Aprobado","Bien","Notable","Sobresaliente"};
		int contar[]=new int[5];
		
		for(int i=0;i<notas.length;i++) {
		    n=(int)(Math.random()*(ls-li+1))+li;
		    System.out.println(n);
		    notas[i]=n;
		    if (n<5) {
		    	contar[0]++;
		    }else if(n<6) {
		    	contar[1]++;
		    }else if(n<7) {
		    	contar[2]++;
		    }else if(n<9) {
		    	contar[3]++;
		    }else if(n<=10) {
		    	contar[4]++;
		    }
	   }

		for(int i=0;i<contar.length;i++) System.out.println(literales[i]+" "+contar[i]);
}
}
