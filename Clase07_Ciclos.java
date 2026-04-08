public class Clase07_Ciclos {
    public static void main(String[] args) {
        
        System.out.println("--- Ciclo FOR (Sabemos cuántas veces iterar) ---");
        // Inicio ; Condición límite ; Incremento
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteración For número: " + i);
        }

        System.out.println("\n--- Ciclo WHILE (Itera mientras se cumpla la condición) ---");
        int contador = 1;
        while (contador <= 3) {
            System.out.println("Iteración While número: " + contador);
            contador++; // No olviden el incremento, o tendrán un bucle infinito
        }
    }
}