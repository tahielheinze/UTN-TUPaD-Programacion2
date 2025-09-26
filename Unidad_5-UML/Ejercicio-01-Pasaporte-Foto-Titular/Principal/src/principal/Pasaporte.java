/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tnhei
 */
package principal;

import java.util.Date;

public class Pasaporte {
    private String numero;
    private Date fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, Date fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto("", "");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this);
    }
}

