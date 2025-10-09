import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio13 {
	//EXCEPCION PERSONALIZADA
	public static class NegativeException extends Exception {
		public NegativeException(String message) {
			super(message);
		}
	}
	
	public static void main(String[] args) {
		final String TITLE = "CALCULAR FACTORIAL DE UN NÚMERO";
		int acumulator = 1;
		int limit;
		Scanner keyboard = new Scanner(System.in);
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		//PEDIR DATOS A USUARIO
		while(true) {
			try { 
				System.out.print("Introduce un número: ");
				limit = keyboard.nextInt();
				if (limit < 0) 
				throw new NegativeException("[ERROR] El valor introducido es negativo.\nEl programa sólo recibe números naturales.");
				
				break;
			}
			
			catch (InputMismatchException error) {
				System.out.println("El valor introducido no es un número válido.");
				keyboard.nextLine();
			}

			catch (NegativeException error) {
				keyboard.nextLine();
				System.out.println(error.getMessage());
			}
		}
		
		for (int i = 1; i <= limit; i++) {
			acumulator *= i;
		}
		System.out.print("El resultado de !" + limit + " es " + acumulator);
		keyboard.close();
	}

}
