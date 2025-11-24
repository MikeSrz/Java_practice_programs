package toolbox;

public class StringTools {
	public static String[] textToArray(String txt) {
		String[] poolOfChars = {".",",","|","-","*",":","[","]","(",")","/","?","!","<",">","&","%",";","#","@","$",".","^","“","”","«","»"};
		txt = txt.trim();
		for (String spChar : poolOfChars) {
			txt = txt.replace(spChar, "");
		}
		String [] words = txt.split(" ");
		
		return words;
	}
	
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
}
