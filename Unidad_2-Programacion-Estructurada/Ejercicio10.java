//Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida)
//que calcule el nuevo stock después de una venta y recepción de productos:
//NuevoStock = StockActual − CantidadVendida + CantidadRecibida
//NuevoStock = CantidadVendida + CantidadRecibida
// Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar stock actual al usuario.
        System.out.println("Ingrese la cantidad de stock actual: ");
        int stockActual = scanner.nextInt();

        //Solicitar cantidad vendida.
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();

        //Solicitar cantidad recibida.
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();

        // Validar los datos recibidos.
        if (stockActual < 0 || cantidadRecibida < 0 || cantidadVendida < 0) {
            System.out.println("ERROR. Los datos ingresados no son validos.");
        }
        if (cantidadVendida > stockActual){
            System.out.println("Cuidado: No se puede vender una cantidad superior al stock actual");
            System.out.println("Stock actual: " +stockActual);
            System.out.println("Intento de venta: " +cantidadVendida);
        }

        // Calcular nuevo stock.
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar resultados
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Stock actual: " + stockActual);
        System.out.println("Cantidad vendida: " + cantidadVendida);
        System.out.println("Cantidad recibida: " + cantidadRecibida);
        System.out.println("Nuevo stock: " + nuevoStock);

        scanner.close();
    }
    
    // METODO PARA ACTUALIZAR STOCK
    public static int actualizarStock (int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
