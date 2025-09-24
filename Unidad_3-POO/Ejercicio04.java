// Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
// Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
// Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado

public class Ejercicio04 {
    
    // ATRIBUTOS private
    private int idGallina;
    private int edad;
    private int huevosPuestos;


    // CONSTRUCTORES parametros
    public Ejercicio04(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    // GETTERS
    public int getIdGallina() {
        return idGallina;
    }
    public int getEdad() {
        return edad;
    }
    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    // SETTERS
    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    // toString
    @Override
    public String toString() {
        return "Gallina [idGallina=" + idGallina + ", edad=" + edad + ", huevosPuestos=" + huevosPuestos + "]";
    }

    // CLASE LIBRO

    // ATRIBUTOS private Libro
    static class libro{
        private String titulo;
        private String autor;
        private int anio;

        // CONSTRUCTOR parametros Libro
        public libro(String titulo, String autor, int anio) {
            this.titulo = titulo;
            this.autor = autor;
            this.anio = anio;
        }
        // GETTERS Libro
        public String getTitulo() {
            return titulo;
        }
        public String getAutor() {
            return autor;
        }
        public int getAnio() {
            return anio;
        }
        // SETTERS Libro
        public void setAnio(int anio) {
            if (anio > 0 && anio <= 2025) {
                this.anio = anio;
            } else {
                System.out.println("Año inválido. Debe ser un valor positivo.");
            }
        }

        @Override
        public String toString() {
            return "Libro [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + "]";
        }
    }

    public static void main(String[] args) {
        

        // CREAR LA GALLINA
        System.out.println("");
        System.out.println("Información de la gallina:");
        Ejercicio04 gallina1 = new Ejercicio04(1, 3, 150);
        System.out.println(gallina1.toString());
        System.out.println("");

        // MODIFICAR LA GALLINA
        gallina1.setEdad(4);
        gallina1.setHuevosPuestos(200);
        System.out.println("Información después de modificar la gallina:");
        System.out.println(gallina1.toString());

        // CREAR EL LIBRO
        libro libro1 = new libro("El Quijote", "Miguel de Cervantes", 1605);
        System.out.println(libro1.toString());
        System.out.println("");

        // INTENTAR MODIFICAR EL AÑO CON UN VALOR INVÁLIDO
        libro1.setAnio(-2025); // Valor inválido
        System.out.println("Información después de intentar modificar el año con un valor inválido:");
        System.out.println(libro1.toString());
        System.out.println("");

        // MODIFICAR EL AÑO CON UN VALOR VÁLIDO
        libro1.setAnio(2023); // Valor válido
        System.out.println("Información después de modificar el año con un valor válido:");
        System.out.println(libro1.toString());
        System.out.println("");

        // MOSTRAR LA INFORMACIÓN FINAL
        System.out.println("Información final de la gallina:");
        System.out.println(gallina1.toString());
        System.out.println("");
        System.out.println("Información final del libro:");
        System.out.println(libro1.toString());
        System.out.println("");
    }
}