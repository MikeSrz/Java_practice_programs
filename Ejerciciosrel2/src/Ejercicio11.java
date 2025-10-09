
import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class Ejercicio11 {
	
	public static void main(String[] args) throws IOException{
		final String TITLE = "INGRESA NÚMEROS";
		int number;
		String line;
		int counter = 0;
		int acumulator = 0;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		while(true) {
			try {
				System.out.print("Introduce un número: ");
				line = keyboard.readLine();
				number = Integer.parseInt(line);
				counter++;
				acumulator += number;
				if (counter == 15) 
					break;
			}
			catch (InputMismatchException error) {
				System.out.println("[ERROR] El número introducido es demasiado grande.");
			}
			
			catch (NumberFormatException error) {
				System.out.println("[ERROR] El valor introducido no era numérico");
			}
		}
		System.out.println("El sumatorio es: " + acumulator);
	}
}
