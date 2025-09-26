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
        // Ejercicio 1: Pasaporte - Foto - Titular
        System.out.println("=== Ejercicio 1: Pasaporte - Foto - Titular ===");

        // Crear un titular
        Titular titular = new Titular("Tahiel Heinze", "12345678");

        // Crear un pasaporte y asignar el titular
        Pasaporte pasaporte = new Pasaporte("ABC123", new Date());
        pasaporte.setTitular(titular);

        // Configurar la foto del pasaporte
        pasaporte.getFoto().setImagen("foto_pasaporte.jpg");
        pasaporte.getFoto().setFormato("JPEG");

        // Mostrar información
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("DNI: " + titular.getDni());
        System.out.println("Pasaporte: " + pasaporte.getNumero());
        System.out.println("Fecha de emisión: " + pasaporte.getFechaEmision());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
        System.out.println("Formato de la foto: " + pasaporte.getFoto().getFormato());
    }
}
