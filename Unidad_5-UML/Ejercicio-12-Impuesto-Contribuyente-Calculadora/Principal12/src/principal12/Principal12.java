/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal12;

/**
 *
 * @author tnhei
 */
public class Principal12 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 12: Impuesto - Contribuyente - Calculadora ===");

        Contribuyente contribuyente = new Contribuyente("Tahiel Heinze", "20-12345678-9");
        Impuesto impuesto = new Impuesto(5000.00);
        impuesto.setContribuyente(contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}


