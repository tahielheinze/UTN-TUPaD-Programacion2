/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author tnhei
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*            ---- EJERCICIO 2 ---- */
        
            System.out.println("Hola, Java!");

            

            /*            ---- EJERCICIO 3 ---- 

            String nombre = "Tahiel";

            int edad = 21;

            double altura = 1.75;

            boolean estudiante = true;

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura);
            System.out.println("Es estudiante: " + estudiante);
        */
        
        
        /*            ---- EJERCICIO 4 ---- 
        
            Scanner input = new Scanner(System.in);

            String nombre;
            System.out.println("Ingrese su nombre:");
            nombre = input.nextLine();

            int edad;
            System.out.println("Ingrese su edad:");
            edad = input.nextInt();

            double altura;
            System.out.println("Ingrese su altura:");
            altura = input.nextDouble();

            boolean estudiante;
            System.out.println("Es estudiante? Conteste con True o False:");
            estudiante = input.nextBoolean();

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura);
            System.out.println("Es estudiante: " + estudiante);
        */
        
        
        /*            ---- EJERCICIO 5 ---- 
        
            Scanner input = new Scanner(System.in);

            int Num1;
            System.out.println("Ingrese el valor del primer numero: ");
            Num1 = input.nextInt();

            int Num2;
            System.out.println("Ingrese el valor del segundo numero: ");
            Num2 = input.nextInt();

            int Suma = Num1 + Num2;
            int Multiplicacion = Num1 * Num2;
            int Resta = Num1 - Num2;
            int Division = Num1 / Num2;

            System.out.println("La suma de " +Num1+ " + " +Num2+ " = " +Suma);
            System.out.println("La Multiplicacion de " +Num1+ " x " +Num2+ " = " +Multiplicacion);
            System.out.println("La Resta de " +Num1+ " - " +Num2+ " = " +Resta);
            System.out.println("La Division de " +Num1+ " / " +Num2+ " = " +Division);
        */
        
        /*             ---- EJERCICIO 6 ---- 
        
            String nombre = "Juan Pérez";
            int edad = 30;
            String direccion = "Calle Falsa 123";

            System.out.println("Nombre: " + nombre + "\n");
            System.out.println("Edad: " + edad + "\n");
            System.out.println("Direccion: " + direccion + "\n");
        */
        
        /*            ---- EJERCICIO 7 ----
        
        Analiza el siguiente código y responde: ¿Cuáles son expresiones y cuáles 
        son instrucciones? Explica la diferencia en un breve párrafo.
        
        int x = 10; // Línea 1
        
        Instrucciones: Declarar e inicializar la variable x
        Expresiones: 10 literal entero
        
        x = x + 5; // Línea 2
        
        Instrucciones: Asignacion
        Expresiones: x (variable), 5(literal entero), x + 5 (expresion aritmetica)
        
        System.out.println(x); // Línea 3
        
        Instrucciones: Llamada a metodo
        Expresiones: System.out (acceso a campo), x (variable)
        
        Expresiones = Es la combinacion de valores, variables, operados y metodos para producir un valor unico. La expresion por si sola no realiza una accion.
        Instruccion = Es una linea de codigo que indica una accion, siempre debe de terminar con un ;. Una instruccion contiene una o más expresiones.
        
        */
        
        /*            ---- EJERCICIO 8 ----
            Scanner input = new Scanner(System.in);

            int Num1;
            System.out.println("Ingrese el valor para el primer numero:");
            Num1 = input.nextInt();

            int Num2;
            System.out.println("Ingrese el valor para el segundo numero:");
            Num2 = input.nextInt();

            int division = Num1 / Num2;

            System.out.println("El resultado de la division de: " +Num1+ " / " +Num2+ " = " +division);
        
         Al utilizar double en vez de int, al colocar un numero entero como por ej. 2
        Se ve reflejado en el sistema como 2.0 ya que Java automaticamente lo convierte al formato de flotante.
        Esto sucede ya que al utilizar double y colocar un numero entero Java lo almacena como 2.0 para que coincida con el tipo double. 
        
        */
        
        /*            ---- EJERCICIO 9 ----
        
            public class ErrorEjemplo {
                public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingresa tu nombre: ");
                String nombre = scanner.nextInt(); // ERROR
                System.out.println("Hola, " + nombre);
                }
            }
            
        El ERROR que contiene el codigo es en la seccion: String nombre = scanner.nextInt(); La cual la variable Nombre deberia de leer una cadena de texto (string),
        pero en el código esta diseñado para leer números enteros. Al correr el programa y el usuario colocar un Nombre como se espera que haga,
        el compilador arrojaria un mensaje de error "InputMismatchException", esto es pq el programa esta preparado para leer unicamente números enteros, no string o cadena de textos.
            
            Para arreglar el error haría lo siguiente:
        
            public class ErrorEjemplo {
                public static void main (String[] args) {
                Scanner scanner = new Scanner (System.in);
                System.out.print ("Ingresa tu nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Hola, " + nombre);
                }
            }
        */
        
        /*            ---- EJERCICIO 10 ---- 
        
            public class PruebaEscritorio {
                public static void main(String[] args) {
                int a = 5;
                int b = 2;
                int resultado = a / b;
                System.out.println("Resultado: " + resultado);
                }
            }
        
        El programa al realizar la division de 5 / 2 arroja el resultado de 2. Esto se debe a que Java esta realizando la division entera entre esos 2 números enteros (int).
        Esto significa que los decimales de la division se truncan y a su vez Java no redondea para arriba el número
        
        */
        

        
        
        
}
    
}
