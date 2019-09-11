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
public class DispositivosEntrada {
    private String tipo;
    private String marca;
    
    public DispositivosEntrada(String t, String m){
        this.tipo = t;
        this.marca = m;
    }
    
    public void setMarca(String brand){
        this.marca = brand;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setTipo(String cap){
        this.marca = cap;
    }
    
    public String getTipo(){
        return this.marca;
    }
    
    @Override
    public String toString(){
        return "Dispositivo { " + this.marca + " " + this.tipo + " }";
    }
}
