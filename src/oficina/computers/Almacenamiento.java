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
public class Almacenamiento {
    
    private String marca;
    private int capacidad;
    
    public Almacenamiento(String marca, int cap){
        this.marca = marca;
        this.capacidad = cap;
    }
    
    public void setMarca(String brand){
        this.marca = brand;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setCapacidad(int cap){
        this.capacidad = cap;
    }
    
    public int getCapacidad(){
        return this.capacidad;
    }
    
    @Override
    public String toString(){
        return "Almacenamiento { " + this.marca ;
    }
    
    
}
