import java.io.*;
public class EscribirFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DECLARACION DE el nombre externo y de la acción.
		
		//FileWriter y FileReader => Qué se declaran y funcionan parecido a BufferedReader
		String nombreArchivo = "prueba.txt";
		FileWriter escribir;
		
		//ESCRIBIR
		try {
			escribir = new FileWriter(nombreArchivo);
			//Escribiendo de la a a la z
			for ( char c = 'a'; c <= 'z';c++) {
				escribir.write(c);
			}
			escribir.close();
		}
		catch (IOException error) {
			System.out.println("Imposible escribir en el archivo.");
		}
		//LECTURA
		FileReader leer;
		int c;
		try {
			leer = new FileReader(nombreArchivo);
			c = leer.read();
			while (c != -1) { //-1 es el EOF.
				System.out.print((char)c);
				c = leer.read(); //Va leyendo 1 a 1 hasta EOF = -1
			}
			leer.close();
		}
		catch (IOException error) {
			System.out.println("No se puede leer el archivo.");
		}
	}

}
