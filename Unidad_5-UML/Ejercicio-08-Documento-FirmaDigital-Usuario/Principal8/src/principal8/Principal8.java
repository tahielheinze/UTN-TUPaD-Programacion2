/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal8;

/**
 *
 * @author tnhei
 */
import java.util.Date;

public class Principal8 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 8: Documento - FirmaDigital - Usuario ===");

        Usuario usuario = new Usuario("Tahiel Heinze", "tahiel@example.com");
        Documento documento = new Documento("Contrato", "Contenido del contrato...");
        documento.getFirmaDigital().setCodigoHash("ABC123XYZ");
        documento.getFirmaDigital().setFecha(new Date());
        documento.getFirmaDigital().setUsuario(usuario);

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Codigo Hash: " + documento.getFirmaDigital().getCodigoHash());
    }
}

