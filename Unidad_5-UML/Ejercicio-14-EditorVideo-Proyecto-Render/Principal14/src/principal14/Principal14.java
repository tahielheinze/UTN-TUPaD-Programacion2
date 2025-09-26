/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal14;

/**
 *
 * @author tnhei
 */
public class Principal14 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 14: EditorVideo - Proyecto - Render ===");

        Proyecto proyecto = new Proyecto("| UML en Java |", 10);
        EditorVideo editorVideo = new EditorVideo();
        editorVideo.exportar("MP4", proyecto);

        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Duracion: " + proyecto.getDuracionMin() + " minutos");
    }
}

