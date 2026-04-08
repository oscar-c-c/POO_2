import java.util.Scanner;

public class Clase05_Condicionales {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa la nota de tu parcial (0.0 a 5.0): ");
        double nota = lector.nextDouble();

        // Evaluamos condiciones de arriba hacia abajo
        if (nota >= 4.5) {
            System.out.println("¡Excelente trabajo!");
        } else if (nota >= 3.0) {
            System.out.println("Aprobaste, pero puedes mejorar.");
        } else {
            System.out.println("Reprobaste. Tienes que repasar las bases.");
        }
        lector.close();
    }
}