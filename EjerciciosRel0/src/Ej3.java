import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
	enum DayOfWeek {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	};
	
	public static void main(String[] args) {
		final String TITLE = "CALCULADORA DE DESCUENTOS";
		final String EXIT_OPTION = "N";
		Scanner keyboard = new Scanner(System.in);
		DayOfWeek day;
		double productPrice;
		String option;

		while (true) {
			
			//DIBUJAR TÍTULO
			System.out.println(TITLE);
			System.out.println("-".repeat(TITLE.length()));
			
			//ENTRADA DE DATOS POR USUARIO
			try {
				System.out.print("Introduzca el precio de su producto: ");
				productPrice = (float)keyboard.nextDouble();
				keyboard.nextLine();
				System.out.print("Escriba el día de la semana (en inglés) para calcular su descuento: ");
				day = DayOfWeek.valueOf(keyboard.nextLine().toUpperCase());
				
				double priceDiscount = switch (day) {
					case MONDAY, TUESDAY, THURSDAY, FRIDAY -> 0.11;
					case WEDNESDAY -> 0.2;
					case SATURDAY, SUNDAY -> 0.15;
				};
			
				//SALIDA DE RESULTADO DE DESCUENTO
				System.out.println("El precio de su producto es de " + (productPrice*(1 - priceDiscount)) + "$ Se le ha aplicado un descuento del " + priceDiscount*100 + "%");	
				System.out.print("Quiere seguir realizando compras S/N: ");
			
				//ENTRADA DE DATOS PARA FINALIZAR O CONTINUAR CON COMPRAS.
				option = keyboard.nextLine();
				if (option == EXIT_OPTION) {
					System.out.println("Adiós :D");
					break;
				}
			}
			
			catch (InputMismatchException error) {
				System.out.println("Has introducido un valor inválido.");
				System.out.println("Pulsa ENTER para continuar");
				
				//LIMPIAMOS BUFFER Y CONTINUAMOS
				keyboard.nextLine();
				keyboard.nextLine();
			}
			catch (IllegalArgumentException error) {
				System.out.println("\nEse día de la semana no está en el intervalo[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY].");
				System.out.println("Pulsa ENTER para continuar...");
				
				//LIMPIAMOS BUFFER Y CONTINUAMOS
				keyboard.nextLine();
				keyboard.nextLine();
			}
			
			catch (ArrayIndexOutOfBoundsException error) {
				System.out.println("\nEse día de la semana no está en el intervalo[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY].");
				System.out.println("Pulsa ENTER para continuar...");
				
				//LIMPIAMOS BUFFER Y CONTINUAMOS
				keyboard.nextLine();
				keyboard.nextLine();
				}
		}
		keyboard.close();
	}
}