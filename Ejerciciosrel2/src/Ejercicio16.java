
import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class Ejercicio16 {
	
	public static void main(String[] args) throws IOException{
		final String TITLE = "EDAD Y ALTURAS DE ALUMNOS";
		final int NUMBER_OF_STUDENTS = 5;
		final float AVERAGE_HEIGHT = 1.75f;
		final int LEGAL_AGE = 18;
		
		
		int studentAge;
		float studentHeight;
		int studentAgeAcumulator = 0;
		float studentHeightAcumulator = 0;
		int studentAgeCounter = 0;
		int studentHeightCounter = 0; 
		
		String line;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		//BUCLE PARA INTRODUCIR ALTURAS Y EDADES.
		for (int i = NUMBER_OF_STUDENTS; i > 0; i--) {
			try {
				System.out.println("Alumnos a introducir restantes: " + (i));
				//INTRODUCIR DATOS DEL ALUMNO
				System.out.print("Introduce la edad de un alumno: ");
				line = keyboard.readLine();
				studentAge = Integer.parseInt(line);
				
				System.out.print("Introduce la altura de ese alumno: ");
				line = keyboard.readLine();
				studentHeight = Float.parseFloat(line);
				
				studentAgeAcumulator += studentAge;
				studentHeightAcumulator += studentHeight;
				if (LEGAL_AGE < studentAge)
					studentAgeCounter++;
				if (AVERAGE_HEIGHT < studentAge)
					studentHeightCounter++;
		
			}
			catch (InputMismatchException error) {
				System.out.println("[ERROR] El número introducido es demasiado grande.");
				i++;
			}
			
			catch (NumberFormatException error) {
				System.out.println("[ERROR] Valor introducido no válido");
				i++;
			}
			
		}
		
		//PROCESAMIENTO DE LOS DATOS
		System.out.println("La edad de alumnos media es: " + studentAgeAcumulator/NUMBER_OF_STUDENTS);
		System.out.println("La cantidad de alumnos mayores de edad es: " + studentAgeCounter);
		System.out.println("La altura de alumnos media es: " + studentHeightAcumulator/NUMBER_OF_STUDENTS);
		System.out.println("La cantidad de alumnos con una altura superior a la media es: " + studentHeightCounter);
		
	}
}
