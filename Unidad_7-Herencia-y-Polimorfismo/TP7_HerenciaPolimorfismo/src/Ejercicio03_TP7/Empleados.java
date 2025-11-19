/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03_TP7;

/**
 *
 * @author tnhei
 */
public abstract class Empleados {
    protected String nombre;
    protected String id;
    
    public Empleados(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    // Método abstracto que debe ser implementado por las subclases
    public abstract double calcularSueldo();
    
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
}
