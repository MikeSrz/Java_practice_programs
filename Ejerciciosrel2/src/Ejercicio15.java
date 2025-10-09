
import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class Ejercicio15 {
	
	public static void main(String[] args) throws IOException{
		final String TITLE = "ANÁLISIS DE SALARIOS";
		int salary;
		String line;
		int aboveSalaryCounter = 0;
		int acumulator = 0;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		for (int counter = 10; counter > 0; counter--) {
			try {
				System.out.print("Introduce un número: ");
				line = keyboard.readLine();
				salary = Integer.parseInt(line);
				acumulator += salary;
				
				if (1000 < salary)
					aboveSalaryCounter++;
			}
			catch (InputMismatchException error) {
				System.out.println("[ERROR] El número introducido es demasiado grande.");
			}
			
			catch (NumberFormatException error) {
				System.out.println("[ERROR] El valor introducido no era numérico");
			}
		}
		System.out.println("El sumatorio de salarios es: " + acumulator);
		System.out.println("La cantidad de trabajadores con sueldo mayor a 1000 es: " +  aboveSalaryCounter);
		
	}
}
