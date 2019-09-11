/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computers;

/**
 *
 * @author carlos
 */
public class Cpu {
    private String marca;
    private int velocidad;
    private int procesadores;
    
    public Cpu(String brand,int vel,int proc){
        this.marca = brand;
        this.velocidad = vel;
        this.procesadores = proc;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
    public void setVelocidad(int vel){
        this.velocidad = vel;
    }
    
    public int getProcesadores(){
        return this.procesadores;
    }
    public void setProcesadores(int proc){
        this.procesadores = proc;
    }
    
    @Override
    public String toString(){
        return "CPU { " + this.marca + " " + this.procesadores + " procesadores a " + this.velocidad + " GHz }";
    }
}
