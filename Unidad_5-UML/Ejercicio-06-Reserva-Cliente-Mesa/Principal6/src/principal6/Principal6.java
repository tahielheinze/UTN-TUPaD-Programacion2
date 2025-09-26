/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal6;

/**
 *
 * @author tnhei
 */
public class Principal6 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 6: Reserva - Cliente - Mesa ===");

        Cliente cliente = new Cliente("Tahiel Heinze", "123456789");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-12-25", "20:00");

        reserva.setCliente(cliente);
        reserva.setMesa(mesa);

        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Telefono: " + reserva.getCliente().getTelefono());
        System.out.println("Fecha de reserva: " + reserva.getFecha());
        System.out.println("Hora de reserva: " + reserva.getHora());
        System.out.println("Mesa: " + reserva.getMesa().getNumero());
    }
}

