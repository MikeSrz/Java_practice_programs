package playground;

import java.io.*;
public class manejoFicheross {
	
	public static void main(String[] args)throws IOException {
		FileWriter writer = new FileWriter("archivo.txt");
		writer.write("hola \n");
		writer.write("hola2\n");
		
		writer.close();
	
		
		BufferedWriter writer2 = new BufferedWriter(new FileWriter("archivo2.txt"));
		writer2.write("Primera Linea\n");
		writer2.newLine();
		
		writer2.close();
		
		FileReader reader = new FileReader("archivo.txt");
		int c = reader.read();
		while (c != -1 ) {
			c = reader.read();
			System.out.println((char)c);
		}
		
		reader.close();
		
		BufferedReader reader2 = new BufferedReader(new FileReader("archivo.txt"));
		String linea;
		BufferedWriter writer3 = new BufferedWriter(new FileWriter("modificado.txt"));
				
		linea = reader2.readLine();
		while (linea != null) {
			linea = linea.replace("a", "b");
			System.out.println(linea);
			writer3.write(linea);
			writer3.newLine();
			linea = reader2.readLine();
		}
		reader2.close();
		writer3.close();
		}
	
}
