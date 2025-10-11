import java.time.LocalDate;
import java.util.Scanner;

public class DiferenciaDias {

    // Función que devuelve los días entre dos fechas
    public static long diasEntre(LocalDate f1, LocalDate f2) {
        return Math.abs(f2.toEpochDay() - f1.toEpochDay());
    }
    
    public static String diferenciaDetallada(LocalDate f1, LocalDate f2) {
        // Asegurar que f1 <= f2
        if (f1.isAfter(f2)) {
            LocalDate temp = f1;
            f1 = f2;
            f2 = temp;
        }
        int annos = 0;
        while (!f1.plusYears(annos + 1).isAfter(f2)) {
            annos++;
        }
        int meses = 0;
        while (!f1.plusYears(annos).plusMonths(meses + 1).isAfter(f2)) {
            meses++;
        }
        int dias = (int) (f2.toEpochDay() - f1.plusYears(annos).plusMonths(meses).toEpochDay());

        return annos + " años, " + meses + " meses y " + dias + " días";
    }
    
    public static LocalDate pedirFecha(Scanner sc, String mensaje) {
        LocalDate fecha=null;
        boolean valida = false;

        while (!valida) {
            try {
                System.out.println(mensaje);
                System.out.print("Año: ");
                int anio = sc.nextInt();
                System.out.print("Mes: ");
                int mes = sc.nextInt();
                System.out.print("Día: ");
                int dia = sc.nextInt();

                fecha = LocalDate.of(anio, mes, dia); // Si no es válida, lanza excepción
                valida = true;
            } catch (Exception e) {
                System.out.println("Fecha no válida, inténtalo de nuevo.\n");
                sc.nextLine(); // limpiar el buffer
            }
        }
        return fecha;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        LocalDate f1=pedirFecha(sc, "Introduce una fecha: ");
        LocalDate f2=pedirFecha(sc, "Introduce otra fecha: ");

        System.out.println("Días entre " + f1 + " y " + f2 + ": " + diasEntre(f1, f2));
        System.out.println(diferenciaDetallada(f2, f1));
    }
}
