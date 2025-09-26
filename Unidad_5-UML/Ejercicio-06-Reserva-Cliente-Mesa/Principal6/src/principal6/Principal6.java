/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal6;

/**
 *
 * @author tnhei
 */
import java.util.Date;

public class Principal6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tahiel Heinze", "123456789");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva(new Date(), "20:00");

        reserva.setCliente(cliente);
        reserva.setMesa(mesa);

        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Fecha de Reserva: " + reserva.getFecha());
        System.out.println("Mesa: " + reserva.getMesa().getNumero());
    }
}


