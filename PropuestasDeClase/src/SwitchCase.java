import java.util.Scanner;

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

public interface SwitchCase {
	
	public static void main(String[] args) {
		MesAño mes = MesAño.ENERO;
		Scanner teclado = new Scanner(System.in);
		//PARA LEER CADENAS COMO ENUM.
		mes = MesAño.valueOf(teclado.nextLine());
		System.out.print("Introducce tu mes: ");
		switch(mes) {
			case ENERO: case MARZO: case MAYO: case JULIO: case AGOSTO: case OCTUBRE: case DICIEMBRE:
				System.out.println("Tiene 31 días.");
				break;
			case ABRIL: case JUNIO:	case SEPTIEMBRE: case NOVIEMBRE:
				System.out.println("Tiene 30 days");
			case FEBRERO:
				System.out.println("Tiene 28 days");
			break;
			default: 
				System.out.println("me llamo manolo.");
		}
		teclado.close();
	}
}
