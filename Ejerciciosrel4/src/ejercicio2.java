import java.io.*;
public class ejercicio2 {
	
	public static long sumArray(int[] mtrx) {
		long ac = 0;
		for (int e : mtrx) {
			ac = ac + e;
		}
		return ac;
	}
	
	public static long sumArray(int[] mtrx, boolean countPairPositions) {
		long ac = 0;
		for (int i = 0; i < mtrx.length; i++) {
			if (countPairPositions) {
				//Pares...
				if (i%2 == 0)
					ac = ac + mtrx[i];
			}
			else {
				//Impares...
				if (i%2 != 0)
					ac = ac + mtrx[i];
			}
		}
		return ac;
	}
	
	
	public static void pprintArray(int [] mtrx) {
		String spaces = "";
		for (int i = 0; i < mtrx.length; i++) 
			System.out.printf("|Posición:%2s%d%2sValor:%2s%s%2s|\n",spaces, i, spaces, spaces, mtrx[i], spaces);
	}
	
	public static int[] reverseArray(int[] mtrx) {
		int reversedAr[] = new int[mtrx.length];
		int len = mtrx.length;
		int limit = len/2;
		for (int i = 0; i <= limit;i++) {
			reversedAr[i] = mtrx[len-i-1];
			reversedAr[len-i-1] = mtrx[i];
		}
		return reversedAr;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String TITLE = "IMPRESIÓN DE DATOS";
		int numbers[] = new int[5];
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String line;
		for (int i = 0;i < numbers.length;i++) {
			try {
				System.out.print("Introduce un valor al String: ");
				line = keyboard.readLine();
				numbers[i] = Integer.valueOf(line);
			}
			catch (Exception error) {
				System.out.println("El valor introducido no es válido");
			}
		}
		
		System.out.println('\n'+TITLE+'\n'+"-".repeat(TITLE.length()));
		pprintArray(numbers);
		
		long sum = sumArray(numbers);
		long avg = sumArray(numbers)/numbers.length;
		System.out.printf("Sumatorio=%2d\nMedia=%2d",sum,avg);
		
		System.out.println("\nARRAY INVERTIDO:");
		pprintArray(reverseArray(numbers));
		
		System.out.printf("\nLa suma de todos los elementos en posición Impar: %2d\n",sumArray(numbers, false));
		System.out.printf("La suma de todos los elementos en posición Pares: %2d\n",sumArray(numbers, true));
		
	}
		

}
