// Declara una variable global Ejemplo de entrada/salida: = 0.10.
// Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%. 
// Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.

import java.util.Scanner;

public class Ejercicio11 {

    //Variable global
    static double descuentoGlobal = 0.10;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el precio del producto.
        System.out.println("Ingrese el precio del producto: $");
        double precio = scanner.nextDouble();

        // Validar que el precio sea positivo.
        if (precio <= 0 ) {
            System.out.println("ERROR. El precio ingresado no es valido.");
        }
        
        // Llamar al metodo calcularDescuentoEspecial.
        calcularDescuentoEspecial(precio);
        
        scanner.close();
    }
    
    //METODO para calcular el descuento especial.
    public static void calcularDescuentoEspecial (double precio){
        // Variable local para almacenar el descuento aplicado.
        double descuentoAplicado = precio * descuentoGlobal;

        // Calcular precio final.
        double precioFinal = precio - descuentoAplicado;

        //Imprimir los resultados.
        System.out.println("\n=== DESCUENTO ESPECIAL ===");
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento (" + (descuentoGlobal * 100) + "%): $" + descuentoAplicado);
        System.out.println("Precio final: $" + precioFinal);
    }
}
