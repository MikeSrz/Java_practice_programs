import java.util.Scanner;

public class Propuesta12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora;
		int minutos;
		int segundos;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce una hora: ");
		hora = keyboard.nextInt();
		System.out.print("Introduce minutos: ");
		minutos = keyboard.nextInt();
		System.out.print("Introduce segundos: ");
		segundos = keyboard.nextInt();
		
		
		
		System.out.printf("Son las %02d:%02d:%02d",hora ,minutos,segundos);
	
	}

}
