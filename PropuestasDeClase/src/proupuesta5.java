import java.util.Scanner;
public class proupuesta5 {
	public static void main(String [] arg) {
		Scanner keyboard = new Scanner(System.in);
		int count = 1;
		int number = keyboard.nextInt();
		int control = 3;
	
		while (control != 0) {
			if (number % 2 == 0) {
				System.out.print("No es primo");
				control = 0;
			} else if (number % count == 0) { 
				System.out.print("No es primo");
				control = 0;
			}
			else {
				control = ((count >= number) ? count+=2 : 0);
				
			}
			
		}
	}
}
