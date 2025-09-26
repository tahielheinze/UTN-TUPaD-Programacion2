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
        System.out.println("=== Ejercicio 14: Proyecto - Render - EditorVideo ===");

        Proyecto proyecto = new Proyecto("Mi Proyecto", 10);
        EditorVideo editorVideo = new EditorVideo();
        Render render = editorVideo.exportar("MP4", proyecto);

        System.out.println("Proyecto: " + render.getProyecto().getNombre());
        System.out.println("Formato: " + render.getFormato());
    }
}


