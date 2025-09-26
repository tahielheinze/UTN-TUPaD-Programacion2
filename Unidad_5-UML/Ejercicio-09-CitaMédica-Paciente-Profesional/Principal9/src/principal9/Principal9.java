/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal9;

/**
 *
 * @author tnhei
 */
import java.util.Date;

public class Principal9 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 9: CitaMedica - Paciente - Profesional ===");

        Paciente paciente1 = new Paciente("Tahiel Heinze", "OSDE");
        Paciente paciente2 = new Paciente("Ana Gomez", "Swiss Medical");
        Profesional profesional = new Profesional("Dr. Juan Perez", "Cardiologia");

        CitaMedica cita = new CitaMedica(new Date(), "10:00");
        cita.addPaciente(paciente1);
        cita.addPaciente(paciente2);
        cita.setProfesional(profesional);

        System.out.println("Fecha de cita: " + cita.getFecha());
        System.out.println("Hora de cita: " + cita.getHora());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Pacientes:");
        for (Paciente paciente : cita.getPacientes()) {
            System.out.println("- " + paciente.getNombre());
        }
    }
}


