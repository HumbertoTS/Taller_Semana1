package caso2;

public class Persona {
	
	//Atributos de la clase Persona
	private String nombre;
	private int edad;
	
	//Método mostrarDatos();
	public void mostrarDatos() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		//Crear objetos
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
        Persona persona3 = new Persona();
		
		//Se asigna los valores
		persona1.nombre = "Humberto";
		persona1.edad = 29;
		
		persona2.nombre = "Amelyn";
		persona2.edad = 30;
		
		persona3.nombre = "Victor";
		persona3.edad = 32;
		
		//Muestra los datos
		persona1.mostrarDatos();
		persona2.mostrarDatos();
		persona3.mostrarDatos();
	}
	
}