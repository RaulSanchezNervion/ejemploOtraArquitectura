package main;

import java.util.LinkedList;

import clases.Alumno;
import gestora.Gestora;
import menu.Menu;
import validaciones.Validacion;

/**
 * Clase principal.
 * Responsabilidad: Es quien se encarga de orquestar que clase actua en cada caso, y crear 
 * el listado inicial de alumnos, para gestionarlo. 
 * Muestra información con el Menu, y obtiene información con las validaciones
 * 
 * @author Raul
 *
 */
public class Main {

	//Metodo principal del controlador.
	public static void main(String[] args) {
		LinkedList<Alumno> aula = new LinkedList<Alumno>();//Crea una lista inicial
		String eleccion;
		do {//En funcion de la eleccion del usuario, controla que se debe hacer
			Menu.menuPrincipal();
			eleccion=Validacion.menuPrincipal();
			switch (eleccion) {
			case "1"->addAlumno(aula);//Se quiere añadir un alumno
			case "2" -> showEstadisticas(aula);//Se quiere saber las estadisticas del aula
			}
		}while(!eleccion.equals("3"));//3 es la opcion para salir del programa
	}





	//Metodo para mostrar las estadisticas del aula por pantalla, en este caso en concreto el
	//numero de alumnos aprobados
	private static void showEstadisticas(LinkedList<Alumno> aula) {
		int numeroAprobados=Gestora.getNumeroAprobados(aula);
		Menu.mostrarEstadisticas(numeroAprobados);
	}

	//Metodo utilizado ara añadir un alumno nuevo al aula
	private static void addAlumno(LinkedList<Alumno> aula) {
		Menu.obtenerNombre();
		String nombre=Validacion.obtenerNombre();
		Menu.obtenerAprobado();
		boolean aprobado=Validacion.obtenerAprobado();
		Gestora.addAlumno(aula, new Alumno(nombre,aprobado));
	}
}