
import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class Ejercicio7 {
	public static class ZeroException extends Exception{
		public ZeroException(String message) {
			super(message);
		}
	}
	
	public static void main(String[] args) throws IOException, ZeroException{
		final String TITLE = "INGRESA NÚMEROS";
		int number;
		String line;
		int counter = 0;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		while(true) {
			try {
				System.out.print("Introduce un número: ");
				line = keyboard.readLine();
				number = Integer.parseInt(line);
				
				if (number == 0) 
					throw new ZeroException("El cero finaliza el programa.");
				counter++;
			}
			catch (InputMismatchException error) {
				System.out.println("[ERROR] El número introducido es demasiado grande.");
			}
			
			catch (NumberFormatException error) {
				System.out.println("[ERROR] El valor introducido no era numérico");
			}
			
			catch (ZeroException error) {
				System.out.println(error.getMessage());
				break;
			}
			System.out.println("Sumatorio de veces que has introducido datos válidos: " + counter);
		}
	}

}
