public class Clase09_AlcanceVariables {
    
    // 1. Variable de Clase (Global para toda esta clase, requiere 'static' si se usa en main)
    static String universidad = "Universidad Nacional";

    public static void main(String[] args) {
        // 2. Variable Local (Solo existe dentro de este método main)
        String carrera = "Ingeniería de Software";
        
        System.out.println("Institución: " + universidad);
        System.out.println("Carrera: " + carrera);
        
        mostrarDatos();
    }

    public static void mostrarDatos() {
        // Aquí SÍ podemos usar 'universidad' porque es global
        // Aquí NO podemos usar 'carrera' porque es local del método main
        System.out.println("Reafirmando institución desde otro método: " + universidad);
    }
}