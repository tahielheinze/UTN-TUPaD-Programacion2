/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04_TP7;

/**
 *
 * @author tnhei
 */
public class Animal {
    protected String nombre;
    
    public Animal(String nombre, String especie) {
        this.nombre = nombre;
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico");
    }
    
    public String getNombre() {
        return nombre;
    }
}
