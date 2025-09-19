// Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario 3 números enteros mediante un bucle.
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Ingrese el valor del número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Determinar que número es mayor.
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        // Imprimir el resultado.
        System.out.println("El número más grande ingresado es: " + mayor);

        scanner.close();
    }
}