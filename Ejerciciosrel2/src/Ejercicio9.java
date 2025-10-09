import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.io.*;

public class Ejercicio9 {

	public static void main(String[] args) throws IOException{
		final String TITLE = "LISTA DE NÚMEROS";
		int number;
		String line;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		Boolean isValid = false;
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		do {
			try {
				System.out.print("Introduzca un número: ");
				line = keyboard.readLine();
				number = Integer.parseInt(line);
				isValid = true;
				for (int i=0; i <= number ; i++) {
					System.out.print(i + ((number == i) ? ". " : ", ")); 
				}
			}
			catch (InputMismatchException error) {
				System.out.println("El valor introducido no es válido.");
			}
		
			catch (NumberFormatException error) {
				System.out.println("El valor introducido no es entero.");
			}
		} while(!isValid);
		
	}

}
