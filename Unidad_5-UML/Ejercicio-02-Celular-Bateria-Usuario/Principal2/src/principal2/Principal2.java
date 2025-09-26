/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal2;

/**
 *
 * @author tnhei
 */
public class Principal2 {
    public static void main(String[] args) {
        // Ejercicio 2: Celular - Batería - Usuario
        System.out.println("=== Ejercicio 2: Celular - Bateria - Usuario ===");

        // Crear un usuario
        Usuario usuario = new Usuario("Tahiel Heinze", "12345678");

        // Crear una batería
        Bateria bateria = new Bateria("BL-5J", "3000mAh");

        // Crear un celular y asignar la batería y el usuario
        Celular celular = new Celular("123456789", "Samsung", "Galaxy S22");
        celular.setBateria(bateria);
        celular.setUsuario(usuario);

        // Mostrar información
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("DNI: " + usuario.getDni());
        System.out.println("Celular: " + celular.getModelo());
        System.out.println("IMEI: " + celular.getImei());
        System.out.println("Bateria: " + celular.getBateria().getModelo());
        System.out.println("Capacidad de la bateria: " + celular.getBateria().getCapacidad());
    }
}
