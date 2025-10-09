import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		
		String title = "Calcular Área de Círculo";
		final double PI = 3.141514;
		double radius;
		double area;
		Scanner keyboard = new Scanner(System.in);
		
		//DIBUJAR TÍTULO DE PROGRAMA
		System.out.println(title + "\n" + "-".repeat(title.length()));
		System.out.print("Introduzca el radio de su círculo: ");
		radius = keyboard.nextDouble();
		
		//CALCULAR AREA
		area = PI*radius*radius;
		System.out.println("El área del círculo es: " + area + "m^2");
		
		//CERRAR KEYBOARD
		keyboard.close();
	}
	
}
