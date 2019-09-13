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
public class Rom extends Almacenamiento{
    
    private final int id;
    private static int contador;
    
    public Rom( String marca, int cap){
        super(marca, cap);
        this.id = ++this.contador;
    }
    
    @Override
    public String toString(){
        return "ROM " + super.toString() + " " +super.getCapacidad() + " GB } ";
    }
    
}
