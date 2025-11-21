/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_TP8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tnhei
 */
public class Pedido implements InterfazPagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;
    
    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El estado del pedido cambio a: " + nuevoEstado);
        }
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    public String getEstado() {
        return estado;
    }
}
