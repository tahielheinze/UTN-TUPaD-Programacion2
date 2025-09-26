/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal7;

/**
 *
 * @author tnhei
 */
public class Principal7 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 7: Vehiculo - Motor - Conductor ===");

        Conductor conductor = new Conductor("Tahiel Heinze", "LIC123456");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla");
        Motor motor = new Motor("Gasolina", "MOT123456");

        vehiculo.setMotor(motor);
        vehiculo.setConductor(conductor);

        System.out.println("Conductor: " + conductor.getNombre());
        System.out.println("Licencia: " + conductor.getLicencia());
        System.out.println("Vehiculo: " + vehiculo.getModelo());
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
    }
}
