/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import java.util.ArrayList;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author edarvillarreal
 */
public class Entrada {
    
    Conexion c = new Conexion();
    Connection conn = null;
    
    //atributos
    private int id;
    private String nombre;
    private double precio;
    private int porciones;
    
    //constructor
    public Entrada(){
    
    }
    
    
    //métodos de la clase
    public ArrayList<Entrada> listarEntradas(){
        ArrayList<Entrada> entradas = new ArrayList<>();
        String query = "select id, nombre, precio, porciones from entrada";
        conn = c.conectar();
        Entrada entrada = null;
        
        try{
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                entrada = new Entrada();
                entrada.setId(rs.getInt("id"));
                entrada.setNombre(rs.getString("nombre"));
                entrada.setPrecio(rs.getDouble("precio"));
                entrada.setPorciones(rs.getInt("porciones"));
                
                entradas.add(entrada);
            }
            
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        
        return entradas;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
            

    //sets y gets

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
