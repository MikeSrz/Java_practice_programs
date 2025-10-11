import java.io.*;
import java.lang.NumberFormatException;
public class propuesta9 {
	//EXCEPCION PERSONALIZADA
	public static class NegativeNumberException extends Exception{
		public NegativeNumberException(String message) {
			super(message);
		}
	}
	//FUNCION QUE DETECTA PRIMOS
	public static boolean detectPrime(int n) {
		boolean isPrime = false;
			if (n >= 0) {
				//COMPROBACIÓN DE PRIMOS BÁSICOS
				if (n == 2 || n == 1) {
					isPrime = true;
					return isPrime;
				}
				else if (n % 2 == 0) { 
					return isPrime;
				}
				else {
					//COMPROBACIÓN BRUTA DE PRIMOS
					isPrime = true;
					for (int counter = 3; n/2 > counter; counter += 2) {
						if (n % counter == 0) {
							isPrime = false;
							return isPrime;
						}
					}
					return isPrime;
				}
			}
			else {
				return isPrime;
			}
	}

	public static void main(String[] args) throws IOException, NegativeNumberException{
		final String TITLE = "DETECTOR DE NUMEROS PRIMOS";
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int limit;
		
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		//ENTRADA DEl LIMITE
		do {
			try {
				System.out.print("Introduzca el límite: ");
				line = keyboard.readLine();
				limit = Integer.parseInt(line);
				
				//EXCEPCIÓN NEGATIVA
				if (limit < 0){
					throw new NegativeNumberException("Los numeros negativos no son Naturales. Introduce un número natural.");
				}
				break;
			}
			catch (NumberFormatException error) {
				System.out.println("Debe introducir un número natural.");
			}
			catch (NegativeNumberException error) {
				System.out.println(error.getMessage());
			}
		} while(true);
		
		//LÓGICA DEL PROGRAMA
		for (int i = 0; i < limit; i++) {
			if(detectPrime(i)) {
				System.out.printf("Numero Primo: %-2d%n", i);
			}
		}
	}
}
