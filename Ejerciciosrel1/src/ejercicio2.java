import java.util.Scanner;
import java.util.InputMismatchException;

public class ejercicio2 {

	public static void main(String[] args) {
		
		String title = "CALCULAR LONGITUD DE CIRCUNFERENCIA";
		double PI = 3.141514;
		double circleRadius;
		double circleLength;
		Scanner keyboard = new Scanner(System.in);
		
		//DIBUJAR MENÚ
		System.out.println(title);
		System.out.println("-".repeat(title.length()));
		
		//ENTRADA DE RADIO
		try {
			System.out.print("Introduzca el radio de su circunferencia: ");
			circleRadius = keyboard.nextDouble();
			//CALCULAR LONGITUD
			circleLength = circleRadius*2*PI;
			System.out.print("La longitud de la circunferencia es " + circleLength  + "m");
			keyboard.close();
		}
		catch (InputMismatchException error){
			System.out.print("[ERROR] El valor introducido no es numérico.");
		}
	}

}
