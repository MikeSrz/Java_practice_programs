import java.util.Scanner;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class Ejercicio4 {
	//EXCEPCION PERSONALIZADA
	public static class ZeroException extends Exception{
		public ZeroException(String message) {
			super(message);
		}
	}
	
	public static void main(String[] args) throws ZeroException{
		
		final String TITLE = "COMPROBADOR DE PARES E IMPARES";
		int number;
		Scanner keyboard = new Scanner(System.in);
		
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		while (true) {
			try {
				System.out.print("Introduce un número: ");
				number = keyboard.nextInt();
				
				
				if (number == 0)
					throw new ZeroException("El 0 hace que salgas del programa.");
				else if (number % 2 == 0)
					System.out.println("El número es par.");
				else 
					System.out.println("El número no es par");
			}
			catch (InputMismatchException error) {
				System.out.println("El número introducido es demasiado grande");
				keyboard.nextLine();
				continue;
			}
			catch (NumberFormatException error) {
				System.out.print("Debes introducir un número entero");
			}
			catch (ZeroException error) {
				System.out.println(error.getMessage());
				break;
			}
		}

	}

}
