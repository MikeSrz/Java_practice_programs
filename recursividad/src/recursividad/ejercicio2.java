package recursividad;

public class ejercicio2 {
	
	public static long totalSum(int num){
		if (num == 0)
			return 0;
		else
			return num+totalSum(num-1);
	}
	
	public static long totalSumI(int num) {
		
		int ac = 0;
		for (int i = 0; i <= num; i++) {
			ac=ac+i;
		}
		return ac;
	}
	
	public static void main(String[] args) {
		System.out.println(totalSum(100));
		System.out.println(totalSumI(100));
	}

}
