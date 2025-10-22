import java.io.*;
import java.util.Random;
public class Propuesta25 {
	/*º
	 Generador de contraseñas: Pide la longitud, si quiere mayúsculas, minúsculas, 
	 numeros o caracteres especiales. Se debe generar al azar y 
	 debe contener todas las opciones seleccionadas.
	 */
	public static void printMenu() {
		System.out.println("MENÚ DE OPCIONES");
		System.out.println("1) Mayúsculas");
		System.out.println("2) Minúsculas");
		System.out.println("3) Números");
		System.out.println("4) Caracteres Especiales");
	}
	
	public static String generatePassword(String input, int length) {
		//Options => 1) Mayus 2)Minus 3) Num 4) carácteresEspeciales
		Random random = new Random();
		int typeOfChar;
		if (input.length() > length || input.length() > 4)
			return "No se puede generar una contraseña con esas opciones.";
		
		String password = null;
		for (int i = 0; i <= length; i++) {
			
			if (input.contains("1") && input.contains("2") && input.contains("3") && input.contains("4")) {
				typeOfChar = random.nextInt(1, 5);
				switch (typeOfChar) {
					case 1 -> password += (char)random.nextInt(65, 90 + 1); 
					case 2 -> password += (char)random.nextInt(97, 122 + 1);
					case 3 -> password += (char)random.nextInt(48, 57 + 1);
				}
			}
			else if (input.contains("1") && input.contains("2") && input.contains("3")) {
				typeOfChar = random.nextInt(1, 4);
				switch (typeOfChar) {
					case 1 -> password += (char)random.nextInt(65, 90 + 1); 
					case 2 -> password += (char)random.nextInt(97, 122 + 1);
					case 3 -> password += (char)random.nextInt(48, 57 + 1);
				}
			}
			else if (input.contains("1") && input.contains("2")){
				typeOfChar = random.nextInt(1, 3);
				switch (typeOfChar) {
					case 1 -> password += (char)random.nextInt(65, 90 + 1); 
					case 2 -> password += (char)random.nextInt(97, 122 + 1);
				}
			}
				
			else if (input.contains("1")) {
				(char)random.nextInt(65, 90 + 1);
			}
			else {
				return "No ha introducido opciones entre [1-4]";
			}
		}
		
		return password;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final String TITLE = "GENERADOR DE CONTRASEÑAS";
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String options = null;
		String passwordLength = null;
		
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		boolean validation = false;
		while(!validation) {
			printMenu();
			try {
				System.out.print("Construya su contraseña insertando la combinación que desea ");
				options = keyboard.readLine();
				System.out.print("Ingrese la longitud que desea: ");
				passwordLength = keyboard.readLine();
			} 
			catch (Exception error) {
				System.out.print("[ERROR] pulse ENTER para reingresar datos...");
				keyboard.readLine();
			}
			
			generatePassword(options, passwordLength);
		
		}
	}
}

