import java.util.Scanner;
import java.lang.NumberFormatException;

public class Ej4 {
	enum DniChar {
		T,R,W,A,G,M,Y,F,P,D,X,B,N,J,Z,S,Q,V,H,L,C,K,E
	};

	public static void main(String[] args) {
		final String TITLE = "VALIDADOR DE DNI";
		String dni;
		int dniValidationNumber;
		boolean validation = false;
		Scanner keyboard = new Scanner(System.in);
		
		//DIBUJAR TÍTULO
		System.out.println(TITLE);
		System.out.println("-".repeat(TITLE.length()));
		
		while (!validation) {
			try {
				System.out.print("Ingrese su DNI: ");
				 dni = (keyboard.nextLine().trim().toUpperCase());
				 dniValidationNumber = Integer.parseInt(dni.substring(0, 8)) % 23;
				 
				 if (dni.substring(8,9).equals(DniChar.values()[dniValidationNumber].toString())) {
					 validation = true;
				}
				 else {
					 System.out.println("DNI no válido.");
					 System.out.println("LETRA INTRODUCIDA: "+ dni.substring(8,9) + " | LETRA CALCULADA: " + DniChar.values()[dniValidationNumber].toString());
				 }
			}
			catch(NumberFormatException error){
				System.out.println("[Error] Debe introducir un DNI en el formáto XXXXXXXa");
			
			}
		}
		
		System.out.println("Perfecto, su documento ha sido validado.");
		keyboard.close();
	}
}
