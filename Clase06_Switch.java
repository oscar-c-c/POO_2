import java.util.Scanner;

public class Clase06_Switch {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa una opción (1=Java, 2=Python, 3=C++): ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste Java: Excelente para POO Empresarial.");
                break; // El break es vital para que no siga ejecutando los demás casos
            case 2:
                System.out.println("Elegiste Python: Genial para Datos e IA.");
                break;
            case 3:
                System.out.println("Elegiste C++: Perfecto para rendimiento extremo.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        lector.close();
    }
}