/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_TP8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tnhei
 */
public class EjerciciosExcepciones{
    // Ejercicio 1: Division segura
    public static void divisionSegura() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }
    }
    
    // Ejercicio 2: Conversion de cadena a numero
    public static void conversionCadena() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un numero: ");
            String texto = scanner.nextLine();
            
            int numero = Integer.parseInt(texto);
            System.out.println("Numero convertido: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un numero valido");
        }
    }
    
    // Ejercicio 3: Lectura de archivo
    public static void lecturaArchivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();
        
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            
            bufferedReader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
    
    // Ejercicio 4: Validacion de edad con excepcion personalizada
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: debe estar entre 0 y 120");
        }
        System.out.println("Edad valida: " + edad);
    }
    
    public static void ejercicioEdad() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            
            validarEdad(edad);
            
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Ejercicio 5: Try-with-resources
    public static void lecturaConTryWithResources() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo))) {
            
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}