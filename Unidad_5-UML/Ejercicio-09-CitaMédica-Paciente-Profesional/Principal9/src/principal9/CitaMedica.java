/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal9;

/**
 *
 * @author tnhei
 */
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class CitaMedica {
    private Date fecha;
    private String hora;
    private List<Paciente> pacientes;
    private Profesional profesional;

    public CitaMedica(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.pacientes = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void addPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
}
