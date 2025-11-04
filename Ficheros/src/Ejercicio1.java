import java.io.*;
public class Ejercicio1 {
	
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

	public static void main(String[] args) throws IOException {
		String evens = "Pares: ";
		String odds = "Impares: ";
		for (int i = 0; i <= 50; i++) {
			if (i%2 == 0)
				evens += (i+" ");
			else
				odds += (i+" ");
			}
		
		generateFile("pares.txt", evens);
		generateFile("impares.txt", odds);
		
		printFile("pares.txt");
		printFile("impares.txt");
	
	}
}
