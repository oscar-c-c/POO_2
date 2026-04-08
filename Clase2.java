import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase2 {

    public static void main(String[] args) {

        PuedeVotar();

    }

    public static void PuedeVotar() {
        String nombre = solicitarNombre();
        int edad = SolicitarEdad();

        if (edad >= 18) {
            System.out.println(nombre + " puedes votar");
        } else {
            System.out.println(nombre + " no puedes votar");
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

    public static int SolicitarEdad() {
        System.out.println("Ingrese su edad");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int edad = Integer.parseInt(reader.readLine());
            return edad;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}