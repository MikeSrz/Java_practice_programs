import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio6 {

	public static void main(String[] args) {
		String title = "ORDENANDO 2 NUMEROS";
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
			
			//ORDENACIÓN
			System.out.println((number1 > number2) ? number1 + ", " + number2 : number2 + ", " + number1);
			
		}
		
		catch (InputMismatchException error) {
			System.out.print("[ERROR] El valor introducido no es entero.");
			
		}
		
		keyboard.close();
	}

}
