/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misc;

import dol.Factura;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Controles {
    public static Double Multiplicar(Double a,Double b){
        return a*b;
    }
    public static Double CFactura(ArrayList<Factura> a){
       int i=0;
       Double Total=0.0,sub,da;
       for(Factura b: a){
           sub=(Multiplicar(a.get(i).getCosto(),a.get(i).getCantidad()+0.0));
           da=sub*((a.get(i).getDescuento()+0.0)/100);
           Total=Total+(sub-da);
           i++;
       }
       return Total;
    }
    public static String Factura(ArrayList<Factura> a){
        int i=0;
        String texto="";
        for(Factura b:a){
            texto=texto+a.get(i).toString()+"\n";
            i++;
        }
        return texto+"Total="+CFactura(a);
    }
}
