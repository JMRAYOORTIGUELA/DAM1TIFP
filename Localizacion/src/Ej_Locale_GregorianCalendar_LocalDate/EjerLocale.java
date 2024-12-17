package Ej_Locale_GregorianCalendar_LocalDate;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class EjerLocale {

	public static void metodo4() {
		   float numero = 5000.45f;
		   System.out.println((NumberFormat.getInstance()).format(numero));
		   System.out.println((NumberFormat.getInstance(new Locale("en_En"))).format(numero));
		   System.out.println((new DecimalFormat("###,###,###.##")).format(numero));
		   
			/*
			 * for (Locale locale : NumberFormat.getAvailableLocales()) {
			 * System.out.println(locale+" "+(NumberFormat.getInstance(locale)).format(
			 * numero)); }
			 */
		   System.out.println((NumberFormat.getCurrencyInstance()).format(numero));
		   System.out.println((NumberFormat.getCurrencyInstance(new Locale("en","GB"))).format(numero));
		   System.out.println((NumberFormat.getCurrencyInstance(Locale.ITALY)).format(numero));
		   
			/*
			 * for (Locale locale : Locale.getAvailableLocales()) {
			 * System.out.println(locale+" "+(NumberFormat.getCurrencyInstance(locale)).
			 * format(numero)); }
			 */
	}
	public static void metodo3() {
		 long number = 5000000L;
         
	        Currency currency = Currency.getInstance(Locale.CHINA);
	        System.out.println(currency.getDisplayName()+" ("+currency.getCurrencyCode()+") "+currency.getDisplayName());
	        
	        Locale.setDefault(Locale.CANADA_FRENCH);
	        
	        Date currentDate = new Date();
	        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
	        System.out.println("Date Format in German Locale: "+dateFormat.format(currentDate));
	    }

		public static void metodo1() {
        Locale locale = Locale.getDefault();
        System.out.println("Default Locale: "+locale);
         
        Locale []availableLocale = Locale.getAvailableLocales();
        for(Locale aLocale : availableLocale){
        	System.out.println(aLocale);
            System.out.println("Name of Locale: "+aLocale.getDisplayName());
            System.out.println("Language Code: "+aLocale.getLanguage()+", Language Display Name: "+aLocale.getDisplayLanguage());
            System.out.println("Country Code: "+aLocale.getCountry()+", Country Display Name: "+aLocale.getDisplayCountry());
            if(!aLocale.getScript().equals("")){
                System.out.println("Script Code: "+aLocale.getScript()+", Script Display Name: "+aLocale.getDisplayScript());
            }
            if(!aLocale.getVariant().equals("")){
                System.out.println("Variant Code: "+aLocale.getVariant()+", Variant Display Name: "+aLocale.getDisplayVariant());
            }
            System.out.println("****************************************************************");
        }
	}
		public static void metodo2() {
			/*
			 * Locale(String language): 
			 * Locale(String language, String country): 
			 * Locale(String language, String country, String variant):
			 * IETF BCP 47 
			 */
			
		 // Creates a locale object using one parameter to constructor
        Locale locale = new Locale("fr");   
        System.out.println("locale: "+locale);
         
        // Create a locale object using two parameters constructor
        Locale locale2 = new Locale("fr", "CANADA");
        System.out.println("locale2: "+locale2);
         
        // Create a locale object using three parameters constructor
        Locale locale3 = new Locale("no", "NORWAY", "NY");
        System.out.println("locale3: "+locale3);
         
        // A local object from Locale.Builder
        Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("GB").build();
        System.out.println("localeFromBuilder: "+localeFromBuilder);
         
        //Locale from forLanguageTag method
        Locale forLangLocale = Locale.forLanguageTag("en-GB");
        System.out.println("forLangLocale: "+forLangLocale);
         
        //Using Locale Contant
        Locale localeCosnt = Locale.FRANCE;
        System.out.println("localeCosnt: "+localeCosnt);
	}
	
	public EjerLocale() {
		// TODO Auto-generated constructor stub
	       String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	        TimeZone tz = TimeZone.getTimeZone("GMT+9:00");
	        Locale loc = new Locale("ja", "JP", "JP");
	        Calendar calendar = Calendar.getInstance(loc);
	        GregorianCalendar gc = (GregorianCalendar) calendar;
	        //new GregorianCalendar();
	        //new GregorianCalendar(2018, 6, 27, 16, 16, 47);
	        //new GregorianCalendar(TimeZone.getTimeZone("GMT+5:30"));
	        //new GregorianCalendar(TimeZone.getTimeZone("GMT+5:30"), new Locale("en", "IN"));
	}

	public static void main(String[] args) {

		
		  GregorianCalendar fecha = new GregorianCalendar(2018, 11, 31);
		  fecha.add(Calendar.DATE, 1); 
		  System.out.println(fecha.getTime()); 
		  fecha.roll(Calendar.MONTH, 1); 
		  System.out.println(fecha.getTime()); 
		  String cadena = new GregorianCalendar(2018, 6, 28).toZonedDateTime().format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
		  System.out.println(cadena);
		  System.out.println(fecha.getMaximum(fecha.DAY_OF_MONTH)); 
		  /*metodo1();
		  metodo2(); 
		  metodo3();
		  */
		 
        metodo1();
        }
	
}
