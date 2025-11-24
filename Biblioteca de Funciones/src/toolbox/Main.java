package toolbox;
import java.util.Scanner;

import Ej3.DayOfWeek;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

enum DayOfWeek {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
};

public class Main {

	public static void main(String[] args) {
		
		
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escriba el día de la semana (en inglés) para calcular su descuento: ");
		DayOfWeek day = DayOfWeek.valueOf(keyboard.readLine().toUpperCase());
	
		// TODO Auto-generated method stub
		//Scanner keyboard = new Scanner(System.in);
		//LocalDate date = Dates.buildDate(keyboard,"Introduce una fecha");
		//System.out.println(date);
		//System.out.println(Maths.calcFactorial(5));
		
		//System.out.println(Algorith.reverseNumber(500));
		// System.out.println(Maths.calcFibonacci(5));
		long startTime = System.nanoTime();
		//Proceso...
		long endTime = System.nanoTime();
		System.out.print((endTime - startTime)/1000000000);
		ArrayList <Integer> lista = new ArrayList<>();
		Collections.fill(lista,1);
		System.out.print(lista);
		Collections.rotate(lista, 2); // Rota 2 posiciones a la derecha
		System.out.println(lista);
		
		// PRIMITIVO -> WRAPPER
		char c = 'a';
		Character Chao = Character.valueOf(c);
		
		//WRAPPER -> PRIMITIVO
		Character Chao2 = 'a';
		char c2 = Chao2.charValue();
		
		
		
		String texto = "Hola";
		 // Opción 1: charAt()
		 char primeraLetra = texto.charAt(0); // 'H'
		 char segundaLetra = texto.charAt(1); // 'o'
		 // Opción 2: toCharArray()
		 char[] letras = texto.toCharArray();
		 char primeraLetra = letras[0]; // 'H
		
		//COlecciones.
		// Array → ArrayList
		String[] array = {"A", "B", "C"};
		ArrayList<String> lista = new ArrayList<>(Arrays.asList(array));
		// ArrayList → Array
		String[] nuevoArray = lista.toArray(new String[0]);
		// ArrayList → HashSet (eliminar duplicados)
		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3));
		HashSet<Integer> set = new HashSet<>(lista); // {1, 2, 3}
		// HashSet → ArrayList
		ArrayList<Integer> listaLimpia = new ArrayList<>(set);
		// HashMap → Set de claves
		Set<String> claves = mapa.keySet();
		// HashMap → List de valores
		List<Integer> valores = new ArrayList<>(mapa.values());
	}

}
