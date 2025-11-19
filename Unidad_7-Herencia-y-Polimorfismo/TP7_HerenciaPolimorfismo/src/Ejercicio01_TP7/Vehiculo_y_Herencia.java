/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_TP7;

/**
 *
 * @author tnhei
 */
public class Vehiculo_y_Herencia {
    // Atributos protegidos
    protected String marca;
    protected String modelo;
    
    //Constructores
    public Vehiculo_y_Herencia(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

