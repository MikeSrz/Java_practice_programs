
public class inthexUnicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int -> hex
		int numero = 65;
		String hex = Integer.toHexString(numero);
		System.out.println(hex); //resultado 41
		
		//int -> unicode
		int codePoint = 65;        // Código decimal de 'A'
		char letra = (char) codePoint;
		
		//hex -> int
		String hex = "41";
		int numero = Integer.parseInt(hex, 16);
		System.out.println(numero);  // Resultado: 65
		
		//hex -> Unicode
		String hex = "41";
		int codePoint = Integer.parseInt(hex, 16);
		char unicodeChar = (char) codePoint;
		System.out.println(unicodeChar);  // Resultado: 'A'
		
		//Unicode -> hex
		char letra = 'A';
		String hex = Integer.toHexString(letra);
		System.out.println(hex);  // Resultado: "41"

	}

}
