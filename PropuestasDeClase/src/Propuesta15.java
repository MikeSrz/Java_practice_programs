/*
Autor: Michael
Fecha: 04/10/2025
Descripción: Midiendo el tiempo que tarda en ejecutarse un programa que calcula factorial, MÉTODO CON RECURSIÓN. 
 */

import java.lang.NumberFormatException;
import java.util.concurrent.TimeUnit;
import java.io.*;
public class Propuesta15{
	
	//EXCEPCION PERSONALIZADA
	public static class NegativeException extends Exception{
		public NegativeException(String message) {
			super(message);
		}
	}
		
	public static long calculateFactorial(int n) {
		if (n == 0)
			return 1;
		return n*calculateFactorial(n-1);
	}
	
	public static void main(String[] args) throws IOException {
		
		long startTime = System.nanoTime();
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
			
				
			} catch (NumberFormatException error) {
				System.out.println("[ERROR] El valor introducido no es un número natural.");
			}
			catch (NegativeException error) {
				System.out.println(error.getMessage());
			}
		}
		//LLAMADA A FUNCIÓN FACTORIAL E IMPRESIÓN DE RESULTADO.
		System.out.println("El factorial es: " + calculateFactorial(number));
		keyboard.close();
		long endTime = System.nanoTime();
		System.out.println("Tiempo de ejecución en milisegundos: " +(endTime - startTime)/1000000);
}
}
