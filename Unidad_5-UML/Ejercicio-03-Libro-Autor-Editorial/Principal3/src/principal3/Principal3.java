/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal3;

/**
 *
 * @author tnhei
 */
public class Principal3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Av. Corrientes 1234");
        Libro libro = new Libro("Cien anos de soledad", "978-3-16-148410-0");

        libro.setAutor(autor);
        libro.setEditorial(editorial);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
    }
}

