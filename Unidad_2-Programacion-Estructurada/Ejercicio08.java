// Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
//PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
//PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
//Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar al usuario los datos.
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de impuesto (%): ");
        double impuestoPorcentaje = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento (%): ");
        double descuentoPorcentaje = scanner.nextDouble();

        // Convertir los porcentajes a decimales.
        double impuesto = impuestoPorcentaje / 100;
        double descuento = descuentoPorcentaje / 100;

        // Calcular precio final.
        double PrecioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Imprimir resultados.
        System.out.println("--- RESUMEN DE LA COMPRA ---");
        System.out.println("Precio Base: " +precioBase);
        System.out.println("Impuesto (" + impuestoPorcentaje + "%): $" + (precioBase * impuesto));
        System.out.println("Descuento (" + descuentoPorcentaje + "%): $" + (precioBase * descuento));
        System.out.println("Precio Final: $" + PrecioFinal);

        scanner.close();
    }

    // Metodo para calcular el precio final.
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
}