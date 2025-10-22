import java.io.*;
public class propuesta24 {
	
	public static String replaceVowels(String str) {
		String vowels = "aeiouAEIOU";
		return str.replace("a", "4").replace("e","3").replace("i","1").replace("o","0").replace("u", "v").replace("A", "4").replace("E", "3").replace("I", "1").replace("O", "0").replace("U", "v");
		}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader keyboard =new BufferedReader(new InputStreamReader(System.in));
		Boolean validation = false;
		String password = "";
	
		
		while (!validation) {
			try {
				System.out.println("Inserte su contraseña: ");
				password = keyboard.readLine();
				validation = true;
			}
			catch (Exception e) {
				System.out.print("La contraseña no es válida.");
			}
		}
		//OBTENER CONTRASEÑA HACKEADA.
		System.out.println(replaceVowels(password));
		}
	}
