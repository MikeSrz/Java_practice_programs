import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class propuesta18 {

	public static void main(String[] args) {
		//1900 HASTA AÑO ACTUAL
		boolean isCurrentDate = false;
		LocalDate specificDate = LocalDate.of(1900, 1, 1);
		
		for (int year = 1; !isCurrentDate ;year++) {
			if (LocaleDate.of(year,1,1))
				specificDate.plusYear(year);
		
		}
	}
