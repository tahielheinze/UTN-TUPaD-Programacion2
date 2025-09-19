//Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
//Luego, aplique los siguientes descuentos:
//Categoría A: 10% de descuento
//Categoría B: 15% de descuento
//Categoría C: 20% de descuento
//El programa debe mostrar el precio original, el descuento aplicado y el precio final.

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // solicitar al usuario el precio del producto.
        System.out.println("Ingrese el valor del producto: ");
        double precio = scanner.nextDouble();
        
        // Evitar el error del salto de linea.
        scanner.nextLine();
        
        // Solicitar la categoría del producto.
        System.out.println("Ingrese la categoría del prodcuto (A, B o C): ");
        String categoria = scanner.nextLine().toUpperCase();
        
        // Validar que el precio ingresado sea correcto.
        while (precio <= 0) {
            System.out.println("El precio ingresado es INCORRECTO. Ingrese un valor nuevamente: ");
            precio = scanner.nextDouble();
            scanner.nextLine();
        }
        
        // Validar que la categoria sea A, B  o C.
        while (!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C")) {
            System.out.println("La categoría ingresada es INCORRECTA. Ingrese nuevamente una categoría (A, B o C): ");
            categoria = scanner.nextLine().toUpperCase();
        }
        
        // Calcular el descuento y precio.
        double descuento = 0;
        
        switch (categoria) {
            case "A":
                descuento = precio * 0.10;
                break;
            case "B":
                descuento = precio * 0.15;
                break;
            case "C":
                descuento = precio * 0.10;
                break;
        }
        
        double precioFinal = Math.round(precio - descuento);

        // Imprimir los resultados.
        System.out.println("--- RESUMEN DE LA COMPRA ---");
        System.out.println("El precio original sin descuento es: $" +precio);
        System.out.println("El descuento aplicado segun la categoría es: $" +descuento);
        System.out.println("El precio final con el descuento aplicado es: $" +precioFinal);
        
        scanner.close();
    }
}
