package recursividad;

public class ejercicio9 {

	public static long calcBinomial(int n, int k) { 
		if (k >= n) 
			//CASO BASE
			return 1;
		return (n*calcBinomial(n-1, k))/
				((n-k));
	}

	public static void main(String[] args) {
		System.out.println(calcBinomial(5,2));
	}

}
