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
        Usuario usuario = new Usuario("Tahiel Heinze", "12345678");
        Celular celular = new Celular("123456789", "Samsung", "Galaxy S22");
        Bateria bateria = new Bateria("BL-5J", "3000mAh");

        celular.setBateria(bateria);
        celular.setUsuario(usuario);

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("DNI: " + usuario.getDni());
        System.out.println("Celular: " + celular.getModelo());
        System.out.println("Bateria: " + celular.getBateria().getModelo());
    }
}

