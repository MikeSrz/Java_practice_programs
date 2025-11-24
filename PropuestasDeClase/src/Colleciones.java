import java.util.HashSet;

import com.sun.tools.classfile.Opcode.Set;

public class Colleciones {
	x
	public static void main(String[] args) {
		//CONJUNTOS
		Set<String>set = Set.of("hola","que","tal"); //Conjunto inmutable
		
		java.util.Set<Integer> enteros = new HashSet<>();
		System.out.println(enteros.size());
		enteros.add(1);
		enteros.add(5);
		enteros.remove(enteros);
		
		for (Integer elemento : enteros) {
			System.out.println(elemento);
		}
	}
}
