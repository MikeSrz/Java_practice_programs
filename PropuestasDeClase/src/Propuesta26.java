import java.util.Arrays;

public class Propuesta26 {
	public static void main(String args []) {
		int numbers [] = {1,2,3,4,5,6,7,8,9,-1,-2};
		int ac = 0;
		for (int x: numbers) {
			ac += x;
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println("la suma de todos los números es: " + ac);
	}
}
