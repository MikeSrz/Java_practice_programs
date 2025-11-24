package toolbox;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class fileHandling {
	public static int countLines(String flName) throws IOException{ 
		FileReader reader;
		BufferedReader readerFilter;
		String line;
		reader = new FileReader(flName);
		readerFilter = new BufferedReader(reader);

		line = readerFilter.readLine();
		int count = 0;
		while (line != null) {
			count++;
			line = readerFilter.readLine();
		}
		readerFilter.close();
		return count;
	}		
	
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
		File dir = new File("ruta/del/directorio");

        if (dir.exists() && dir.isDirectory()) {
            System.out.println("El directorio existe.");
        } else {
            System.out.println("El directorio NO existe.");
            dir.mkdirs();
            System.out.println("Directorio creado.");
        }
        
        Path path = Paths.get("C:/Users/ejemplo/documento.txt");
        Files.exists(path);        // comprueba si existe
        Files.isDirectory(path);   // comprueba si es un directorio
        Files.createDirectories(path); // crea directorios si no existen
        Files.delete(path);        // borra archivo o directorio
     
        if (Files.exists(path) && Files.isDirectory(path)) {
            System.out.println("El directorio existe.");
        } else {
            System.out.println("El directorio NO existe.");
            Files.createDirectories(path);
            System.out.println("Directorio creado.");
            Files.delete(path);
        }
        
        //RUTA ACTUAl
        Path currentPath = Paths.get("").toAbsolutePath();
        
        //CONCATENANDO RUTAS
        Path base = Paths.get("").toAbsolutePath();
        Path relative = Paths.get("textos/text.txt");
        Path dst = base.resolve(relative);
	}	
}
