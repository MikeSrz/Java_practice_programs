import java.util.Scanner;
import java.util.InputMismatchException;


public class Ejercicio9 {
//PEDIR UN NÚMERO ENTRE 0 Y 9.999 Y DECIR CUANTAS CIFRAS TIENE.
	public static void main(String[] args) {
		final String TITLE= "CONTADOR DE CIFRAS";
		final float MAX_LIMIT = 9.999f;
		final float MIN_LIMIT = 0f;
		final int DOT_FLOAT = 1;
		
		String textNumber;
		float number;
		int digits;
		Scanner keyboard = new Scanner(System.in);
		
		
		//DIBUJAR MENÚ.
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		//INTRODUCCIÓN DE DATOS POR USUARIO.
		try {
			System.out.print("Introduzca un número en el intervalo [0, 9.999]: ");
			number = keyboard.nextFloat();
		
			//COMPROBACION DE INTERVALO.
			if (MIN_LIMIT <= number && MAX_LIMIT >= number) {
				//DETECTANDO SI TIENE DECIMAL
				
				if ( 0 == (number - Math.round(number))) {
					//ELIMINANDO DECIMALES Y PARSEANDO A STRING
					textNumber = Integer.toString((int)number);
					digits = textNumber.length();
					System.out.print((digits == 1) ? "El número tiene " + digits + " cifra." : "El número tiene " + digits + " cifras.");
					
				}
				else {
					//PARSEAMOS NUMBER A STRING(NOS FACILITA EL CONTEO DE CIFRAS)
					textNumber = Float.toString(number);
					//CONTEO DE CIFRAS CASO CON DECIMALES
					digits = textNumber.length() - DOT_FLOAT;
					System.out.println("El número tiene " + digits  + " cifras");
					
				}
			}
				
			else {
				System.out.println("El número introducido no se encuentra en el intervalo.");
			}
		}
			
		
		
		catch (InputMismatchException error) {
			System.out.println("[ERROR]El número introducido no es un número en punto flotante.");
		}

	}
}
