/*
 Autor: Michael
 Descripcion: Programa que pide una fecha de nacimiento e imprimir los días que han pasado. 
 */

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.DateTimeException;
import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class propuesta19 {
	
	public static LocalDate validateDate (BufferedReader sc, LocalDate currentDate) {
		final String ERROR_MESSAGE = "[ERROR] Introduce un formato correcto YYYY/m/d para fecha.";
		String line;
		int year;
		int month;
		int day;
		LocalDate date = null;
	
		boolean validDate = false;
			while (!validDate) {
				try {
					System.out.print("Introduce el año: ");
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
					if(date.isBefore(currentDate))
						validDate = true;
					
				}catch (Exception error) {
					System.out.println(ERROR_MESSAGE);
					
				}
			}
			return date;
	}
	
	public static long elapsedDays(LocalDate date1, LocalDate date2) {
		return (date1.toEpochDay() - date2.toEpochDay());
	}

	public static void main(String [] args)throws  IOException{
		final String TITLE = "CALCULAR EL TIEMPO TRANSCURRIDO DESDE NACIMIENTO";
		LocalDate bornDate = null;
		LocalDate currentDate = LocalDate.now();
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); 
		
		//DIBUJAR TITULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		//ENTRADA DE DATOS DE USUARIO
		bornDate = validateDate(keyboard, currentDate);
		
		//IMPRIMIR FECHA
		System.out.println("La cantidad de días transcurridos desde " + bornDate + " son: " + elapsedDays(currentDate, bornDate));
		}
}
