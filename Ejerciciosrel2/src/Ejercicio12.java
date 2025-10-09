
public class Ejercicio12 {	
	
		public static void main(String[] args){
			final String TITLE = "LISTA DE NÚMEROS DEL 100 AL 0";
			final int STEP = 2;
			int acumulator = 1;
			int oddCounter = 0;
			
			//DIBUJAR TÍTULO
			System.out.println(TITLE);
			System.out.println("-".repeat(TITLE.length()));
			
			for (int i = 1;oddCounter < 10; i += STEP) {
				acumulator *= i;
				oddCounter += 1;
			}
			System.out.print("El producto de los 10 primeros impares: " + acumulator);
		}
}