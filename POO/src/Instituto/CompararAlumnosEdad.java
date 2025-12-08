package Instituto;
import java.util.Comparator;
public class CompararAlumnosEdad implements Comparator<Alumno>{
	@Override
		public int compare(Alumno a1, Alumno a2) {
			int diferencia = a1.edadDeNacimiento - a2.edadDeNacimiento;
			if 	(diferencia != 0) {
				return diferencia;
			}
	}
}