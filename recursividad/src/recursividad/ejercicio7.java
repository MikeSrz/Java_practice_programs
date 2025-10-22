package recursividad;

public class ejercicio7 {
	public static int countVowels(String str) {
		if(str.contains("a"))														     
			return 1+countVowels(str.replaceFirst("a", "")); 
		else if (str.contains("e"))							  
			return 1+countVowels(str.replaceFirst("e", ""));
					
		else if (str.contains("i"))
			return 1+countVowels(str.replaceFirst("i", ""));
					
		else if (str.contains("o"))
			return 1+countVowels(str.replaceFirst("o", ""));
		
		else if (str.contains("u"))
			return 1+countVowels(str.replaceFirst("u", ""));
		else 
			//CASO BASE
			return 0;
		
	}
	
	public static int countVowelsI(String str) {
		int count = 0;
		while (true) {
			if(str.contains("a")) {														     
				str = str.replaceFirst("a", ""); 
				count++;
			}
			else if (str.contains("e")) {							  
				str = str.replaceFirst("e", "");
				count++;
			}
			else if (str.contains("i")) {
				str = str.replaceFirst("i", "");
				count++;
			}
			else if (str.contains("o")) {
				str = str.replaceFirst("o", "");
				count++;
			}
			
			else if (str.contains("u")) {
				str = str.replaceFirst("u", "");
				count++;
			}
			else 
				//CASO BASE
				break;
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countVowels("Michaaael"));
		System.out.println(countVowelsI("Michaaael"));
		
	}

}
