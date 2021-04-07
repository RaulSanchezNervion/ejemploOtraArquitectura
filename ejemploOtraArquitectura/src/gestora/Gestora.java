package gestora;

import java.util.LinkedList;
import java.util.List;

import clases.Alumno;

/**
 * Clase de gestion. Su responsabilidad es operar con un listado de alumnos.
 * @author Raul
 *
 */

public class Gestora {
	
	
	/**
	 * Metodo utilizado para añadir un alumno
	 * Precondicion: alumnos no es null
	 * Postcondicion: El alumno se añade al atributo lista de alumnos
	 * Entrada: alumno y alumnos
	 * Salidas: Ninguna
	 * 
	 * @param alumnos listado de alumnos
	 * @param alumno que se va a añadir a la lista alumnos
	 */
	public static void addAlumno(List<Alumno> alumnos, Alumno alumno) {
		alumnos.add(alumno);
	}
	
	/**
	 * Metodo utilizado para saber el numero de alumnos aprobados 
	 * Precondicion: alumnos no es null
	 * Postcondicion: Devuelve el numero de objetos Alumno que tienen su atributo aprobado a true
	 * en la lista alumnos.
	 * Entradas: alumnos
	 * Salida: int, el numero de alumnos
	 * 
	 * @param alumnos listado de alumnos
	 * @return el numero de alumnos aprobados que hay en el aula
	 */
	public  static int getNumeroAprobados(List<Alumno> alumnos) {
		int aprobados=0;
		for(Alumno alumno:alumnos) {
			if(alumno.isAprobado())
				aprobados++;
		}
		return aprobados;
	}
}
