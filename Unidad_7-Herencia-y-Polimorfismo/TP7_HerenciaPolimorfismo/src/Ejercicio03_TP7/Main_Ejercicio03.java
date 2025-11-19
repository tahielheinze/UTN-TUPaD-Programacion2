/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03_TP7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tnhei
 */
public class Main_Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: EMPLEADOS Y POLIMORFISMO ===\n");
        
        // Crear lista de empleados
        List<Empleados> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Empleado de Prueba 1", "E001", 3000.0, 500.0));
        empleados.add(new EmpleadoTemporal("Empleado de Prueba 2", "T001", 15.0, 160));
        empleados.add(new EmpleadoPlanta("Empleado de Prueba 3", "E002", 3500.0, 700.0));
        empleados.add(new EmpleadoTemporal("Empleado de Prueba 4", "T002", 20.0, 120));
        empleados.add(new EmpleadoPlanta("Empleado de Prueba 5", "E003", 4000.0, 800.0));
        
        // Invocar calcularSueldo() polimórficamente
        System.out.println("--- LISTADO DE SUELDOS ---");
        double totalSueldos = 0;
        for (Empleados emp : empleados) {
            double sueldo = emp.calcularSueldo();
            totalSueldos += sueldo;
            System.out.printf("%s (ID: %s) - Sueldo: $%.2f\n", 
                            emp.getNombre(), emp.getId(), sueldo);
        }
        
        System.out.printf("\nTotal en sueldos: $%.2f\n", totalSueldos);
        
        // Usar instanceof para clasificar
        System.out.println("\n--- CLASIFICACION POR TIPO ---");
        int plantaCount = 0;
        int temporalCount = 0;
        double sueldoPlanta = 0;
        double sueldoTemporal = 0;
        
        for (Empleados emp : empleados) {
            if (emp instanceof EmpleadoPlanta) {
                plantaCount++;
                sueldoPlanta += emp.calcularSueldo();
                System.out.println("Empleado de Planta: " + emp.getNombre());
            } else if (emp instanceof EmpleadoTemporal) {
                temporalCount++;
                sueldoTemporal += emp.calcularSueldo();
                System.out.println("Empleado Temporal: " + emp.getNombre());
            }
        }
        
        System.out.println("\n--- ESTADISTICAS ---");
        System.out.println("Total de empleados: " + empleados.size());
        System.out.println("Empleados de Planta: " + plantaCount);
        System.out.printf("Promedio sueldo Planta: $%.2f\n", sueldoPlanta / plantaCount);
        System.out.println("Empleados Temporales: " + temporalCount);
        System.out.printf("Promedio sueldo Temporal: $%.2f\n", sueldoTemporal / temporalCount);
    }
}
