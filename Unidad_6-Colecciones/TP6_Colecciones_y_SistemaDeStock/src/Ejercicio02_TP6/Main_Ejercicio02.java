/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02_TP6;

/**
 *
 * @author tnhei
 */
public class Main_Ejercicio02 {
    public static void main(String[] args) {
        // 1. Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca creada: " + biblioteca.getNombre());

        // 2. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombiano");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentino");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");

        // 3. Agregar 5 libros
        biblioteca.agregarLibro("978-001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-002", "El amor en los tiempos del colera", 1985, autor1);
        biblioteca.agregarLibro("978-003", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("978-004", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("978-005", "La casa de los espiritus", 1982, autor3);

        // 4. Listar todos los libros
        biblioteca.listarLibros();

        // 5. Buscar un libro por ISBN
        System.out.println("\nBusqueda de libro por ISBN 978-003:");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("978-003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        // 6. Filtrar libros por año
        biblioteca.filtrarLibrosPorAnio(1949);

        // 7. Eliminar un libro por ISBN
        System.out.println("\nEliminando libro con ISBN 978-004:");
        biblioteca.eliminarLibro("978-004");
        biblioteca.listarLibros();

        // 8. Mostrar cantidad total de libros
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}
