//Escribe un programa que solicite números al usuario y sume solo los números pares.
//El ciclo debe continuar hasta que el usuario ingrese el número 0.
//momento en el que se debe mostrar la suma total de los pares ingresados.

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumaPares = 0;
        int numero;
        
        
        //Solicitar al usuario los números.
        System.out.println("Ingrese un valor numerico (ingrese 0 para terminar): ");
        
        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

            //Verificar si el número es par y mayor que cero.
            if ( numero != 0 && numero % 2 == 0) {
                sumaPares += numero;
                System.out.println("Número par añadido: " +numero);
            }
        } while ( numero != 0);
        
        // Imprimir el resultado.
        System.out.println("La suma total de los números pares ingresados es: " +sumaPares);
        
        scanner.close();
    }
}