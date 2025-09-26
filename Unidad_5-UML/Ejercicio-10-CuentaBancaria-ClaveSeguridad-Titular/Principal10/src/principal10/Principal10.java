/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal10;

/**
 *
 * @author tnhei
 */
public class Principal10 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 10: CuentaBancaria - ClaveSeguridad - Titular ===");

        Titular titular = new Titular("Tahiel Heinze", "12345678");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 1000.00);

        cuenta.setTitular(titular);
        cuenta.getClaveSeguridad().setCodigo("ABC123");
        cuenta.getClaveSeguridad().setUltimaModificacion("2025-09-26");

        System.out.println("Titular: " + titular.getNombre());
        System.out.println("DNI: " + titular.getDni());
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Codigo de seguridad: " + cuenta.getClaveSeguridad().getCodigo());
    }
}

