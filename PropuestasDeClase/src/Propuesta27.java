
public class Propuesta27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numbers[] = {1.0,2.4,3.3,4.2,4.3};
		double ac = 0;
		for (double x: numbers) {
			ac+=x;
		}
		double avg = ac/numbers.length;
		System.out.println("La media es: " + avg);
		for (double x: numbers) {
			if (x > avg) {
				System.out.println(x);
			}
		}
	}

}
