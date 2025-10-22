package recursividad;

public class ejercicio6 {

	public static int  countDigits(int number) {
		if (number < 10)
			return number;
		return number%10+countDigits(number/10);
	}
	
	public static int countDigitsI(int number) {
		int total = 0;
		while (number > 0) {
			number = number/10;
			total = total+number%10;
		}
		total=total+number;
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDigits(23));
		System.out.println(countDigitsI(23));
	}

}



