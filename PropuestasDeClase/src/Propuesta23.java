//Autor: Michael
//Fecha: 13/10/2025
//Descripción: Calcular factorial utilizando BigInteger.

import java.io.*;
import java.math.*;
	
public class Propuesta23 {	
	public static BigInteger calcFactorial(BigInteger n) {
		if (n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		
		return n.multiply(calcFactorial(n.subtract(BigInteger.ONE)));
	}
	
	public static void main(String[] args) throws IOException {
		int number;
		String line;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ingrese número número: ");
		line = keyboard.readLine();
		number = Integer.parseInt(line);
		System.out.println(calcFactorial(BigInteger.valueOf(number)));
	}
}
