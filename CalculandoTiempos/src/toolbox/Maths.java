//Funciones creadas por MikeSrz
package toolbox;

import java.math.BigInteger;

public class Maths {
	public static void printMultTables(int n) {
		final int END_OF_MULTIPLICATION = 10;
		for (int i = 0; i <= n; i++) {
			System.out.printf("    TABLA DEL %d%n", i);
			for (int j = 1;j <= END_OF_MULTIPLICATION ;j++) {
				System.out.printf("%3d x %3d = %3d%n", i, j, i * j);
			}
			System.out.println("-".repeat(25));
		}
	}
	
	public static boolean detectPrime(int n) {
		boolean isPrime = false;
			if (n >= 0) {
				//COMPROBACIÓN DE PRIMOS BÁSICOS
				if (n == 2 || n == 1) {
					isPrime = true;
					return isPrime;
				}
				else if (n % 2 == 0) { 
					return isPrime;
				}
				else {
					//COMPROBACIÓN BRUTA DE PRIMOS
					isPrime = true;
					for (int counter = 3; n/2 > counter; counter += 2) {
						if (n % counter == 0) {
							isPrime = false;
							return isPrime;
						}
					}
					return isPrime;
				}
			}
			else {
				return isPrime;
			}
	}
	
	public static long calcFactorial(int n) {
		if (n == 0)
			return 1;
		return n*calcFactorial(n-1);
	}

	
	public static BigInteger calcFactorial(BigInteger n) {
		if (n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
			
		return n.multiply(calcFactorial(n.subtract(BigInteger.ONE)));
		}
	
	public static long calcFibonacciRecursive(long n) {
		if (n <= 1)
			return n;
		return calcFibonacci(n-1)+calcFibonacci(n-2);
	}
	
	public static long calcFibonacci(long n) {
		long fibonacci = n;
		
		if (n <= 1)
			return fibonacci;
		//Comienzo de fibonacci
		fibonacci = 1;
		int lastNum = 1;
		int penultimate = 0;
		int result;
		//Iteración tantas veces como n.
		for (int i = 2; i < n; i++) {
			result = lastNum + penultimate;
			lastNum = penultimate;
			penultimate = result;
		}
		return lastNum;
	}
}
