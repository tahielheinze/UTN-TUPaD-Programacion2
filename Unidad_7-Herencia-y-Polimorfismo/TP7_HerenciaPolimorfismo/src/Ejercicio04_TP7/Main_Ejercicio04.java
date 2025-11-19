/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04_TP7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tnhei
 */
public class Main_Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 4: ANIMALES Y COMPORTAMIENTO ===\n");
        
        // Crear lista de animales
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Perro"));
        animales.add(new Gato("Gato"));
        animales.add(new Vaca("Vaca"));
        
        // Mostrar sonidos con polimorfismo
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
                
        // Contar animales por tipo usando instanceof
        System.out.println("\n--- ESTADISTICAS ---");
        int perros = 0, gatos = 0, vacas = 0;
        
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                perros++;
            } else if (animal instanceof Gato) {
                gatos++;
            } else if (animal instanceof Vaca) {
                vacas++;
            }
        }
        
        System.out.println("Total de animales: " + animales.size());
        System.out.println("Perros: " + perros);
        System.out.println("Gatos: " + gatos);
        System.out.println("Vacas: " + vacas);
        
    }
}
