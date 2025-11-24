import java.io.*;
import java.util.InputMismatchException;

public class Formateo_Texto {
	
	//EXCEPCIÓN PERSONALIZADA
	public static class NegativeNumberException extends Exception{
		public NegativeNumberException(String message) {
			super(message);
		}
	}
	//FUNCION GENERADORA DE TABLAS
	public static void showMultTables(int end) {
		final int END_OF_MULTIPLICATION = 10;
		for (int i = 0; i <= end; i++) {
			System.out.printf("Tabla del %d%n", i);
			for (int j = 1;j <= END_OF_MULTIPLICATION ;j++) {
				System.out.printf("%3d x %3d = %6d%n", i, j, i * j);
			}
			System.out.println("-".repeat(15));
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		final String TITLE = "TABLA DE MULTIPLICAR";
		int limit;
		String line;
		int number;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		//DIBUJAR TITULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		//PEDIR DATO AL USUARIO
		while(true) {
			try {
				System.out.print("¿Hasta qué tabla quieres ver?: ");
				line = keyboard.readLine();
				limit = Integer.parseInt(line);
				if (0 > limit) 
					throw new NegativeNumberException("El valor no puede ser negativo");
				
				break;
			}
			catch (InputMismatchException error){
				System.out.println("ERROR]Valor introducido no es válido.");
			}
			catch (NumberFormatException error){
				System.out.println("[ERROR]Valor introducido no es válido.");
			}
			catch (NegativeNumberException error) {
				System.out.println("[ERROR]El valor no puede ser negativo.");
			}
		}
		
		//BUCLE QUE GENERA TABLA
		showMultTables(limit);
	}

}
