//Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
//Menor de 12 años: "Niño"
//Entre 12 y 17 años: "Adolescente"
//Entre 18 y 59 años: "Adulto"
//60 años o más: "Adulto mayor"

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario su edad.
        System.out.println("Ingrese su edad (años): ");
        int edad = scanner.nextInt();

        // Validar la edad ingresada.
        while (edad <= 0) {
            System.out.println("La edad ingresada es incorrecta");
            System.out.println("Ingrese una edad valida (años): ");
            edad = scanner.nextInt();
        }

        // Crear la variable etapa (string) para almacenar la etapa en la que se encuentra segun la edad ingresada.
        String etapa;

        // Veerificar en que etapa se encuentra el usuario.
        if (edad < 12){
            etapa = "Niño";
        }
        else if (edad >= 12 && edad <= 17) {
            etapa = "Adolescente";
        }
        else if (edad >= 18 && edad <= 59) {
            etapa = "Adulto";
        }
        else {
            etapa = "Adulto Mayor";
        }

        // Imprimir el resultado.
        System.out.println("Segun la edad ingresada (" + edad + ") la etapa en la que se encuentra es: " + etapa);
        
        scanner.close();
    }
}