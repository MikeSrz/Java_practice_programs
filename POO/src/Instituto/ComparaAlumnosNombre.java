package Instituto;

import java.util.Comparator;

public class ComparaAlumnosNombre implements Comparator<Alumno>{
	@Override
	public int compare(Alumno a1, Alumno a2) {
		if (a1.compareTo(a2) == 0) {
			return a1.getNombre().compareTo(a2.getNombre());
		}
		return a1.compareTo(a2);
	}
}