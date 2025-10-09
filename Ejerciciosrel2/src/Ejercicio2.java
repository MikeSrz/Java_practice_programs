import java.io.*;
import java.lang.NumberFormatException;

public class Ejercicio2 {
	public static class NegativeNumberException extends Exception{
		public NegativeNumberException(String message) {
			super(message);
		}
	}
	public static void main(String[] args) throws IOException, NegativeNumberException{
		final String TITLE = "CALCULAR CUADRADO";
		int number;
		String line;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		while (true) {
			try {
				System.out.print("Introduce un número para calcular su cuadrado: ");
				line = keyboard.readLine();
				number = Integer.parseInt(line);
				if (number < 0) {
					throw new NegativeNumberException("[ERROR] el programa no admite números negativos.");
				}
				System.out.print("El cuadrado de " + number + " es " + (int)Math.pow(number, 2) + "\n");
			} 
			catch (NumberFormatException error) {
				System.out.println("Debes introducir un número válido");
			}
			catch (NegativeNumberException error) {
				System.out.println(error.getMessage());
				break;
			}
		}
	}
}
