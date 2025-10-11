import java.util.Scanner;
public interface propuesta4 {
	enum MesAño {
		ENERO,
		FEBRERO,
		MARZO,
		ABRIL,
		MAYO,
		JUNIO,
		JULIO,
		AGOSTO,
		SEPTIEMBRE,
		OCTUBRE,
		NOVIEMBRE,
		DICIEMBRE,
	}
	
	public static void main(String[] args) {
		MesAño mes = MesAño.ENERO;
		Scanner teclado = new Scanner(System.in);
		//PARA LEER CADENAS COMO ENUM.
		mes = MesAño.valueOf(teclado.nextLine());
		System.out.print("Introducce tu mes: ");
		switch(mes) {
			case ENERO, MARZO, MAYO, JULIO, AGOSTO, OCTUBRE, DICIEMBRE ->
				System.out.println("Tiene 31 días.");
			case ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE ->
				System.out.println("Tiene 30 days");
			case FEBRERO ->
				System.out.println("Tiene 28 days");
			default ->
				System.out.println("me llamo manolo.");
		}
		teclado.close();
	}
}