/*
Autor: Michael
Fecha: 04/10/2025
Descripción: Midiendo el tiempo que tarda en ejecutarse un programa que calcula factorial, MÉTODO BURRO. 
 */
import java.lang.NumberFormatException;
import java.util.concurrent.TimeUnit;
import java.io.*;
public class Factorial {
	
	//EXCEPCION PERSONALIZADA
	public static class NegativeException extends Exception{
		public NegativeException(String message) {
			super(message);
		}
	}
		
	public static long calculateFactorial(int n) {
		//ACUMULADOR DEL RESULTADO
		long factorial = 1;
		for (long i = 1; i <= n; i++) {
		factorial = factorial*i;	
		}
		return factorial;
	}
	
	public static void main(String[] args) throws IOException {
		
		long startTime = System.currentTimeMillis();
		final String TITLE = "Calcular Factorial";
		int number;
		String line;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
			
		//BUCLE DE CONTROL
		while (true) {
			try {
				System.out.print("Introduce un número: ");
				//ENTRADA DE DATOS DE USUARIO
				line = keyboard.readLine();
				number = Integer.parseInt(line);
			
				if ( 0 > number)
					throw new NegativeException("[ERROR]No se contemplan los números negativos.");
				break;
				
			} catch (NumberFormatException error) {
				System.out.println("[ERROR] El valor introducido no es un número natural.");
			}
			catch (NegativeException error) {
				System.out.println(error.getMessage());
			}
		}
		//LLAMADA A FUNCIÓN FACTORIAL E IMPRESIÓN DE RESULTADO.
		System.out.println("El factorial es: " + calculateFactorial(number));
		long endTime = System.currentTimeMillis();
		keyboard.close();
		System.out.println("Tiempo de ejecución en milisegundos: " +(endTime - startTime));
}
}
