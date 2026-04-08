public class Clase04_LibreriaMath {
    public static void main(String[] args) {
        double base = 5.0;
        double exponente = 2.0;

        // Math.pow sirve para elevar un número a una potencia
        double potencia = Math.pow(base, exponente); 
        
        // Math.sqrt calcula la raíz cuadrada
        double raiz = Math.sqrt(25); 

        // Math.random genera un número aleatorio entre 0.0 y 0.999...
        double aleatorio = Math.random() * 100; 

        System.out.println("5 al cuadrado es: " + potencia);
        System.out.println("La raíz de 25 es: " + raiz);
        System.out.println("Número aleatorio (0-100): " + Math.round(aleatorio)); // Math.round redondea
    }
}