package caso5;

import java.util.Scanner;
import java.util.ArrayList;

public class ListaEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Crea ArrayList
		ArrayList<String> estudiantes = new ArrayList<>();
		
		//variable que almacenará la cantidad
		int cantidad;
		
		try {
			
			//Ingresa la cantidad de alumnos
			System.out.println("¿Cuántos estudiantes desea ingresar?: ");
			cantidad = sc.nextInt();
			sc.nextLine();
			
			//Ingresa los nombres de los estudiantes
			for(int i = 0; i < cantidad; i++) {
				
				System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": " );
				String nombre = sc.nextLine();
				
				estudiantes.add(nombre);
			}
			
			//Mostrar lista
			System.out.println("\nLista de Estudiantes: ");
			for(String estudiante : estudiantes) {
				System.out.println(estudiante);
			}
			
		} catch (Exception e) {
			System.out.println("Error al ingresar dato del alumno");
		}
		
		sc.close();

	}

}
