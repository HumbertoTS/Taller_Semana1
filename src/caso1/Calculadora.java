package caso1;
import java.util.Scanner;

public class Calculadora {

	//Método suma
	public static double sumar(double a, double b) {
		return a + b;
	}
	
	//Método resta
	public static double resta(double a, double b) {
		return a - b;
	}
		
	//Método multiplicar
	public static double multiplicar(double a, double b) {
		return a * b;
	}
		
	//Método dividir
	public static double divide(double a, double b) {
		return a / b;
	}
	
	public static void main (String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		int continuar = 1;
		while(continuar == 1) {
			
			//Ingreso de números
			System.out.print("Ingrese el primer número: \n");
			double num1 = sc.nextDouble();
			
			System.out.print("Ingrese el segundo número: \n");
			double num2 = sc.nextDouble();
			
			//Menú de la calculadora
			System.out.println("\nSeleccione una operación:");
			System.out.println("1.- Suma");
			System.out.println("2.- Resta");
			System.out.println("3.- Multiplicación");
			System.out.println("4.- División");
					
			System.out.println("Opción: ");
			int opcion = sc.nextInt();
			
			//Variable para resultado
			double resultado;
			
			//Condicional Switch/If
			switch(opcion) {
				case 1:
					resultado = sumar(num1, num2);
					System.out.println("El resultado de la suma es: " + resultado);
					break;
				
				case 2:
					resultado = resta(num1, num2);
					System.out.println("El resultado de la resta es: " + resultado);
					break;
					
				case 3:
					resultado = multiplicar(num1, num2);
					System.out.println("El resultado de la multiplicación es: " + resultado);
					break;
					
				case 4:
					if (num2 != 0) {
					resultado = divide(num1, num2);
					System.out.println("El resultado de la división es: " + resultado);
					} else {
						System.out.println("Error: no se puede dividir entre 0");
					}
					break;
				
				default:
					System.out.println("Opción inválida");
			}
			
			//Pregunta si quiere continuar
			System.out.println("\n¿Desea continuar?");
			System.out.println("1.- Sí");
			System.out.println("2.- No\n");
			System.out.println("Ingrese la opción: ");
			
			continuar = sc.nextInt();
			
			if(continuar == 2) {
				System.out.println("Gracias por usar la calculadora.");
			}
		}
		
		sc.close();

	}
	
}
