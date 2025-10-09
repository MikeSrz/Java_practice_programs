import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class Ejercicio17 {
	public static class NegativeNumberException extends Exception{
		public NegativeNumberException(String message) {
			super(message);
		}
	}
	public static void main(String[] args) throws IOException {
		
		final String TITLE = "TABLA DE MULTIPLICAR";
		final int LIMIT = 10;
		String line;
		int number;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		//DIBUJAR TITULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		//PEDIR DATO AL USUARIO
		do {
			try {
				System.out.print("¿Qué tabla quieres ver?: ");
				line = keyboard.readLine();
				number = Integer.parseInt(line);
				if (0 > number) 
					throw new NegativeNumberException("El valor no puede ser negativo");
				
				break;
			}
			catch (InputMismatchException error){
				System.out.println("ERROR]Valor introducido no es válido.");
			}
			catch (NumberFormatException error){
				System.out.println("[ERROR]Valor introducido no es válido.");
			}
			catch (NegativeNumberException error) {
				System.out.println("[ERROR]El valor no puede ser negativo.");
			}
		}while(true);
		
		//BUCLE QUE GENERA TABLA
		for (int i = 1;i <= LIMIT;i++) {
			System.out.println(i + " x " + number + " = " + i*number);
		}
		
	}

}
