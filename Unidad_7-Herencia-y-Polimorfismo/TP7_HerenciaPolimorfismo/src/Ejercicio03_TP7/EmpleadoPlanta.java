/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03_TP7;

/**
 *
 * @author tnhei
 */
public class EmpleadoPlanta extends Empleados {
    private double sueldoBase;
    private double bonificacion;
    
    public EmpleadoPlanta(String nombre, String id, double sueldoBase, double bonificacion) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBase + bonificacion;
    }
    
    public double getSueldoBase() {
        return sueldoBase;
    }
    
    public double getBonificacion() {
        return bonificacion;
    }
}
