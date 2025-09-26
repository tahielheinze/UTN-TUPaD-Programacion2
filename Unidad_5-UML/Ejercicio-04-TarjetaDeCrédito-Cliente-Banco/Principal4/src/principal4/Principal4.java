/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal4;

/**
 *
 * @author tnhei
 */
public class Principal4 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 4: TarjetaDeCredito - Cliente - Banco ===");

        // Crear un cliente
        Cliente cliente = new Cliente("Tahiel Heinze", "12345678");

        // Crear un banco
        Banco banco = new Banco("Banco Nacion", "30123456789");

        // Crear una tarjeta de crédito y asignar el cliente y el banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234567890123456", "12/25");
        tarjeta.setCliente(cliente);
        tarjeta.setBanco(banco);

        // Mostrar información
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("DNI: " + tarjeta.getCliente().getDni());
        System.out.println("Tarjeta: " + tarjeta.getNumero());
        System.out.println("Fecha de vencimiento: " + tarjeta.getFechaVencimiento());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());
    }
}


