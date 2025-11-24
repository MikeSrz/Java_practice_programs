package toolbox;

import java.io.BufferedReader;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Dates {

	public static LocalDate buildDate(BufferedReader sc, String message) {
		final String ERROR_MESSAGE = "[ERROR] Introduce un formato correcto YYYY/m/d para fecha.";
		String line;
		int year;
		int month;
		int day;
		LocalDate date = null;
		boolean isValidDate = false;
	
			while (!isValidDate) {
				try {
					System.out.print(message);
					System.out.print("Año: ");
					line = sc.readLine();
					year = Integer.parseInt(line);
					System.out.print("Mes: ");
					line = sc.readLine();
					month = Integer.parseInt(line);
					System.out.print("Día: ");
					line = sc.readLine();
					day = Integer.parseInt(line);
					
					//CONSTRUIMOS NUESTRA FECHA:
					date = LocalDate.of(year, month, day);
					isValidDate = true;
					
				}catch (Exception error) {
					System.out.println(ERROR_MESSAGE);
					
				}
			}
			return date;
	}
	
	public static LocalDate buildDate(Scanner sc, String mensaje) {
		final String ERROR_MESSAGE = "[ERROR] Introduce un formato correcto YYYY/m/d para fecha.";
        LocalDate date=null;
        boolean isValidDate = false;

        while (!isValidDate) {
            try {
                System.out.println(mensaje);
                System.out.print("Año: ");
                int year = sc.nextInt();
                System.out.print("Mes: ");
                int month = sc.nextInt();
                System.out.print("Día: ");
                int day = sc.nextInt();

                date = LocalDate.of(year, month, day); // Si no es válida, lanza excepción
                isValidDate = true;
            } catch (Exception e) {
                System.out.println(ERROR_MESSAGE);
                sc.nextLine(); // limpiar el buffer
            }
        }
        return date;
    }
	
	 public static String detailedDateDiff(LocalDate f1, LocalDate f2) {
	        // Asegurar que f1 <= f2
	        if (f1.isAfter(f2)) {
	            LocalDate temp = f1;
	            f1 = f2;
	            f2 = temp;
	        }
	        int years = 0;
	        while (!f1.plusYears(years + 1).isAfter(f2)) {
	            years++;
	        }
	        int months = 0;
	        while (!f1.plusYears(years).plusMonths(months + 1).isAfter(f2)) {
	            months++;
	        }
	        int days = (int) (f2.toEpochDay() - f1.plusYears(years).plusMonths(months).toEpochDay());

	        return years + " años, " + months + " meses y " + days + " días";
	    }
	 
	 
	 public static LocalDate buildRandomDate(LocalDate min, LocalDate max) {
		    if (min == null || max == null) {
		        System.out.println("[ERROR] Las fechas no pueden ser null.");
		        return null;
		    }

		    if (min.isAfter(max)) {
		        System.out.println("[ERROR] La fecha mínima no puede ser mayor que la máxima.");
		        return null;
		    }
		    
		    Random rnd = new Random();

		    // Convertir las fechas a días desde el epoch (número de días)
		    long minDay = min.toEpochDay();
		    long maxDay = max.toEpochDay();

		    // Escoger un día aleatorio entre minDay y maxDay
		    long randomDay = minDay + rnd.nextInt((int)(maxDay - minDay + 1));

		    // Volver a LocalDate
		    return LocalDate.ofEpochDay(randomDay);
		}
	 
	

		    // Ordena la lista de fechas de menor a mayor
	public static List<LocalDate> ordenarFechas(List<LocalDate> fechas) {
		// Crear copia para no modificar la lista original
		List<LocalDate> listaOrdenada = new ArrayList<>(fechas);   
		 // Ordenar usando Collections.sort (LocalDate implementa Comparable)
		Collections.sort(listaOrdenada);
		        
		return listaOrdenada;
	}
	/*
	 * 	long epochDays = 19611;  // ejemplo
		LocalDate fecha = LocalDate.ofEpochDay(epochDays);
		System.out.println(fecha); // 2023-11-24*/
}
