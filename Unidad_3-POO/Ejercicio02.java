// Crear una clase Mascota con los atributos: nombre, especie, edad.
// Métodos requeridos: mostrarInfo(), cumplirAnios().
// Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios

public class Ejercicio02 {

    // ATRITUBOS private
    private String nombre;
    private String especie;
    private int edad;

    // CONSTRUCTOR con parametros
    public Ejercicio02(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        setEdad(edad);
    }

    // METODO GETTERS Y SETTERS NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("Error: El nombre no puede estar vacío");
        }
    }

        // METODO GETTERS Y SETTERS ESPECIE
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        if (especie != null && !especie.trim().isEmpty()) {
            this.especie = especie.trim();
        } else {
            System.out.println("Error: La especie no puede estar vacía");
        }
    }

    // METODO GETTERS Y SETTERS EDAD
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa");
            this.edad = 0;
        }
    }

    // METODO MOSTRAR INFORMACION
    public void mostrarInfo() {
        System.out.println("--- INFORMACIÓN DE LA MASCOTA ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " año(s)");
    }

    // METODO CUMPLIR ANIO
    public void cumplirAnios() {
        edad++;
        System.out.println("¡Feliz cumpleaños " + nombre + "!");
        System.out.println(nombre + " ahora tiene " + edad + " año(s)");
    }
    public static void main(String[] args) {
        
        // CREAR LA MASCOTA 
        Ejercicio02 mascota1 = new Ejercicio02("Luna", "Gato", 2);

        // INFORMACION INICIAL
        System.out.println(); //Genero salto de linea visual
        System.out.println("INFORMACIÓN INICIAL DE LA MASCOTA");
        mascota1.mostrarInfo();
        System.out.println();

        // SIMULANDO EL PASO DEL TIEMPO (3AÑOS)
        System.out.println(); //Genero salto de linea visual
        System.out.println("SIMULANDO EL PASO DEL TIEMPO (3 años):");
        mascota1.cumplirAnios();
        mascota1.cumplirAnios();
        mascota1.cumplirAnios();

        // INFORMACION DESPUES DEL PASO DEL TIEMPO Y CUMPLEAÑOS
        System.out.println(); //Genero salto de linea visual
        System.out.println("INFORMACIÓN DESPUÉS DE LOS CUMPLEAÑOS");
        mascota1.mostrarInfo();
        System.out.println();
    }
}