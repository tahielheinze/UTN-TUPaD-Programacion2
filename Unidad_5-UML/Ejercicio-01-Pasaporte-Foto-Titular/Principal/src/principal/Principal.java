/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author tnhei
 */
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Titular titular = new Titular("Tahiel Heinze", "12345678");
        Pasaporte pasaporte = new Pasaporte("ABC123", new Date());
        pasaporte.setTitular(titular);
        pasaporte.getFoto().setImagen("foto.jpg");
        pasaporte.getFoto().setFormato("JPEG");

        System.out.println("Titular: " + titular.getNombre());
        System.out.println("DNI: " + titular.getDni());
        System.out.println("Pasaporte: " + pasaporte.getNumero());
        System.out.println("Fecha de Emision: " + pasaporte.getFechaEmision());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
}

