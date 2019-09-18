/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author carlos
 */
public enum TipoEscritura {
    
    CLASICO("Escritura a mano"),
    MODERNO("Escritura a máquina");
    
    private final String descripcion;
    
    private TipoEscritura(String desc){
        this.descripcion = desc;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
}
