package playground;

public class formatoImpresion {
	public static void main(String args []) {
		String nombre = "Michael";
		String nombre2 = "Laura";
		String apellido =  "Zeraus";
		String apellido2 = "Oretob";
		String espacios = "";
		float altura = 1.7f;
		double dioptrias = 3.555;
		System.out.printf("Hola, %s! Qué tal?\n", nombre);
		System.out.printf("Hola %s %s %s, mido %.1f y tengo %.1f Dioptrías\n", nombre, apellido, apellido2, altura, dioptrias);
		System.out.printf("|%-15s|\n",nombre);
		System.out.printf("|%15s|\n",nombre2);
		
		//Centrar: hemos metido 5 espacios por delante y por detrás del nombre.
		System.out.printf("|%5s%s%5s|\n","",nombre,"");
		//Lo importante es entender que esas s de delante y detrás se tragan los espacios.
		System.out.printf("|%5s%s%5s|",espacios,nombre,espacios);
	}
}
