/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_TP8;

/**
 *
 * @author tnhei
 */
public class Main{
    
    public static void main(String[] args) {
        
        System.out.println("=== PARTE 1: SISTEMA E-COMMERCE ===\n");
        
        // Crear productos
        Producto producto1 = new Producto("Notebook", 1500.00);
        Producto producto2 = new Producto("Mouse", 25.50);
        Producto producto3 = new Producto("Teclado", 75.00);
        
        System.out.println("Producto: " + producto1.getNombre() + " - Total: $" + producto1.calcularTotal());
        
        // Crear pedido
        Pedido pedido = new Pedido();
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        System.out.println("\nTotal del pedido: $" + pedido.calcularTotal());
        
        // Crear cliente y asociarlo al pedido
        Cliente cliente = new Cliente("Juan Perez", "juan@email.com");
        pedido.setCliente(cliente);
        
        // Cambiar estado del pedido (notifica al cliente)
        System.out.println("\nCambiando estado del pedido:");
        pedido.cambiarEstado("En proceso");
        pedido.cambiarEstado("Enviado");
        
        // Procesar pagos con descuentos
        System.out.println("\n--- Procesando pagos ---");
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        double totalConDescuentoTarjeta = tarjeta.aplicarDescuento(pedido.calcularTotal());
        System.out.println("Total con descuento Tarjeta (5%): $" + totalConDescuentoTarjeta);
        tarjeta.procesarPago(totalConDescuentoTarjeta);
        
        System.out.println();
        Paypal paypal = new Paypal("usuario@mp.com");
        double totalConDescuentoPaypal = paypal.aplicarDescuento(pedido.calcularTotal());
        System.out.println("Total con descuento PayPal (3%): $" + totalConDescuentoPaypal);
        paypal.procesarPago(totalConDescuentoPaypal);
        
        System.out.println("\n\n=== PARTE 2: EJERCICIOS DE EXCEPCIONES ===\n");
        
        // Ejercicio 1: Division segura
        System.out.println("--- Ejercicio 1: Division segura ---");
        EjerciciosExcepciones.divisionSegura();
        
        // Ejercicio 2: Conversion de cadena
        System.out.println("\n--- Ejercicio 2: Conversion de cadena ---");
        EjerciciosExcepciones.conversionCadena();
        
        // Ejercicio 3: Lectura de archivo
        System.out.println("\n--- Ejercicio 3: Lectura de archivo ---");
        EjerciciosExcepciones.lecturaArchivo();
        
        // Ejercicio 4: Validacion de edad
        System.out.println("\n--- Ejercicio 4: Validacion de edad ---");
        EjerciciosExcepciones.ejercicioEdad();
        
        // Ejercicio 5: Try-with-resources
        System.out.println("\n--- Ejercicio 5: Try-with-resources ---");
       EjerciciosExcepciones.lecturaConTryWithResources();
    }
}
