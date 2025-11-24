import java.io.BufferedReader;
import java.io.InputStreamReader;

//EXCEPCION PERSONALIZADA
	public static class NegativeNumberException extends Exception{
		public NegativeNumberException(String message) {
			super(message);
		}
	}
	
	public static void printMultiplicationTable(int n) {
		System.out.printf("")
		System.out.printf("");
		for (int i = 1; i <= 10; i++) {
			
		}
	}
	
public class propuesta10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String TITLE = "DETECTOR DE NUMEROS PRIMOS";
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int number;
		
		//ENTRADA DE DATOS
				do {
					try {
						System.out.print("Introduzca el límite: ");
						line = keyboard.readLine();
						number = Integer.parseInt(line);
						//EXCEPCIÓN NEGATIVA
						if (number < 0){
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
				} while (true)
		
	}

}
