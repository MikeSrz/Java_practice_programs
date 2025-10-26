import java.util.Random;
public class Ejercicio3 {
	public static void pprintMatrix(int[][] mtrx) {
		String spaces = "";
		for (int i = 0; i < mtrx.length; i++) {
			
			for (int j = 0; j < mtrx[i].length; j++) {
				System.out.printf("|%2s%3d%2s",spaces, mtrx[i][j],spaces);
			}
			System.out.println("|");
		}
	}
		
	public static void pprintVector(float[] v) {
		String spaces = "";
		for (int i = 0; i < v.length; i++) {
				System.out.printf("%1sFila%2d:%1s%.2f%1s|",spaces,i,spaces,v[i],spaces);
			}
			System.out.printf("\n");
	}
	
	public static float[] avgPerRowMatrix(int[][] mtrx) {
		float avgs [] = new float[mtrx.length];
		int ac;
		for (int i = 0; i < mtrx.length; i++) {
			ac = 0;
			for (int j = 0; j < mtrx[i].length; j++) {
				ac += mtrx[i][j];
			}
			 avgs[i] = ac/mtrx.length;
		}
		return avgs;
	}
	
	public static float totalAvgMatrix(int[][] mtrx) {
		int ac = 0;
		int totalCells = 0;
		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx[i].length; j++) {
				if (j == 0)
					//Como las columnas pueden ser diferentes lo hago en todas las filas una vez.
					totalCells += mtrx[j].length;
				ac += mtrx[i][j];
			}
			
		}
		return ac/totalCells;
	}
	
	public static void main(String[] args) {
		String TITLE = "MATRIZ ALEATORIA 10x10";
		Random rand = new Random();
		int matrix[][] = new int [10][10];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = rand.nextInt(100)+1;  
			}
		}
		System.out.printf("%10s%s\n","",TITLE);
		pprintMatrix(matrix);
		pprintVector(avgPerRowMatrix(matrix));
		System.out.printf("La media total es: %.2f ",totalAvgMatrix(matrix));
		
	}

}
