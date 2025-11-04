import java.io.*;

public class Ejercicio2 {
	
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
			String alphabet = "";
			String txt;
			
			
			for (char c = 'a'; c <= 'z';c++) {
				alphabet += (c +" ");
			}
			generateFile("texto.txt", alphabet);
			//printFile("texto.txt");
			
			System.out.println("\nVERSION-1");
			txt = extractText("texto.txt");	
			txt = txt.replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
			generateFile("texto_modificado.txt",txt);
			printFile("texto_modificado.txt");
			
			//Version 2
			System.out.println("\nVERSION-2");
			 txt = extractText("texto.txt");
			String replaced;
			String replacement;
			String input;
			enum Options{S,N};
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			boolean exit = false;
			while (!exit) {
				try {
					System.out.print(txt);
					System.out.println("¿Desea Sustituir algún grupo de caracteres del fichero? [S/N]: ");
					input = keyboard.readLine();
					 Options option = Options.valueOf(input.toUpperCase());
					 switch (option) {
					 	case S ->  {
					 				System.out.print("Escribe lo que quieras reemplazar: ");
					 				replaced = keyboard.readLine();
					 				System.out.print("Escribe el el reemplazo: ");
					 				replacement = keyboard.readLine();
					 				txt = txt.replace(replaced, replacement);
					 				System.out.println("texto modificado con éxito");
					 				generateFile("texto_modificado.txt", txt);
					 				}
					 	case N -> {
					 				System.out.println("Adiós");
					 				exit = true;
					 				}
					 }
					
				}
				catch (Exception error) {
					System.out.println("[ERROR] hubo un problema con el valor introducido.");
				}
			}
	}

}
