package colecciones;

import java.util.*;
import java.util.HashSet;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> cart = new HashMap<>();
		Random rand = new Random();
		HashMap<String, Float> shopItems = new HashMap<>(Map.of(
				"mandarina", 2.2f,
				"peras", 2.1f,
				"platano", 2.3f,
				"Manzana", 1.8f,
				"Kiwi",2.2f,
				"Ciruela",2.3f
				));
		ArrayList<String> fruits = new ArrayList<>();
		
		for (String valor : shopItems.keySet()) {
			fruits.add(valor);
		}

		System.out.println(fruits);
		String product;
		int num;
		for (int i = 0; i<10 ;i++ ) {
			num = rand.nextInt(fruits.size());
			product = fruits.get(num);
			cart.put(product, cart.getOrDefault(product, 0)+1);
		}
		
		HashMap<String, Float> prices = new HashMap<>();
		for (String fruit : fruits) {
			prices.put(fruit.concat(" Total"), cart.getOrDefault(fruit, 0)*shopItems.get(fruit));
		}
		System.out.println(cart);
		System.out.print(prices);
	}
}
