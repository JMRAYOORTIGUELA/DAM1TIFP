package nuevo;

public class Colores {
	  static final String colores[][] = {
	  {"34","Azul"},{"32","Verde"},{"31","Rojo"},{"36","Cian"},
	  {"33","Amarillo"},{"35","Magenta"},{"37","Blanco"},{"30","Negro"},
	  {"90","Gris claro"},{"91","Rojo claro"},{"92","Verde claro"},
	  {"93","Amarillo claro"},{"94","Azul claro"},{"95","Magenta claro"},
	  {"96","Cian claro"},{"97","Blanco brillante"}};	
	    public static final String ANSI_BLACK = "\u001B[30m";
		public static final String ANSI_RED = "\u001B[31m";
		public static final String ANSI_GREEN = "\u001B[32m";
		public static final String ANSI_YELLOW = "\u001B[33m";
		public static final String ANSI_BLUE = "\u001B[34m";
		public static final String ANSI_PURPLE = "\u001B[35m";
		public static final String ANSI_CYAN = "\u001B[36m";
		public static final String ANSI_WHITE = "\u001B[37m";
		public static final String ANSI_RESET = "\u001B[0m";
		public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
		public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
		public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
		public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
		public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
		public static final String OTRO="\u001b[48;5;";
		
	public static String blanco(String c) {
			   return OTRO +""+ANSI_RESET;
   }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("\033[34mHola como estais\033[0m"); for(int
		 * i=0;i<colores.length;i++) {
		 * System.out.printf("\033[%sm%s\033[0m\n",colores[i][0],"Hola"); }
		 */

		for(int i=0;i<=255;i++) {
			System.out.println("\u001b[48;5;"+i+"m"+ANSI_WHITE+i+ANSI_RESET);
		}
	}

}
