package recursividad;

public class ejercicio4 {
	public static int strLength(String str) {
		if (str.equals(""))
			return 0;
		return 1 + strLength(str.substring(1));  	
	}
	
	public static int strLengthI(String str) {
		int length = 0;
		while (str != "") {
			str = str.substring(1);
			length++;
		}
		return length;
	}
	
 	public static void main(String[] args) {
		System.out.println(strLength("manolo")); 
		System.out.println(strLengthI("manolo")); 
	}
}
