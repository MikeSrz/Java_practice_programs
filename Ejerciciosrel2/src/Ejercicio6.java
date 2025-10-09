import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
public class Ejercicio6 {

	public static void main(String[] args) {
		final String TITLE = "ADIVINA UN NÚMERO";
		int number;
		Scanner keyboard = new Scanner(System.in);
		int secretNumber;
		boolean isGuessed = false;
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		//VALIDANDO NUMERO SECRETO
		do {
			try {
				System.out.print("Introduce tu número secreto(Que los otros jugadores no miren): ");
				secretNumber = keyboard.nextInt();
				break;
			}
			catch (InputMismatchException error) {
				System.out.println("El número introducido es demasiado grande.");
				keyboard.nextLine();
			}
			catch (NumberFormatException error) {
				System.out.println("El valor introducido no era un número entero.");
				keyboard.nextLine();
			}
			
		} while(true);
		
		//CICLO DE ADIVINACION DE NÚMERO SECRETO
		do {
			try {
				System.out.println("Adivina el número: ");
				number = keyboard.nextInt();
				
				//3 CASOS
				if (number == secretNumber){
					System.out.println("Correcto! " + number +  " era el número secreto.");
					isGuessed = true;
				}
				else if(number > secretNumber)
					System.out.println("El número secreto es más pequeño.");
				else
					System.out.println("El número secreto es más grande");
			} 
			catch (InputMismatchException error) {
				System.out.println("[ERROR] El número introducido es demasiado grande.");
				keyboard.nextLine();
			}
			catch (NumberFormatException error) {
				System.out.println("[ERROR] El valor introducido no es un número entero.");
				keyboard.nextLine();
			}
		} while (!isGuessed);
		
		keyboard.close();
	}

}
