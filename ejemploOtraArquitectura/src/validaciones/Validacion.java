package validaciones;

import java.util.Scanner;

import menu.Menu;

/**
 * Clase destinada a trabajar como interfaz de usuario del programa. 
 * Responsabilidad: 
 * - Obtener información (Scanner..)
 * - Validar información 
 * 
 * En algunos metodos utiliza la clase Menu para mostrar informacion.
 * 
 * @author Raul
 *
 */
public class Validacion {

	public static String menuPrincipal() {
		Scanner teclado=new Scanner(System.in);
		return teclado.nextLine();//Obtener informacion
	}


	public static String obtenerNombre() {
		Scanner teclado=new Scanner(System.in);
		return teclado.nextLine();//Obtener informacion
	}

	public static boolean obtenerAprobado() {
		Scanner teclado=new Scanner(System.in);
		String aprobado=teclado.nextLine();//Obtener informacion
		while(!(aprobado.equals("1") || aprobado.equals("2"))){//Validamos el dato{
			Menu.obtenerAprobado();//Mostrar informacion
			aprobado=teclado.nextLine();//Obtener informacion
		}
		return aprobado.equals("1");
	}

}
