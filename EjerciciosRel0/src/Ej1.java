import java.util.Scanner;

public class Ej1 {
	 
	public static void main(String[] args) {
		
		String title = "Formulario";
		String name;
		int age;
		double height;
		String isWorking;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(title);
		System.out.println("-".repeat(title.length()));
		
		System.out.print("Nombre: ");
		name = keyboard.nextLine();
		System.out.print("Edad: ");
		age = keyboard.nextInt();
		System.out.print("Altura(metros): ");
		height = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("¿Tiene Trabajo?Si/No: ");
		isWorking = keyboard.nextLine();
		
		int yrsToRetirement = 67 - age;
		
		title = "Impresión de datos de " + name;
		
		System.out.println ("\n" + title);
		System.out.println("-".repeat(title.length()));
		System.out.print("Nombre: " + name + "\nEdad: " + age + "\nAltura: " + height + "\nTrabaja: " + isWorking + "\nJubilación en " + yrsToRetirement +  " años.");
		keyboard.close(); 
	}

}
