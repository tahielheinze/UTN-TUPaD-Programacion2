/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal13;

/**
 *
 * @author tnhei
 */
public class Principal13 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 13: CodigoQR - Usuario - GeneradorQR ===");

        Usuario usuario = new Usuario("Tahiel Heinze", "tahiel@example.com");
        GeneradorQR generadorQR = new GeneradorQR();
        CodigoQR codigoQR = generadorQR.generar("ABC123XYZ", usuario);

        System.out.println("Usuario: " + codigoQR.getUsuario().getNombre());
        System.out.println("Codigo QR: " + codigoQR.getValor());
    }
}


