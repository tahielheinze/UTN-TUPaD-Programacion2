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
        // Ejercicio 3: Libro - Autor - Editorial
        System.out.println("=== Ejercicio 3: Libro - Autor - Editorial ===");

        // Crear un autor
        Autor autor = new Autor("Gabriel Garcia Marquez", "Colombiana");

        // Crear una editorial
        Editorial editorial = new Editorial("Sudamericana", "Av. Corrientes 1234");

        // Crear un libro y asignar el autor y la editorial
        Libro libro = new Libro("Cien años de soledad", "978-3-16-148410-0");
        libro.setAutor(autor);
        libro.setEditorial(editorial);

        // Mostrar información
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Nacionalidad del autor: " + libro.getAutor().getNacionalidad());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        System.out.println("Direccion de la editorial: " + libro.getEditorial().getDireccion());
    }
}
