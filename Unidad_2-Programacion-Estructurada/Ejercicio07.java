//Escribe un programa que solicite al usuario una nota entre 0 y 10.
// Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar al usuario una nota.
        System.out.println("Ingrese una nota numerica (Entre 0 y 10): ");
        int nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada no es valida. Ingrese una nuevamente: ");            
            nota = scanner.nextInt();
        }

        // Imprimir el resultado.
        System.out.println("La nota ingresada es: " +nota);
        scanner.close();
    }
}