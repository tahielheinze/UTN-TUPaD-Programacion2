// Crear una clase NaveEspacial con los atributos: nombre, combustible.
// Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
// Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
// Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado final

public class Ejercicio05 {

    // ATRIBUTOS PRIVATE
    private String nombre;
    private double combustible;
    private double combustibleMaximo;
    private double distanciaRecorrida;
    private boolean enVuelo;

    // CONSTRUCTOR
    public Ejercicio05(String nombre, double combustible, double combustibleMaximo) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.combustibleMaximo = combustibleMaximo;
    }

    // METODOS
    public void despegar() {
        if (combustible >= 10) {
            System.out.println(nombre + " ha despegado.");
            combustible -= 10;
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }
    public void avanzar(double distancia) {
        double consumo = distancia * 0.5; // Consumo de combustible por unidad de distancia
        if (combustible >= consumo) {
            distanciaRecorrida += distancia;
            combustible -= consumo;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar esa distancia.");
        }
    }
    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= combustibleMaximo) {
            combustible += cantidad;
            System.out.println(nombre + " ha recargado " + cantidad + " unidades de combustible.");
        } else {
            System.out.println(nombre + " no puede recargar esa cantidad, excede el máximo.");
        }
    }
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + combustibleMaximo);
        System.out.println("Distancia recorrida: " + distanciaRecorrida);
        System.out.println("En vuelo: " + (enVuelo ? "Sí" : "No"));
    }

    public static void main(String[] args) {
        
        // CREAR LA NAVE ESPACIAL
        System.out.println("");
        System.out.println("Creando nave espacial");
        Ejercicio05 nave = new Ejercicio05("TUPAD", 50, 100);
        nave.mostrarEstado();
        System.out.println("");

        // INTENTAR AVANZAR SIN RECARGAR
        System.out.println("Intentando avanzar sin recargar combustible");
        nave.avanzar(30); // Debería fallar por falta de combustible
        nave.mostrarEstado();
        System.out.println("");

        // RECARGAR COMBUSTIBLE
        System.out.println("Recargando combustible");
        nave.recargarCombustible(40); // Recargar 40 unidades
        nave.mostrarEstado();
        System.out.println("");

        // AVANZAR CORRECTAMENTE
        System.out.println("Avanzando correctamente");
        nave.avanzar(30); // Debería avanzar correctamente
        nave.mostrarEstado();
        System.out.println("");

        // ESTADO FINAL
        System.out.println("Estado final de la nave:");
        nave.mostrarEstado();
    }
}