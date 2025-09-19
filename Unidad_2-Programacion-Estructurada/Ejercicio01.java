// Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto.
// Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar año al usuario.
        System.out.println("Ingrese un año: ");
        int anio = scanner.nextInt();

        // Verificar si el año ingresado es bisiesto o no.
        boolean anioBisiesto = (anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0);

        // Imprimir el resultado.
        if (anioBisiesto) {
            System.out.println("El año ingresado (" + anio + ") es bisiesto.");
        }
        else {
            System.out.println("El año ingresado (" + anio + ") no es bisiesto.");
        }

        scanner.close();
    }
}

