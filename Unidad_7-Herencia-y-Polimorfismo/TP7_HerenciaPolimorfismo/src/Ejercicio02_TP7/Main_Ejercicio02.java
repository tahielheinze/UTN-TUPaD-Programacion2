/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02_TP7;

/**
 *
 * @author tnhei
 */
public class Main_Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: FIGURAS GEOMETRICAS ===\n");
        
        // Crear array de figuras (polimorfismo)
        Figura[] figuras = new Figura[4];
        figuras[0] = new Circulo(10, "Circulo 1");
        figuras[1] = new Rectangulo(4.0, 4.0, "Rectangulo 1");
        figuras[2] = new Circulo(15, "Circulo 2");
        figuras[3] = new Rectangulo(6.0, 4.0, "Rectangulo 2");
        
        // Mostrar el área de cada figura usando polimorfismo
        System.out.println("--- CALCULO DE AREAS ---");
        for (Figura figura : figuras) {
            System.out.printf("%s - Area: %.2f\n", 
                            figura.getNombre(), 
                            figura.calcularArea());
        }
        
        // Calcular área total
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        
        System.out.println("\n--- RESUMEN ---");
        System.out.printf("Area total de todas las figuras: %.2f\n", areaTotal);
        System.out.println("Cantidad de figuras: " + figuras.length);
    }
}
