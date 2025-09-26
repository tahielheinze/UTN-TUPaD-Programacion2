/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal13;

/**
 *
 * @author tnhei
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        System.out.println("Codigo QR generado para: " + usuario.getNombre());
    }
}

