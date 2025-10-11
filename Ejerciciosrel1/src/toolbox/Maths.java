package toolbox;

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

}
