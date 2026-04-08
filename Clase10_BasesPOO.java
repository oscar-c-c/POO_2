// 1. Definimos nuestro "Plano" o Plantilla
class CuentaBancaria {
    // Atributos (Características)
    String titular;
    double saldo;

    // Métodos (Comportamientos)
    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println(titular + " depositó: $" + monto + ". Saldo actual: $" + saldo);
    }
}

// 2. Nuestra clase ejecutora principal
public class Clase10_BasesPOO {
    public static void main(String[] args) {
        
        // Instanciamos (creamos) un Objeto de la clase CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        // Asignamos valores a sus atributos
        cuenta1.titular = "Carlos";
        cuenta1.saldo = 50000.0;
        
        // Usamos sus métodos
        cuenta1.depositar(25000.0);
        
        // Podemos crear tantos objetos independientes como queramos basados en el mismo plano
        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.titular = "Diana";
        cuenta2.saldo = 100000.0;
        cuenta2.depositar(15000.0);
    }
}