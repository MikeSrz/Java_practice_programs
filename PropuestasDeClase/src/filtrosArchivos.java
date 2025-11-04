import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
public class filtrosArchivos {

	public static void main(String[] args) {
		//DECLARACION DE el nombre externo y de la acción.
		//FileWriter y FileReader => Qué se declaran y funcionan parecido a BufferedReader
		String nombreArchivo = "./src/filtrosArchivos.java";
		String nuevoArchivo = "código.txt";
		FileWriter escribir;
		FileReader leer;
		
		//El filtro es para añadir métodos interesantes que harán la ejecución mejor.
		BufferedReader filtroLectura;
		BufferedWriter filtroEscritura; // Tengo que implementarlo.
		
		String linea;
		//ESCRIBIR
		try {
			escribir = new FileWriter(nuevoArchivo);
			leer = new FileReader(nombreArchivo);
			
			//El filtro recibe un fichero leido por fileReader. 
			filtroEscritura = new BufferedWriter(escribir);
			filtroLectura = new BufferedReader(leer);
			
			int num = 1;
			linea = filtroLectura.readLine();
			while (linea != null) {
				System.out.println(num + ". " + linea); //Imprimes en consola lo que luego escribes.
				filtroEscritura.write(num +". "+ linea+"\n");
				linea = filtroLectura.readLine(); //Leer y guardar linea de este mismo fichero.
				num++;
			}
			//Escribiendo de la a a la z.
			filtroLectura.close();
			filtroEscritura.close();
		}
		catch (IOException error) {
			System.out.println("Imposible escribir en el archivo.");
		}
		
	}

}

