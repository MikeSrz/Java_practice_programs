
import java.io.*;
public class cesar {
	
	public static void encryptTextCesar(BufferedReader src, int shift) throws IOException {
	    int character;
	    int offset;

	    while ((character = src.read()) != -1) {

	        // minúsculas
	        if (character > 122 - shift && character <= 122) {
	            offset = character - (122 - shift + 1);
	            character = 97 + offset;
	        }
	        else if (character >= 97 && character <= 122) {
	            character = character + shift;
	        }

	        // mayúsculas
	        else if (character > 90 - shift && character <= 90) {
	            offset = character - (90 - shift + 1);
	            character = 65 + offset;
	        }
	        else if (character >= 65 && character <= 90) {
	            character = character + shift;
	        }

	        System.out.print((char) character);
	    }
	    src.close();
	}
	
	public static void decryptTextCesar(BufferedReader src, int shift) throws IOException {
	    int character;
	    int offset;

	    while ((character = src.read()) != -1) {

	        // minúsculas (a–z)
	        if (character < 97 + shift && character >= 97) {
	            // si cae antes de 'a' tras restar shift, hacemos wrap
	            offset = (character - 97) + (26 - shift);
	            character = 97 + offset;
	        }
	        else if (character >= 97 && character <= 122) {
	            character = character - shift;
	        }

	        // mayúsculas (A–Z)
	        else if (character < 65 + shift && character >= 65) {
	            offset = (character - 65) + (26 - shift);
	            character = 65 + offset;
	        }
	        else if (character >= 65 && character <= 90) {
	            character = character - shift;
	        }

	        System.out.print((char) character);
	    }
	    src.close();
	}

	
	


	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("theVeldt.txt"));
		encryptTextCesar(reader, 2);
	}
}