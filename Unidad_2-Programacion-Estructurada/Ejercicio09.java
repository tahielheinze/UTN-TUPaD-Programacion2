// A) calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
// Nacional: $5 por kg
// Internacional: $10 por kg
// B) calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
// Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar precio del producto.
        System.out.println("Ingrese el valor del producto: $");
        double precioProducto = scanner.nextDouble();

        // Solicitar peso del paquete en kg.
        System.out.println("Ingrese el peso del paquete (kg): ");
        double peso = scanner.nextDouble();

        //Evitar el salto de linea.
        scanner.nextLine();

        //Solicitar el tipo de envio Nacional o Internacional.
        System.out.println("Ingrese la zona de envío (Nacional o Internacional): ");
        String zona = scanner.nextLine();

        // Validar los datos solicitados.
        if (precioProducto <= 0 || peso <= 0) {
            System.out.println("ERROR. El precio y el peso deben ser mayores a 0");
        }
        if (!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional")) {
            System.out.println("ERROR. La zona de envio ingresad no es valida.");
        }

        //Calcular costo de envio.
        double costoEnvio = calcularCostoEnvio(peso, zona);

        //Calcular total de la compra.
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        // Imprimir resultados.
        System.out.println("--- RESUMEN DE LA COMPRA ---");
        System.out.println("Precio del producto: " +precioProducto);
        System.out.println("Peso del paquete: " +peso + " kg");
        System.out.println("Zona de envío: " +zona);
        System.out.println("Costo de envío: " +costoEnvio);
        System.out.println("Total a pagar: " +totalCompra);

        scanner.close();
    }
    // METODO PARA CALCUALR EL COSTO DE ENVIO.
    public static double calcularCostoEnvio (double peso, String zona){
        double costoPorKg;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        }
        else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        }
        else {
            return 0;
        }
        return peso * costoPorKg;
    }   
    // METODO PARA CALCUALR EL TOTAL DE LA COMPRA.
    public static double calcularTotalCompra (double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
}

