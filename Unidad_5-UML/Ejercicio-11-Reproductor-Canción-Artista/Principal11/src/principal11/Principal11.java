/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal11;

/**
 *
 * @author tnhei
 */
public class Principal11 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 11: Cancion - Artista - Reproductor ===");

        Artista artista = new Artista("Michael Jackson", "Pop");
        Cancion cancion = new Cancion("Billie Jean");
        cancion.setArtista(artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}


