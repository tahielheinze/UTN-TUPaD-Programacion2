/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03_TP6;

/**
 *
 * @author tnhei
 */
public class Main_Ejercicio03 {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad Nacional Tecnologica");
        System.out.println("Universidad creada: " + universidad.getNombre() + "\n");

        // 1. Crear 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("P001", "Dr. Juan Perez", "Matematicas");
        Profesor prof2 = new Profesor("P002", "Dra. Maria Lopez", "Programacion");
        Profesor prof3 = new Profesor("P003", "Dr. Carlos Gomez", "Fisica");

        Curso curso1 = new Curso("C001", "Algebra Lineal");
        Curso curso2 = new Curso("C002", "Programacion I");
        Curso curso3 = new Curso("C003", "Programacion II");
        Curso curso4 = new Curso("C004", "Calculo I");
        Curso curso5 = new Curso("C005", "Fisica I");

        // 2. Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        // 3. Asignar profesores a cursos
        System.out.println("\nAsignando profesores a cursos:");
        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P002");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P001");
        universidad.asignarProfesorACurso("C005", "P003");

        // 4. Listar cursos con su profesor y profesores con sus cursos
        universidad.listarCursos();
        universidad.listarProfesores();

        System.out.println("\nDetalle de cursos por profesor:");
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();

        // 5. Cambiar el profesor de un curso
        System.out.println("\nCambiando profesor del curso C001:");
        universidad.asignarProfesorACurso("C001", "P003");
        universidad.listarCursos();
        prof1.listarCursos();
        prof3.listarCursos();

        // 6. Remover un curso
        System.out.println("\nEliminando curso C005:");
        universidad.eliminarCurso("C005");
        universidad.listarCursos();
        prof3.listarCursos();

        // 7. Remover un profesor
        System.out.println("\nEliminando profesor P002:");
        universidad.eliminarProfesor("P002");
        universidad.listarProfesores();
        universidad.listarCursos();

        // 8. Mostrar reporte: cantidad de cursos por profesor
        System.out.println("\nReporte de cantidad de cursos por profesor:");
        for (Profesor prof : new Profesor[]{prof1, prof3}) {
            System.out.println(prof.getNombre() + ": " + prof.getCursos().size() + " curso(s)");
        }
    }
}
