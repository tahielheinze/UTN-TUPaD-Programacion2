/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal4;

/**
 *
 * @author tnhei
 */
import java.util.Date;

public class Principal4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tahiel Heinze", "12345678");
        Banco banco = new Banco("Banco Nacion", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234567890123456", new Date());

        tarjeta.setCliente(cliente);
        tarjeta.setBanco(banco);

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Tarjeta: " + tarjeta.getNumero());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());
    }
}



