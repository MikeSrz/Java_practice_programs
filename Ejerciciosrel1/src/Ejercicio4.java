import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		String title = "DETECTOR DE POSITIVOS Y NEGATIVOS";
		int number1;
		Scanner keyboard = new Scanner(System.in);
		
		//DIBUJAR TÍTULO
		System.out.println(title);
		System.out.println("-".repeat(title.length()));
		
		//ENTRADA DE DATOS Y GESTIÓN DE EXCEPCIONES.
		try {
		 System.out.print("Introduzca un número: ");
		 number1 = keyboard.nextInt();
		 
		 if (0 <= number1) 
			 System.out.println("El número introducido es positivo.");
			 
		 else 
			 System.out.println("El número introducido es negativo.");
		}
		
		catch (InputMismatchException error) {
			System.out.println("[ERROR] El valor introducido no es un número entero.");
			
		}
		
		keyboard.close();
	}
}
