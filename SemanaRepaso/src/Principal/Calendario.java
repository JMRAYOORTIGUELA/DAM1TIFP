package Principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;

public class Calendario {
	
	public static String FechaHoraPer(String patron, LocalDate fechaHora, Locale l) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern(patron, l);
		return fechaHora.format(f);
	}
	
	public static String centrar(String c,int n,String relleno) {
		int m=   (n-c.length())/2;
		int p=n-m-c.length();
		
		return relleno.repeat(m)+c+relleno.repeat(p);
		
	}
	public static StringBuffer mes(LocalDate fecha) {
     
		LocalDate primerDia=LocalDate.of(fecha.getYear(), fecha.getMonth(), 1);
		
		int n=primerDia.getDayOfWeek().getValue();
		
		StringBuffer cadena=new StringBuffer();
		
	
		cadena.append(centrar(FechaHoraPer("MMMM", primerDia,new Locale("es", "ES")).toUpperCase(),21,"=")+"\n");
		int c=1;
		cadena.append(" ".repeat((n-1)*3));
		
		while (fecha.getMonthValue()==primerDia.getMonthValue()) {
			
			cadena.append(String.format("%3d", primerDia.getDayOfMonth()));
			if (primerDia.getDayOfWeek().getValue()==7) {
				cadena.append("\n");
				c++;
			}
			primerDia=primerDia.plusDays(1);
			
		}
					
		for(int i=c;i<=9;i++)cadena.append("\n");
		return cadena;
	}
	
	public static void main(String[] args) {
	HashMap<Integer,StringBuffer> calendario=new HashMap<Integer,StringBuffer>();
	int anno=2024;
		for(int i=1;i<=12;i++) {
			calendario.put(i,mes(LocalDate.of(anno,i,1)));
		}
		for(int i=1;i<=12;i+=4) {
			String tb1[]=calendario.get(i).toString().split("\n");
			String tb2[]=calendario.get(i+1).toString().split("\n");
			String tb3[]=calendario.get(i+2).toString().split("\n");
			for(int j=0;j<tb1.length;j++) {
				System.out.println(
				tb1[j]+" ".repeat(21-tb1[j].length())+
				"   "+tb2[j]+" ".repeat(21-tb2[j].length())+"    "+tb3[j]);
			}
			System.out.println();
		}
	}

}
