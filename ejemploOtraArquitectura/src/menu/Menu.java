package menu;

import java.util.Scanner;

/**
 * Clase destinada a trabajr como interfaz de usuario del programa. 
 * Responsabilidad: 
 * - Mostrar información (System.out.print..)
 * 
 * @author Raul
 *
 */
public class Menu {

	//TODO Mejorar la estetica de los textos.
	private static final String MENU_PRINCIPAL = "¿Que quieres hacer? \n\r 1-añadir alumno \n\r 2- Mostrar estadisticas \n\r 3- salir";
	private static final String ESTADISTICA = "El numero de alumnos aprobados son: ";
	private static final String MENU_NOMBRE = "Indica el nombre del alumno";
	private static final String MENU_APROBADO = "¿El alumno esta aprobado? \n\r 1- Si \n\r 2- No";
	private static Scanner teclado=new Scanner(System.in);//TODO pasar el scaner por parametro
	//para mejorar el acoplamiento

	public static void menuPrincipal() {
		System.out.println(MENU_PRINCIPAL);//Mostrar informacion
	}

	public static void mostrarEstadisticas(int numeroAprobados) {
		System.out.println(ESTADISTICA+numeroAprobados);//Mostrar informacion

	}

	public static void obtenerNombre() {
		System.out.println(MENU_NOMBRE);//Mostrar informacion
	}

	public static void obtenerAprobado() {
			System.out.println(MENU_APROBADO);//Mostrar informacion
	}

}
