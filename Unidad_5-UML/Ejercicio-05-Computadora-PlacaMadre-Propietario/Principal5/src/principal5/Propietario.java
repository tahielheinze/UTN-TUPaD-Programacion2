/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal5;

/**
 *
 * @author tnhei
 */
import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String dni;
    private List<Computadora> computadoras;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.computadoras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }

    public void addComputadora(Computadora computadora) {
        this.computadoras.add(computadora);
    }
}


