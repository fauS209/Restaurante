/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import conexion.Conexion;
import java.sql.Connection;

/**
 *
 * @author edarvillarreal
 */
public class Factura {
    Conexion c = new Conexion();
    Connection conn = null;
    
    //atributos
    private int numFactura;
    private String fecha;
    private double subtotal;
    private double impuesto;
    private double total;
    private String estado;
    
    //constructor
    public Factura(){
        
    }
    
    //métodos de la clase
    public void insertarFactura(){
        
    }

    public Conexion getC() {
        return c;
    }

    public void setC(Conexion c) {
        this.c = c;
    }

    public Connection getConn() {
        return conn;
    }

    //sets y gets
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * @return the numFactura
     */
    public int getNumFactura() {
        return numFactura;
    }

    /**
     * @param numFactura the numFactura to set
     */
    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the impuesto
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
   
}
