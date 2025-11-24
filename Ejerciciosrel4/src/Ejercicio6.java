import java.util.Random;
import java.io.*;

public class Ejercicio6 {
	public static boolean arrayBinarySearch(int vct[], int number) {
		int low = 0;
		int high = vct.length -1;
		int mid;
		int estimated;
		while (low <= high) {
			mid = (int)((low+high)/2);
			estimated = vct[mid];
			if (estimated == number) {
				return true;
			}
			else if (estimated > number)
				high = mid - 1;
			else {
				low = mid + 1;
			}
		}
		return false;
	}
	
	public static int throwDices(int times) {
		Random ran = new Random();
		int ac = 0;
		int dice;
		for (int i = 0; i < times; i++) {
			dice = ran.nextInt(1,7);
			ac = ac + dice;
		}
		return ac;		
	}
	
	public static void main(String[] args) throws IOException {
		int result;
		int LOOSER_POINT = 7;
		int winners[] = {7,11};
		int loosers[] = {2,3,12};
		boolean playerWins = false;
		int round;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		//PRIMERA RONDA
		round = 1;
		System.out.printf("%5sJUEGA A CRAPS\n","");
		
		result = throwDices(2);	
		System.out.printf("\n Ronda %d\n Lanza los dados pulsando ENTER...\n", round);
		
		keyboard.readLine();
		System.out.printf("Has sacado %d!!!\n",result);
		if (arrayContainsB(winners,result)) 
			playerWins = true;
			
		else if (arrayContainsB(loosers,result)) 
			playerWins = false;
			
		else {
			//RONDA => SEGUNDA Y DEMÁS...
			boolean finish = false;
			int winnerPoint = result;
			round++;
			while (!finish) {
				System.out.printf("\n Ronda %d\n Necesitas un %d para ganar!\n Lanza los dados pulsando ENTER...\n", round, winnerPoint);
				result = throwDices(2);
				keyboard.readLine();
				System.out.printf("Has sacado %d!!!\n",result);
				if (result == winnerPoint) {
					playerWins = true;
					finish = true;
				}
				
				if(result == LOOSER_POINT) {
					playerWins = false;
					finish = true;
				}
				round++;
			}
		}
		
		System.out.println("Has " + ((playerWins)?"ganado!":"perdido..."));
		
	}

}
