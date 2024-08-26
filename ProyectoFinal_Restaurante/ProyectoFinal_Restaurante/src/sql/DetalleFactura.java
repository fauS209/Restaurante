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
public class DetalleFactura {
    Conexion c = new Conexion();
    Connection conn = null;
    
    //atributos
    private Factura factura;
    private int numLinea;
    private Entrada entrada;
    private PlatoFuerte platoFuerte;
    private Guarnicion guarnicion;
    private Bebida bebida;
    private double subtotal;
    
    //métodos de la clase
    public void insertarDetalleFactura(){
        
    }
    
    
    //set y gets

    /**
     * @return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * @return the numLinea
     */
    public int getNumLinea() {
        return numLinea;
    }

    /**
     * @param numLinea the numLinea to set
     */
    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }

    /**
     * @return the entrada
     */
    public Entrada getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    /**
     * @return the platoFuerte
     */
    public PlatoFuerte getPlatoFuerte() {
        return platoFuerte;
    }

    /**
     * @param platoFuerte the platoFuerte to set
     */
    public void setPlatoFuerte(PlatoFuerte platoFuerte) {
        this.platoFuerte = platoFuerte;
    }

    /**
     * @return the guarnicion
     */
    public Guarnicion getGuarnicion() {
        return guarnicion;
    }

    /**
     * @param guarnicion the guarnicion to set
     */
    public void setGuarnicion(Guarnicion guarnicion) {
        this.guarnicion = guarnicion;
    }

    /**
     * @return the bebida
     */
    public Bebida getBebida() {
        return bebida;
    }

    /**
     * @param bebida the bebida to set
     */
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
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
    
}
