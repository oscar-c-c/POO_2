import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase1 {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        String nombre = "DAVID";
        double dinero = 1.000;
        System.out.print(nombre + " tienes este dinero:" + "$ " + dinero);

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        PuedeVotar(20);
        PuedeVotar(16);
        PuedeVotar(18);
        PuedeVotar(17);
        
        String nombreSolicitado = solicitarNombre();
        System.out.println("Su nombre es: " + nombreSolicitado);
        
        SolicitarEdad();
    }
    // validar si la persona puede votar

    public static void PuedeVotar(int edad) {

        System.out.print("Su Edad es:" + edad + " ");

        if (edad >= 18) {
            System.out.println("Puede Votar");
        } else {
            System.out.println("lo sentimos no puede Votar");
        }
    }

    public static String solicitarNombre() {
        System.out.println("Ingrese su nombre");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String nombre = reader.readLine();
            return nombre;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void SolicitarEdad() {
        System.out.println("Ingrese su edad");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int edad = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}