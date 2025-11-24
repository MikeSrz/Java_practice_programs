import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class Fechas {

	public static void main(String[] args) {
		final String TITLE = "MANEJO DE FECHAS";
		System.out.println(TITLE);
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("La fecha local es: " + currentDate);
		
		LocalDate specificDate = LocalDate.of (1994, 10, 9);
		System.out.println("En este año se hizo sonic: " + specificDate);
		
		LocalDate startOfWWII = LocalDate.parse("1939-08-01");
		System.out.println("Empezó la WWII: " + startOfWWII);
		
		String spanishMonth = currentDate.getMonth().getDisplayName(TextStyle.FULL, new Locale("es","ES"));
		
		//SI INTENTO EDITAR fechaActual, java crea un nuevo objeto fecha nuevo porque es inimmutable.
		System.out.print(StartOfWWII.plusDay(20)); //y así con 
		
		
		
		LocalDate fechaParseada = LocalDate.parse("2023-08-15");
		System.out.println("Fecha parseada: " + fechaParseada);
	}

}
