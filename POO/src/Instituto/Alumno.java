package Instituto;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

enum Horario { MAÑANA, TARDE}

public class Alumno implements Comparable <Alumno>{
	
	//ATRIBUTOS
	private String nombre;
	String apellido;
	int edadDeNacimiento;
	int numeroPersonal;
	String grupo;
	Horario horario;
	private static int contador = 0;
	
	//CONSTRUCTORES
	Alumno(){
		Random rand = new Random(); 
		int totalNombres = Datos.nombre.length;
		int totalApellidos = Datos.apellido.length;
		this.nombre = Datos.nombre[rand.nextInt(totalNombres)];
		this.apellido = Datos.nombre[rand.nextInt(totalApellidos)];
		this.edadDeNacimiento = rand.nextInt(1999,2015);
		if (rand.nextInt() >= 0.8 ) {
			this.horario = horario.TARDE;
		} else {
			this.horario = horario.MAÑANA;
		}
		contador++;
	}
	
	Alumno(String nombre, String apellidos, int añoDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellidos;
		this.edadDeNacimiento = añoDeNacimiento;
		contador++;
	}
	//METODOS
	@Override
	public int compareTo(Alumno a){
		return this.apellido.compareTo(a.apellido);
	}
	
	/*
	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.edadDeNacimiento.compareTo(a2.edadDeNacimiento);
	}
	*/
	String getNombre() {
		return this.nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//SOBRECARGA DE METODOS
	void setNombre(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	
	}

	@Override
	public String toString() {
		return String.format(
				"Alumno [nombre=%s, apellido=%s, edadDeNacimiento=%s, numeroPersonal=%s, grupo=%s, horario=%s]", nombre,
				apellido, edadDeNacimiento, numeroPersonal, grupo, horario);
	}
	
	//
	@Override
	public int hashCode() {
		return Objects.hash(apellido, edadDeNacimiento, horario, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellido, other.apellido) && edadDeNacimiento == other.edadDeNacimiento
				&& horario == other.horario && Objects.equals(nombre, other.nombre);
	}
	//METODOS ESTÁTICOS
	public static int getContador() {
		return contador;
	}
}
