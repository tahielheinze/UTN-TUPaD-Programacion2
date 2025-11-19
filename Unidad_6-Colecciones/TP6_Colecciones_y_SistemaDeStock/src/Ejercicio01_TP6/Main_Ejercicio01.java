/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_TP6;

/**
 *
 * @author tnhei
 */
public class Main_Ejercicio01 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorias
        Producto p1 = new Producto("P001", "Arroz", 1500.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Notebook", 85000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 2500.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Lampara", 1800.0, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Fideos", 1200.0, 60, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\nBusqueda de producto por ID P003:");
        Producto encontrado = inventario.buscarProductoPorId("P003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        // 4. Filtrar productos por categoria
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5. Eliminar un producto por ID
        System.out.println("\nEliminando producto P004:");
        inventario.eliminarProducto("P004");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\nActualizando stock:");
        inventario.actualizarStock("P001", 100);

        // 7. Mostrar total de stock
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        // 8. Obtener producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // 9. Filtrar productos por precio
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);

        // 10. Mostrar categorias disponibles
        inventario.mostrarCategoriasDisponibles();
    }
}
