/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

/**
 *
 * @author HP
 */
public class Factura {
    private String Producto;
    private Double Costo;
    private int Cantidad,Descuento;

    public Factura(String Producto, Double Costo, int Cantidad, int Descuento) {
        this.Producto = Producto;
        this.Costo = Costo;
        this.Cantidad = Cantidad;
        this.Descuento = Descuento;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public Double getCosto() {
        return Costo;
    }

    public void setCosto(Double Costo) {
        this.Costo = Costo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }

    @Override
    public String toString() {
        return "Factura{" + "Producto=" + Producto + ", Costo=" + Costo + ", Cantidad=" + Cantidad + ", Descuento=" + Descuento + '}';
    }
}
