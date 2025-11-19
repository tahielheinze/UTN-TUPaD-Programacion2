/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_TP7;

/**
 *
 * @author tnhei
 */
// Subclase Auto
public class Auto extends Vehiculo_y_Herencia {
    //Metodo adicional de la clase Auto
    private int cantidadPuertas;
    
    //Constructor llamando al constructor de la clase Padre
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    //Sobreescribir el metodo mostrarInfo
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca + " , modelo: " + this.modelo + ", cantidad de puertas: " + cantidadPuertas);
    }
}
