import java.util.ArrayList;

import java.util.Scanner;

public class Ejercicio1 {

	public static void rellenarLista(ArrayList<String> personas) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		String respuesta;
		do {
			System.out.println("Introduce un nombre de una persona");
			nombre=entrada.nextLine();
			personas.add(nombre);
			System.out.println("Deseas introducir otra persona ?");
			respuesta = entrada.nextLine();
		}while(respuesta.equalsIgnoreCase("si"));
	}
	
	public static void mostrarLista(ArrayList<String> personas) {
		int i;
		for(i=0;i<personas.size();i++) {
			System.out.println(personas.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> personas = new ArrayList <String>();
		rellenarLista(personas);
		mostrarLista(personas);
	}

}
