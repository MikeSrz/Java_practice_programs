/*
 Autor: Michael
 Descripción: Dar una la cantidad de tiempo en años meses y días. 
*/
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Locale;
import java.time.format.TextStyle;
import java.time.DateTimeException;
import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class propuesta20 {
	
	public static LocalDate buildDate (BufferedReader sc, String message) {
		final String ERROR_MESSAGE = "[ERROR] Introduce un formato correcto YYYY/m/d para fecha.";
		String line;
		int year;
		int month;
		int day;
		LocalDate date = null;
	
		boolean validDate = false;
		System.out.print(message);
			while (!validDate) {
				try {
					System.out.print("el año: ");
					line = sc.readLine();
					year = Integer.parseInt(line);
					System.out.print("Introduce el mes: ");
					line = sc.readLine();
					month = Integer.parseInt(line);
					System.out.print("Introduce el día: ");
					line = sc.readLine();
					day = Integer.parseInt(line);
					
					//CONSTRUIMOS NUESTRA FECHA:
					date = LocalDate.of(year, month, day);
					validDate = true;
					
				}catch (Exception error) {
					System.out.println(ERROR_MESSAGE);
					
				}
			}
			return date;
	}
	
	public static void elapsedTime(LocalDate date1, LocalDate date2) {
		int years = date1.getYear() - date2.getYear(); 			   
		int months;
		int days;
		
		if (date1.getMonthValue() < date2.getMonthValue()) {
			years--;
			months = date1.getMonthValue() + (12 - date2.getMonthValue() + ((date1.isLeapYear()) ? -1 : 0));
		}
		else {
			months = date1.getMonthValue() - date2.getMonthValue() - 1;
			months = (months < 0 ) ? 0 : months;
			
		}
		if (date1.getDayOfMonth() < date2.getDayOfMonth()) {
			days = date1.getDayOfMonth() + (date2.lengthOfMonth() - date2.getDayOfMonth() + ((date1.isLeapYear()) ? 0 : +1));
		}
		else {
			days = date1.getDayOfMonth() - (date2.getDayOfMonth() + ((date1.isLeapYear()) ? -1 : 0));
		}
		System.out.println(years + " años" + " "+ months + " meses y " + days +" días.");
	}
	
	public static void printTitle(String title) {
		System.out.println(title);
		System.out.println("-".repeat(title.length()));
	}
	
	//FUNCION PRINCIPAL
	public static void main(String[] args) {
		final String TITLE = "CALCULADORA DE TIEMPO";
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); 
		LocalDate currentDate =  LocalDate.now();
		
		printTitle(TITLE);
		LocalDate date = buildDate(keyboard, "Inserte una fecha: ");
		
		elapsedTime(currentDate, date);
	}

}
