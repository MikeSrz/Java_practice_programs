import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio5 {

	public static void main(String[] args) {
		String title = "DETECTOR DE MULTIPLOS";
		int number1;
		int number2;
		Scanner keyboard = new Scanner(System.in);
		
		//DIBUJAR TÍTULO
		System.out.println(title);
		System.out.println("-".repeat(title.length()));
		
		//ENTRADA DE DATOS:
		try {
			System.out.print("Introduzca un número: ");
			number1 = keyboard.nextInt();
			System.out.print("Introduzca un número: ");
			number2 = keyboard.nextInt();
			
			if (number1 % number2 == 0) {
				System.out.println("El número introducido es múltiplo.");
				
			}
			else {
				System.out.println("El número introducido no es múltiplo.");
				
			}
		
		}
		catch (InputMismatchException error) {
			System.out.print("[ERROR] El valor introducido no es un número entero.");
		}
		
		keyboard.close();
	}

}
