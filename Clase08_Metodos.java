public class Clase08_Metodos {
    
    // Método que NO retorna valor (void), solo ejecuta una acción
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ". Analizando sistema...");
    }

    // Método que SÍ retorna un valor (int), realiza un cálculo y devuelve el resultado
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Llamado al método void
        saludar("Estudiante");
        
        // Llamado al método que retorna valor, guardando el resultado
        int resultado = sumar(15, 25);
        System.out.println("El resultado de la suma es: " + resultado);
    }
}