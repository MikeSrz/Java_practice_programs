/*
 Autor: Michael
 Fecha: 05/10/2025
 Descripción: Algoritmo que invierte números.
 */

public class NumeroAlreves {
	
	public static int revertDigits(int number, int invertedNumber) {
		if (number == 0)
			return invertedNumber;
		invertedNumber = (invertedNumber*10) + (number % 10);
		return revertDigits(number/10, invertedNumber);
	}

	public static void main(String[] args) {
		System.out.print(revertDigits(567,0));
	}
	
}