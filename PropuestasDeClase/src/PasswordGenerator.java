

/*
Generador de contraseñas que obtiene la longitud de la contraseña, mayusculas, minusculas, especiales y numeros. 
El usuario pide x campos y le dice si no es posible y se lo crea. Dame una contraseña con varios parámetros. 
Generador = may +  min + esp + num
 */
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
	public static String generarContraseña( int lon) {
		String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiales = "!@#$%&*";

		String todos = "";

	        if (mayus.equalsIgnoreCase("s")) {
	            todos += mayusculas;
	        }
	        if (minus.equalsIgnoreCase("s")) {
	            todos += minusculas;
	        }
	        if (nums.equalsIgnoreCase("s")) {
	            todos += numeros;
	        }
	        if (esp.equalsIgnoreCase("s")) {
	            todos += especiales;
	        }
	        
	        if ()

	        if (todos.isEmpty()) {
	            System.out.println("Debes elegir al menos un tipo de carácter.");
	            sc.close();
	        }
	        
			if (lon < todos.length())
				return "No se puede generar la contraseña con la longitud y las opciones elegiddas ERROR 201.";
			Random random = new Random();
	        
	        String contraseña = "";
	        for (int i = 0; i < lon; i++) {
	            contraseña += todos.charAt(random.nextInt(todos.length()));
	        }
	        return contraseña;
	}
	
    public static void main(String[] args) {
     	        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Introduce la longitud de la contraseña: ");
        int longitud = sc.nextInt();   
        sc.nextLine();

        System.out.print("¿Quieres mayúsculas? (s/n): ");
        String opciones + sc.nextLine();

        System.out.print("¿Quieres minúsculas? (s/n): ");
        String opciones + sc.nextLine();

        System.out.print("¿Quieres números? (s/n): ");
        String opciones + sc.nextLine();

        System.out.print("¿Quieres caracteres especiales? (s/n): ");
        String esp  sc.nextLine();

       
        
        String contraseña = generarContraseña(todos, longitud);
        System.out.println("Tu contraseña generada es: " + contraseña);
        sc.close();
    }
}