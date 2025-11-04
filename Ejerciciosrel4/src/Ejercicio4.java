import java.util.Random;
import java.util.Arrays;
public class Ejercicio4 {
	
	
	public static double avgResults(int[] lst,int [] values, long n) {
		long sumResults = 0;
		for (int i = 0; i < lst.length; i++) { 
				sumResults+=(lst[i]*values[i]);
		}
		
		return sumResults/n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int diceResult;
		int listOfFrequencies[] = new int [11];
		int totalThrows = 10000;
		for (int i = 0; i < totalThrows; i++) {
			diceResult = rand.nextInt(6)+1 + rand.nextInt(6)+1;
			switch (diceResult) {
				case 2 -> listOfFrequencies[diceResult-2] += 1;
				case 3 -> listOfFrequencies[diceResult-2] += 1;
				case 4 -> listOfFrequencies[diceResult-2] += 1;
				case 5 -> listOfFrequencies[diceResult-2] += 1;
				case 6 -> listOfFrequencies[diceResult-2] += 1;
				case 7 -> listOfFrequencies[diceResult-2] += 1;
				case 8 -> listOfFrequencies[diceResult-2] += 1;
				case 9 -> listOfFrequencies[diceResult-2] += 1;
				case 10 -> listOfFrequencies[diceResult-2] += 1;
				case 11 -> listOfFrequencies[diceResult-2] += 1;
				case 12 -> listOfFrequencies[diceResult-2] += 1;
			}
		}
		System.out.println("La lista de frecuencias es: " + Arrays.toString(listOfFrequencies));
		int listOfValues[] = {2,3,4,5,6,7,8,9,10,11,12};
		System.out.print("La media es: " + avgResults(listOfFrequencies, listOfValues, totalThrows));
		
		
	}
}