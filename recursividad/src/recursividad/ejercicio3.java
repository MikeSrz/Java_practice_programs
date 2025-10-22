package recursividad;

public class ejercicio3 {
	public static long calcDivision(int dividend, int divisor) {
		if (dividend < divisor)
			return 0;
		
		return 1+calcDivision(dividend - divisor, divisor);
	}
	
	public static long calcDivisionI(int dividend, int divisor) {
		int quotient = 0;
		while (dividend >= divisor) {
			dividend = dividend-divisor;
			quotient++;
		}
		return quotient;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcDivision(12,4));
		System.out.println(calcDivisionI(12,4));
	}

}
