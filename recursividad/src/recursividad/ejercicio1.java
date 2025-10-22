package recursividad;

public class ejercicio1 {
	
	public static float power(float n, float e) {
		if (e < 0)
			return 1/n*(power(n,e+1));
		else if (e == 0)
			return 1;
		else
			return n*(power(n,e-1));
	}
	
	public static float powerI(float n, float e) {
		if (e < 0) {
			float mlt = 1/n;
			n = 1;
			while (e < 0) {
				n = n*mlt;
				e++;
			}
		}
		else {
			float mlt = n;
			n = 1;
			while (e == 1) {
				n = n*mlt;
				e = e-1;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, -3));
		System.out.println(powerI(2, -3));
	}
}
