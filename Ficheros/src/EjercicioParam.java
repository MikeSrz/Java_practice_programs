import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioParam {
	public static void generateFile(String flName, String str) throws IOException {
		FileWriter writer;
		BufferedWriter writeFilter;
		writer = new FileWriter(flName);
		writeFilter = new BufferedWriter(writer);
		writeFilter.write(str);
		writeFilter.close();
	}
	
	public static void printFile(String flName) throws IOException {
		FileReader reader;
		BufferedReader readerFilter;
		String line;
		reader = new FileReader(flName);
		readerFilter = new BufferedReader(reader);
		line = readerFilter.readLine();
		while (line != null) {
			System.out.println(line);
			line = readerFilter.readLine();
		}
		readerFilter.close();
	}
	
	public static String extractText(String flName) throws IOException {
		FileReader reader;
		BufferedReader readerFilter;
		reader = new FileReader(flName);
		readerFilter = new BufferedReader(reader);
		String line;
		String txt = "";
		line = readerFilter.readLine();
		while (line != null) { 
			txt += (line+"\n");
			line = readerFilter.readLine();
			}
		readerFilter.close();
		return txt;
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Ejec.java hola.txt manolo.txt a o
		if (args.length >= 4) {
			try {
			String txt;
			String srcFile = args[0];
			String dstFile = args[1];
			txt = extractText(srcFile);
			txt = txt.replace(args[2], args[3]);
			generateFile(dstFile, txt);
			System.out.println("El fichero modificado ha sido generado.");
			printFile(srcFile);
			System.out.println("Fichero modificado:");
			printFile(dstFile);
			} catch (IOException error) {
				//Afinar error.
				System.out.println("El fichero no se ha podido leer o modificar, quién sabe.");
			}
		}
		else {
			if (args[0].equals("/?")) {
				System.out.println("El programa funciona con una llamada así: Ejec.java hola.txt manolo.txt a o");
			} else { 
			System.out.println("No has introducido todos los argumentos.");
			}
		}
	}

}
