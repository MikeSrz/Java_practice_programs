package toolbox;

public class Algorith {
	public static int reverseNumber(int number) {
		int invertedNumber = 0;
		while (number != 0) {
		invertedNumber = (invertedNumber*10) + (number % 10);
		number = number/10;
	}
	return invertedNumber;
	}
	
}
