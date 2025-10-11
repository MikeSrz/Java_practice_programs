import java.util.Scanner;
public class propuesta2 {

	public static void main(String[] args) {
		int age;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		
		age = keyboard.nextInt();
		
		if (18 > age) {
			System.out.println("Eres menor de edad");
		} else if ( 30 < age) {
			System.out.println("Eres viejo");
		} else {
			System.out.println("Eres Joven generacion");
		}
		
		keyboard.close();
	}

}
