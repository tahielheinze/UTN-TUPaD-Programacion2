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
        System.out.println("=== Ejercicio 13: GeneradorQR - Usuario - CodigoQR ===");

        Usuario usuario = new Usuario("Tahiel Heinze", "tahiel@example.com");
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generar("ABC123XYZ", usuario);

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
    }
}

