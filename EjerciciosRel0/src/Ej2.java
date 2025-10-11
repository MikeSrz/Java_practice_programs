import java.util.Scanner; 
import java.util.InputMismatchException;

public class Ej2 {
	enum TemperatureUnit {
		CELSIUS,
		FAHRENHEIT,
		KELVIN,
	};
	
	public static void main(String[] args) {
		final String TITLE = "CONVERSOR DE TEMPERATURA";
		TemperatureUnit chosenUnit;
		TemperatureUnit temperatureOriginalUnit;
		final int OFFSET = 1;
		final int EXIT_OPTION = 4;
		Scanner keyboard = new Scanner(System.in);
		int option;
		int temperature;
		
		while(true) {
			
			//DIBUJAR MENÚ
			System.out.println(TITLE);
			System.out.println("-".repeat(TITLE.length()));
			System.out.println("1) CELSIUS");
			System.out.println("2) FAHRENHEIT");
			System.out.println("3) KELVIN");
			System.out.println("4) SALIR");
			System.out.print("En qué unidad está su temperatura: ");
			
			//ENTRADA DE TEMPERATURA DEL USUARIO
			try {
				option = keyboard.nextInt();
				if (option == EXIT_OPTION) {
					System.out.print("Adiós :D");
					break;
				}
				temperatureOriginalUnit = TemperatureUnit.values()[ option - OFFSET];
				System.out.print("Ingrese la temperatura: ");
				temperature = keyboard.nextInt();
				System.out.print("A qué unidad desea convertir su temperatura?: ");
				option = keyboard.nextInt();
				if (option == EXIT_OPTION) {
					System.out.print("Adiós :D");
					break;
				}
				chosenUnit = TemperatureUnit.values()[option - OFFSET];
		
		
			//CONVERTIR A CELSIUS
			int celsiusTemperature = switch (temperatureOriginalUnit) {
				case CELSIUS -> temperature;
				case FAHRENHEIT -> (temperature -32)*5/9; 
				case KELVIN -> temperature - 273;
			};
			
			 
			//CONVERTIR A UNIDAD PEDIDA POR USUARIO
			int resultedTemperature = switch (chosenUnit) {
				case CELSIUS -> celsiusTemperature;
					
				case FAHRENHEIT -> (int)((float)celsiusTemperature *1.8+32);
					
				case KELVIN -> celsiusTemperature + 273;	
				
			};
			
			//IMPRESIÓN DE RESULTADO
			System.out.println("La temperatura es " + resultedTemperature + " " + chosenUnit.name().toLowerCase() + "\n");
			System.out.println("Pulsa ENTER para continuar...");
			//LIMPIAMOS BUFFER Y SE ABRE ENTRADA A ENTER
			keyboard.nextLine();
			keyboard.nextLine();
			}
			
			//MENSAJE DE ERROR DE LECTURA
			catch (InputMismatchException error) {
				System.out.println("La opción introducida no era numérica");
				System.out.println("Pulsa ENTER para continuar...");
				//LIMPIAMOS BUFFER Y SE ABRE ENTRADA A ENTER
				keyboard.nextLine();
				keyboard.nextLine();

			}
			
			catch (ArrayIndexOutOfBoundsException error) {
				System.out.println("Ese valor no está en el intervalo.");
				System.out.println("Pulsa ENTER para continuar...");
				//LIMPIAMOS BUFFER Y SE ABRE ENTRADA A ENTER
				keyboard.nextLine();
				keyboard.nextLine();
			}
		}
		keyboard.close();
	}

}
