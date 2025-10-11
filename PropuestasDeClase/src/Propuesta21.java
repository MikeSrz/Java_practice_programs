import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Locale;
import java.time.format.TextStyle;
import java.time.DateTimeException;
import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;
import java.time.LocalDate;


public class Propuesta21 {
	
		
		public static LocalDate validateDate (BufferedReader sc, LocalDate limitDate) {
			final String ERROR_MESSAGE = "[ERROR] Introduce un formato correcto YYYY/m/d para fecha.";
			String line;
			int year, month, day;
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
						if(date.isBefore(limitDate))
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
		
		
		public static LocalDate genRandomDate(LocalDate dateMaxLimit, LocalDate dateMinLimit) {
			int year, month;
			int day = 0;
			//Siguiendo la siguiente formula: Math.random() * (maxLimit - minLimit) + minLimit
			year = (int)(Math.random()*(dateMaxLimit.getYear() - dateMinLimit.getYear()) + dateMinLimit.getYear());
			return LocalDate.of(year,month,day);
			}
		


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		LocalDate top = LocalDate.of(5000, 31, 1);
		LocalDate minDateLimit = validateDate(keyboard,top);
		LocalDate maxDateLimit = validateDate(keyboard, top);
		
		
		for (int i=1; i< 100 ; i++) {
			System.out.println(genRandomDate(maxDateLimit, minDateLimit));
		}

	}
}

