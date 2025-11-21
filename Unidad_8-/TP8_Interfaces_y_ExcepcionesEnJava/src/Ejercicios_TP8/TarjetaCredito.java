/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_TP8;

/**
 *
 * @author tnhei
 */
public class TarjetaCredito implements InterfazPagoConDescuento {
    private String numero;
    
    public TarjetaCredito(String numero) {
        this.numero = numero;
    }
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Credito: $" + monto);
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.05;
        return monto - descuento;
    }
}
