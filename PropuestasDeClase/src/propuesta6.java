import java.util.Scanner;
enum Option {ALTAS, BAJAS, MODIFICACIONES, CONSULTAS, SALIR}

public class propuesta6 {
	public static void main(String[] arg) {
		final String TITLE = "BASE DE DATOS";
		Scanner keyboard = new Scanner(System.in);
		
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		System.out.println("1- Altas \n2.- Bajas \n3.- Modificaciones \n4.- Consultas \n5.- Salir");
		
		System.out.print("Ingrese una opción: ");
		keyboard.nextInt();
		
		keyboard.close();
	}
	
}
