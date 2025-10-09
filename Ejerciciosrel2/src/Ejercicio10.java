public class Ejercicio10 {	
	
		public static void main(String[] args){
			final String TITLE = "LISTA DE NÚMEROS DEL 100 AL 0";
			final int LIMIT = 0;
			final int STEP = 7;
			
			//DIBUJAR TÍTULO
			System.out.println(TITLE);
			System.out.println("-".repeat(TITLE.length()));
			
			for (int i = 100; i >= LIMIT; i -= STEP) {
				System.out.print(i + (((i - STEP) < LIMIT)? "." : ", ")); 
			}
		}

	}
