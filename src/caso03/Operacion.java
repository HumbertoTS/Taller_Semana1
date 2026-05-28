package caso03;

public class Operacion {

    //Metodo que suma con dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar (double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        //Creación de Objeto
        Operacion ope = new Operacion();

        //Mostrar los resultados

        System.out.println("Suma de enteros: " + ope.sumar(5, 3));
        System.out.println("Suma de decimales: " + ope.sumar(5.2, 6.3));
        System.out.println("Suma de tres enteros: " + ope.sumar(9, 5, 8));
    }
}
