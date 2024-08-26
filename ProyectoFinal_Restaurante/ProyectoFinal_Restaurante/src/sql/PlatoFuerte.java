/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author edarvillarreal
 */
public class PlatoFuerte {
    Conexion c = new Conexion();
    Connection conn = null;
    
    //atributos
    private int id;
    private String nombre;
    private double precio;
    private int porciones;
    
    //constructor
    public PlatoFuerte(){
        
    }
    
    //métodos de la clase
    //métodos de la clase
    public ArrayList<PlatoFuerte> listarPlatosFuertes(){
        ArrayList<PlatoFuerte> platosFuertes = new ArrayList<PlatoFuerte>();
        String query = "select id, nombre, precio, porciones from platofuerte";
        conn = c.conectar();
        PlatoFuerte platoFuerte = null;
        
        try{
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                platoFuerte = new PlatoFuerte();
                platoFuerte.setId(rs.getInt("id"));
                platoFuerte.setNombre(rs.getString("nombre"));
                platoFuerte.setPrecio(rs.getDouble("precio"));
                platoFuerte.setPorciones(rs.getInt("porciones"));
                
                platosFuertes.add(platoFuerte);
            }
            
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        
        return platosFuertes;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the porciones
     */
    public int getPorciones() {
        return porciones;
    }

    /**
     * @param porciones the porciones to set
     */
    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }
    
}
