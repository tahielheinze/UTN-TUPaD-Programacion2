// Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
// Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
// Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones

public class Ejercicio01 {
    
    // ATRIBUTOS PRIVATE
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // CONSTRUCTOR con los parametros
    public Ejercicio01(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion);
    }
    
    // METODO GETTER Y SETTER NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        }
    }
    
    // METODO GETTER Y SETTER APELLIDO
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String Apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido.trim();
        }
    }
    
    // METODO GETTER Y SETTER CURSO
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        if (curso != null && !curso.trim().isEmpty()) {
            this.curso = curso.trim();
        }
    }
    
    // METODO GETTER Y SETTER CALIFICACION
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        // Validación: calificación debe estar entre 0 y 100
        if (calificacion >= 0 && calificacion <= 100) {
            this.calificacion = calificacion;
        } else {
            System.out.println("Error: La calificación debe estar entre 0 y 100");
        }
    }
    
    // METODO MOSTRAR INFORMACION
    public void mostrarInfo() {
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("Estado académico: " + obtenerEstadoAcademico());
    }
    
    // METODO REQUERIDO SUBIR CALIFICACION
    public void subirCalificacion(double puntos) {
        if (puntos > 0) {
            double nuevaCalificacion = calificacion + puntos;
            if (nuevaCalificacion <= 100) {
                calificacion = nuevaCalificacion;
                System.out.println("Calificación aumentada en " + puntos + " puntos");
                System.out.println("Nueva calificación: " + calificacion);
            } else {
                calificacion = 100;
                System.out.println("Calificación ajustada al máximo (100)");
            }
        } else {
            System.out.println("Error: Los puntos a subir deben ser positivos");
        }
    }
    
    // METODO REQUERIDO BAJAR CALIFICACION
    public void bajarCalificacion(double puntos) {
        if (puntos > 0) {
            double nuevaCalificacion = calificacion - puntos;
            if (nuevaCalificacion >= 0) {
                calificacion = nuevaCalificacion;
                System.out.println("Calificación disminuida en " + puntos + " puntos");
                System.out.println("Nueva calificación: " + calificacion);
            } else {
                calificacion = 0;
                System.out.println("Calificación ajustada al mínimo (0)");
            }
        } else {
            System.out.println("Error: Los puntos a bajar deben ser positivos");
        }
    }
    
    // METODO OBTENER EL ESTADO ACADEMICO
    public String obtenerEstadoAcademico() {
        if (calificacion >= 90) {
            return "Excelente";
        } else if (calificacion >= 80) {
            return "Muy Bueno";
        } else if (calificacion >= 70) {
            return "Bueno";
        } else if (calificacion >= 60) {
            return "Regular";
        } else {
            return "Insuficiente";
        }
    }
    


    public static void main(String[] args) {
        
        // CREAR ESTUDIANTE
        Ejercicio01 estudiante1 = new Ejercicio01("Tahiel", "Heinze", "Programación Java", 75.0);

        // MOSTRAR LA INFORMACION INICIAL
        System.out.println(); //Genero salto de linea visual
        System.out.println("--- INFORMACIÓN INICIAL ---");
        estudiante1.mostrarInfo();
        System.out.println(); //Genero salto de linea visual


        // AUMENTAR LA CALIFICACION
        System.out.println("--- AUMENTANDO CALIFICACIÓN ---");
        estudiante1.subirCalificacion(10.0);
        System.out.println(); //Genero salto de linea visual

        // INFORMACION DEL ESTUDIANTE 
        System.out.println("--- INFORMACIÓN DESPUÉS DEL AUMENTO ---");
        estudiante1.mostrarInfo();
        System.out.println(); //Genero salto de linea visual

        // DISMINUIT LA CALIFICACION
        System.out.println("--- DISMINUYENDO CALIFICACIÓN ---");
        estudiante1.bajarCalificacion(20.0);
        System.out.println(); //Genero salto de linea visual

        // MOSTRAR LA INFORMACION
        System.out.println("--- INFORMACIÓN FINAL ---");
        estudiante1.mostrarInfo();
        System.out.println(); //Genero salto de linea visual
    }
}