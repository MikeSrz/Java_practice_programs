import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio7 {

	public static void main(String[] args) {
		String title = "COMPARACION DE NÚMEROS";
		int number1;
		int number2;
		Scanner keyboard = new Scanner(System.in);

		//DIBUJAR MENÚ
		System.out.println(title);
		System.out.println("-".repeat(title.length()));
		
		//INTRODUCIR DATOS
		try {
			System.out.print("Introduce un número: ");
			number1 = keyboard.nextInt();
			System.out.print("Introduce un número: ");
			number2 = keyboard.nextInt();
			
			//COMPARACION
			if (number1 < number2) {
				System.out.print(number2 + " es mayor que " + number1 + ".\n" );
				
			} else if (number1 > number2) {
				System.out.print(number1 + " es mayor que " + number2 + ".\n");
				
			}
			
			else {
				System.out.print("Ambos números son iguales");
			}
			
		}
		
		catch (InputMismatchException error) {
			System.out.print("[ERROR] El valor introducido no es entero.");
			
		}
		
		keyboard.close();
	}

}
