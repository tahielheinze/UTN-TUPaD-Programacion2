/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal10;

/**
 *
 * @author tnhei
 */
import java.util.ArrayList;
import java.util.List;

public class Titular {
    private String nombre;
    private String dni;
    private List<CuentaBancaria> cuentasBancarias;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentasBancarias = new ArrayList<>();
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

    public List<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void addCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentasBancarias.add(cuentaBancaria);
    }
}


