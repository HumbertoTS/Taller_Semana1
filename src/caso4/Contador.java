package caso4;

public class Contador {

	//Variable estática contador
	static int contador = 0;
	
	//Método que incrementa el contador
	public void incrementa() {
		contador++;
	}
	
	 public static void main(String[] args) {
		 
		 //Creación de objetos
		 Contador objeto1 = new Contador();
		 Contador objeto2 = new Contador();
		 Contador objeto3 = new Contador();
		 Contador objeto4 = new Contador();
		 
		 //Incrementa contador
		 objeto1.incrementa();
		 objeto2.incrementa();
		 objeto3.incrementa();
		 objeto4.incrementa();
		 
		 //Resultado
		 System.out.println("Objetos creados: " + contador);
	 }
}
