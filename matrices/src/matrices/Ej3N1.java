package matrices;

import java.util.Arrays;

public class Ej3N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Bruce", "Lee", "olivia", "Norris","Arnold"};
		String poolOfVowels = "AEIOUaeiouáéíóúÁÉÍÓÚl";
		String namesInitByVowels[] = new String[names.length];
		for (int i= 0;i<names.length; i++) {
			if (poolOfVowels.contains(names[i].substring(0, 1))) {
				System.out.println(names[i]);
				namesInitByVowels[i] = names[i];
			}
		}
		//Quería probar esto...
		System.out.println(Arrays.toString(namesInitByVowels));
	}

}
