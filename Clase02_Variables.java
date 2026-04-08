public class Clase02_Variables {
    public static void main(String[] args) {
        // --- Tipos Primitivos (Almacenan valores simples directamente en memoria) ---
        int edad = 20;               // Números enteros
        double promedio = 4.5;       // Números decimales de doble precisión
        boolean esEstudiante = true; // Valores lógicos: true o false
        char inicial = 'A';          // Un solo carácter (se usan comillas simples)

        // --- Clases / Objetos (Almacenan referencias) ---
        String nombre = "Ana";       // Cadenas de texto (se usan comillas dobles). String es una Clase.

        System.out.println("El estudiante " + nombre + " (" + inicial + ") tiene " + edad + " años.");
        System.out.println("Promedio: " + promedio + " | ¿Activo?: " + esEstudiante);
    }
}