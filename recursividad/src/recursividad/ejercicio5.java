package recursividad;



public class ejercicio5 {

	//propuesta de profe: String vocales = "aeiouEIOUáéíóúÁÉÍÓÚ"
	public static String eliminateVowels(String str) {	
		
		if(str.contains("a"))
			return eliminateVowels(str.replace("a", ""));
		else if (str.contains("e"))
			return eliminateVowels(str.replace("e", ""));
					
		else if (str.contains("i"))
			return eliminateVowels(str.replace("i", ""));
					
		else if (str.contains("o"))
			return eliminateVowels(str.replace("o", ""));
		
		else if (str.contains("u"))
			return eliminateVowels(str.replace("u", ""));
		else 
			//CASO BASE
			return str;
	}
	
	public static String eliminateVowelsI(String str) {
		while (true) {
			if(str.contains("a"))
				str = str.replace("a", "");
			else if (str.contains("e"))
				str = str.replace("e", "");
						
			else if (str.contains("i"))
				str = str.replace("i", "");
						
			else if (str.contains("o"))
				str = str.replace("o", "");
			
			else if (str.contains("u"))
				str = str.replace("u", "");
			else 
				break;
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(eliminateVowels("mosquito"));
		System.out.println(eliminateVowelsI("mosquito"));
	}

}
