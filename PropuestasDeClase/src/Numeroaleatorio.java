import java.util.Random;
public class Numeroaleatorio {
	public static void main(String[] args) {
		Random random = new Random();
		int min = 10;
		int max = 50;
		int numeroAleatorio = random.nextInt(max - min + 1) + min;
		System.out.println("Número aleatorio entre " + min + " y " + max + ": " + numeroAleatorio);
		
		//TAMBIEN...
		int  number = random.nextInt(min, max + 1);
	
	}
}
