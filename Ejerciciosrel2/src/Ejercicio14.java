import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class Ejercicio14 {
	
	public static void main(String[] args) throws IOException{
		final String TITLE = "INGRESA NÚMEROS";
		int number;
		String line;
		int positiveNumbersCounter = 0;
		int negativeNumbersCounter = 0;
		int positiveNumbersAcumulator = 0;
		int negativeNumbersAcumulator = 0;
		int zeroNumbersCounter = 0;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		for (int i = 10; i > 0; i--) {
			try {
				System.out.print("Introduce un número: ");
				line = keyboard.readLine();
				number = Integer.parseInt(line);
				if (0 == number) {
					zeroNumbersCounter++;
				}
				
				else if (0 < number) {
					positiveNumbersCounter++;
					positiveNumbersAcumulator += number;
				}
				
				else
					negativeNumbersCounter++;
					negativeNumbersAcumulator += number;
				
			}
			catch (InputMismatchException error) {
				System.out.println("[ERROR] El número introducido es demasiado grande.");
			}
			
			catch (NumberFormatException error) {
				System.out.println("[ERROR] El valor introducido no era numérico");
			}
			
			System.out.println("Intentos restantes: " + (i - 1));
		}
			System.out.println("La media de Positivos: " + ((positiveNumbersCounter == 0)? "No se han introducido positivos" : ((double)positiveNumbersAcumulator / (double)positiveNumbersCounter)));
			System.out.println("La media de Negativos: " + ((negativeNumbersCounter == 0) ? "No se han introducido negativos" : ((double)negativeNumbersAcumulator / (double)negativeNumbersCounter)));
			System.out.println("La media de Zeros: 0 Apareció: " + zeroNumbersCounter + " veces.");
	}
}
