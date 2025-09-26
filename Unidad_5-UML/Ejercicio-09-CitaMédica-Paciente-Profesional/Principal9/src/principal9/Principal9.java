/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal9;

/**
 *
 * @author tnhei
 */
public class Principal9 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 9: CitaMedica - Paciente - Profesional ===");

        Paciente paciente = new Paciente("Tahiel Heinze", "OSDE");
        Profesional profesional = new Profesional("Dr. Juan Perez", "Cardiologia");
        CitaMedica cita = new CitaMedica("2025-12-25", "10:00");

        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Obra Social: " + cita.getPaciente().getObraSocial());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Especialidad: " + cita.getProfesional().getEspecialidad());
        System.out.println("Fecha de cita: " + cita.getFecha());
        System.out.println("Hora de cita: " + cita.getHora());
    }
}

