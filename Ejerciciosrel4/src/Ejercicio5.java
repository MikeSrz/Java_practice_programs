import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio5 {
	
	public static boolean arrayContains(int vct[], int number) {
		for (int n : vct) {
			if (number == n)
				return true;
		}
		return false;
	}
	
	public static void randomize(int vct[]) {
		//Recordemos que se pasa por referencia, 
		//así que con poner void nos basta para editar el array original.
		Random rand = new Random();
		int ranNumber;
		for (int i = 0; i < vct.length; i++) {
			do {
				ranNumber = rand.nextInt(1,50);
			}while(arrayContains(vct, ranNumber));

			vct[i] = ranNumber;
		}
	}
	
	public static void main(String[] args) {
		Set<Integer>[] myLotto = new HashSet[6];
		Set<Integer>[] winnerNumber = new HashSet[6];
		int count = 0;
		long startTime = System.nanoTime();
		randomize (winnerNumber);
		boolean isWinner = false;
		while (!isWinner) {
			randomize(myLotto);
			System.out.println("Tu juego boleto es: " + Arrays.toString(myLotto));
			if (Arrays.equals(winnerNumber, myLotto)) 
				isWinner = true;
			count++;
		}
		long endTime = System.nanoTime();
		System.out.println("¡El ticket ganador ha sido!: " + Arrays.toString(myLotto));
		System.out.printf("¡Has ganado tan sólo comprando %d tickets! El tiempo transcurrido fue de %d segundos.\n", count, (endTime - startTime)/1000000000);
	}
}
