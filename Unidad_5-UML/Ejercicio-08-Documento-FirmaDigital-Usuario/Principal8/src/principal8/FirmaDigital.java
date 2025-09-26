/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal8;

/**
 *
 * @author tnhei
 */
import java.util.Date;

public class FirmaDigital {
    private String codigoHash;
    private Date fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, Date fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

