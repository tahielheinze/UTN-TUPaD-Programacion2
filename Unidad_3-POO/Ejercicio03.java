// Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
// Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
// Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final

public class Ejercicio03 {

    // ATRIBUTOS private
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // CONSTRUCTOR parametros
    public Ejercicio03(String titulo, String autor, int añoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    //GETTER titulo
    public String getTitulo() {
        return titulo;
    }

    //GETTER autor
    public String getAutor() {
        return autor;
    }

    //GETTER y SETTER año publicacion
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    public void setAñoPublicacion(int añoPublicacion) {
        // Validación: año debe estar entre 1440 y año actual + 1
        int añoActual = 2025;
        int añoMinimo = 1440;
        int añoMaximo = añoActual + 1;
        
        if (añoPublicacion >= añoMinimo && añoPublicacion <= añoMaximo) {
            this.añoPublicacion = añoPublicacion;
            System.out.println("Año de publicación actualizado a: " + añoPublicacion);
        } else {
            System.out.println("Error: Año inválido (" + añoPublicacion + ")");
            System.out.println("El año debe estar entre " + añoMinimo + " y " + añoMaximo);
            System.out.println("Manteniendo año actual: " + this.añoPublicacion);
        }
    }

    // METODO MOSTRAR INFORMACION
    public void mostrarInfo() {
        System.out.println("--- INFORMACIÓN DEL LIBRO ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("-----------------------------");
    }
    
    
    public static void main(String[] args) {
        
        // CREAR UN LIBRO
        Ejercicio03 libro1 = new Ejercicio03("El Quijote", "Miguel de Cervantes", 1605);
        System.out.println(); //Genero salto de linea visual

        // MOSTRAR INFORMACIÓN INICIAL
        System.out.println("--- INFORMACIÓN INICIAL DEL LIBRO ---");
        libro1.mostrarInfo();
        System.out.println(); //Genero salto de linea visual

        // MOSTRAR GETTERS
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año: " + libro1.getAñoPublicacion());
        System.out.println(); //Genero salto de linea visual

        // MODIFICAR EL AÑO CON UN VALOR INVALIDO
        System.out.println("--- PROBANDO VALIDACIÓN - VALOR INVÁLIDO ---");
        System.out.println("Intentando cambiar año a 1200:");
        libro1.setAñoPublicacion(1200);
        System.out.println();

        // MODIFICAR AÑO CON VALOR VALIDO
        System.out.println("--- PROBANDO VALIDACIÓN - VALOR VÁLIDO ---");
        System.out.println("Intentando cambiar año a 1615:");
        libro1.setAñoPublicacion(1615);
        System.out.println();

        // MOSTRAR INFORMACIÓN FINAL
        System.out.println("INFORMACIÓN FINAL:");
        libro1.mostrarInfo();
    }
}