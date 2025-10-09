import java.io.*;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class Ejercicio3 {
	//EXCEPCION PERSONALIZADA
	public static class ZeroException extends Exception {
		public ZeroException(String message) {
			super(message);
		};
	}
	
	public static void main(String[] args) throws IOException, ZeroException {
		final String TITLE = "DETECTOR DE NEGATIVOS Y POSITIVOS";
		int number;
		String line;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		while (true) {
			try {
				System.out.print("Introduce un número: ");
				line = keyboard.readLine();
				number = Integer.parseInt(line);
				
				//3 CASOS DIFERENTES
				if ( number == 0) 
					throw new ZeroException("El número 0 termina el programa");
				else if (number > 0)
					System.out.println("El número es positivo.");
				else 
					System.out.println("El número es negativo.");
			}
			catch (InputMismatchException error) {
				System.out.println("El número introducido es demasiado grande.");
				//PREGUNTAR EN CLASE CÓMO LIMPIAR BUFFER
				continue;
			}
			catch (NumberFormatException error) {
				System.out.println("[ERROR] EL programa sólo recibe números enteros.");
			}
			catch (ZeroException error) {
				System.out.println(error.getMessage());
				break;
			}
			
		}
	}

}
