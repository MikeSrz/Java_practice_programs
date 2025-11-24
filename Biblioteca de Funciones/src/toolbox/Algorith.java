package toolbox;

import java.util.Random;

public class Algorith {
	public static int reverseNumber(int number) {
		int invertedNumber = 0;
		while (number != 0) {
		invertedNumber = (invertedNumber*10) + (number % 10);
		number = number/10;
	}
	return invertedNumber;
	}
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
	
	public static int  countDigits(int number) {
		if (number < 10)
			return number;
		return number%10+countDigits(number/10);
	}
	
	
	
}
