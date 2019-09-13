/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.computers;

/**
 *
 * @author carlos
 */
public class Monitor {
    private final int id;
    private static int numeroMonitores;
    private String marca;
    private String tipoConexion;
    private int pulgadas;
    
    public Monitor(String marca, String conexion, int pul){
        this.id = ++this.numeroMonitores;
        this.marca = marca;
        this.pulgadas = pul;
        this.tipoConexion = conexion;
    }
    
    public void setMarca(String brand){
        this.marca = brand;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setConexion(String conexion){
        this.tipoConexion = conexion;
    }
    
    public String getConexion(){
        return this.tipoConexion;
    }
    
    public void setPulgadas(int pul){
        this.pulgadas = pul;
    }
    
    public int getPulgadas(){
        return this.pulgadas;
    }
    
    @Override
    public String toString(){
        return "Monitor { " + this.marca + " " + this.tipoConexion  + " " + this.pulgadas + " pulgadas }";
    }
    
}
