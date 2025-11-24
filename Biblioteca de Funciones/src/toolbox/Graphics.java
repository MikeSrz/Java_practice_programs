package toolbox;

public class Graphics {
	public static void pprintArray(int [] mtrx) {
		String spaces = "";
		for (int i = 0; i < mtrx.length; i++) 
			System.out.printf("|Posición:%2s%d%2sValor:%2s%s%2s|\n",spaces, i, spaces, spaces, mtrx[i], spaces);
	}
	
}
