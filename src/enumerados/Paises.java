/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

/**
 *
 * @author carlos
 */
public enum Paises {
    
    VENEZUELA(1),
    COLOMBIA(2),
    ECUADOR(3),
    PERU(4),
    CHILE(5),
    ARGENTINA(6);
    
    // Atributo de cada elemento de una enumeracion
    private final int PAISES;
        
    Paises(int paises){
        this.PAISES = paises;
    }
    
    public int getCode(){
        return this.PAISES;
    }
}
