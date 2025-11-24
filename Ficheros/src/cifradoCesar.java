import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cifradoCesar {
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
	
	public static StringBuilder extractTextSB(String flName) throws IOException {
		FileReader reader;
		BufferedReader readerFilter;
		reader = new FileReader(flName);
		readerFilter = new BufferedReader(reader);
		String line;
		StringBuilder txt = new StringBuilder();
		line = readerFilter.readLine();
		while (line != null) { 
			txt.append(line+"\n");
			line = readerFilter.readLine();
			}
		readerFilter.close();
		return txt;
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
	
	public static 
	
	public static void main(String [] args) throws IOException{
		File srcFile = new File(args[0]);
		String dstFile = args[1];
		if (srcFile.exists()) {
			try {
				String file = args[0];
				
				
			} catch (Exception error) {
				
			}
		} else {
			System.out.println("[ERROR] EL fichero no existe.");
		}
		
	}
}
