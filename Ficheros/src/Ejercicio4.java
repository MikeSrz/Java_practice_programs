import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4 {
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
	
	public static int countLines(String flName) throws IOException{ /*me gustaría, en un futuro, meter un binario con flags,
	 																	Opciones contar{lineas ó caracteres}*/
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
	
	
	public static String[] textToArray(String txt) {
		String[] poolOfChars = {".",",","|","-","*",":","[","]","(",")","/","?","!","<",">","&","%",";","#","@","$",".","^","“","”","«","»"};
		txt = txt.trim();
		for (String spChar : poolOfChars) {
			txt = txt.replace(spChar, "");
		}
		String [] words = txt.split(" ");
		
		return words;
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
		generateFile("fichero.txt","Hola que tal Rigoberto");
		String txt = extractText("fichero.txt");
		String [] words = textToArray(txt);
		String aux = "";
		for (String word : words) {
			if (word.length() > 5)
				aux += word+" ";
		}
		generateFile("fichero2.txt",aux);
	}

}
