/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_TP8;

/**
 *
 * @author tnhei
 */
public class Paypal implements InterfazPagoConDescuento {
    private String email;
    
    public Paypal(String email) {
        this.email = email;
    }
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.03;
        return monto - descuento;
    }
}
