import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio3 {
	
	public static void main(String[] args) {	
		String title = "COMPARACIÓN DE 2 NÚMEROS";
		int number1;
		int number2;
		Scanner keyboard = new Scanner(System.in);
		
		//DIBUJAR TÍTULO
		System.out.println(title);
		System.out.println("-".repeat(title.length()));
		
		//ENTRADA DE DATOS
		try {
		System.out.print("Introduzca un número: ");
			number1 = keyboard.nextInt();
			number2 = keyboard.nextInt();
			System.out.print("Introduzca un número: ");
			
			//COMPARACIÓN
			if (number1 == number2) 
				System.out.print("Son iguales.");
				
			else 
				System.out.print("No son iguales.");
				
		}
		
		catch (InputMismatchException error) {
			System.out.print("[ERROR] El valor introducido no es entero.");
		}
		
		keyboard.close();
	}
		
}
	
