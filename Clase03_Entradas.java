import java.util.Scanner;

public class Clase03_Entradas {
    public static void main(String[] args) {
        // Instanciamos (creamos) nuestro lector de consola
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = lector.nextLine(); // Lee toda la línea de texto

        System.out.print("Ingresa tu edad: ");
        int edad = lector.nextInt(); // Lee un número entero

        System.out.println("Hola " + nombre + ", el próximo año tendrás " + (edad + 1) + " años.");
        
        // Es una buena práctica cerrar el scanner para liberar recursos
        lector.close();
    }
}