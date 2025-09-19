// Escribe un programa que pida al usuario ingresar 10 números enteros.
// y cuente cuántos son positivos, negativos y cuántos son ceros.

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese 10 números.
        int[] numeros = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese el valor del número " +(i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contadores de positivos, negativos y ceros.
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Bucle para analizar los números ingresados.
        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos ++;
            }
            else if (numeros[i] < 0) {
                negativos ++;
            }
            else {
                ceros ++;
            }
        }

        // Imprimir resultados.
        System.out.println("--- RESULTADOS ---");
        System.out.println("Números positivos totales: " +positivos);
        System.out.println("Números negativos totales: " +negativos);
        System.out.println("Ceros totales: " +ceros);

        scanner.close();
    }
}