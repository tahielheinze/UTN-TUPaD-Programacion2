/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal5;

/**
 *
 * @author tnhei
 */
public class Principal5 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 5: Computadora - PlacaMadre - Propietario ===");

        Propietario propietario = new Propietario("Tahiel Heinze", "12345678");
        Computadora computadora = new Computadora("Dell", "SN123456789");
        computadora.setPropietario(propietario);
        computadora.getPlacaMadre().setModelo("ASUS Prime B450");
        computadora.getPlacaMadre().setChipset("AMD B450");

        System.out.println("Propietario: " + propietario.getNombre());
        System.out.println("DNI: " + propietario.getDni());
        System.out.println("Computadora: " + computadora.getMarca());
        System.out.println("Numero de serie: " + computadora.getNumeroSerie());
        System.out.println("Placa madre: " + computadora.getPlacaMadre().getModelo());
    }
}

