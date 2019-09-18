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
public class Escritor extends Empleado{
    final TipoEscritura tipo_escritura;
    
    public Escritor(String name, int sueldo, TipoEscritura type){
        super(name, sueldo);
        this.tipo_escritura = type;
    }
    
    @Override
    public String toString(){
        return super.toString() + " tipo escritura: " + this.tipo_escritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipo_escritura;
    }
    
    public String getTipoEscrituraEnTexto() {
        return tipo_escritura.getDescripcion();
    }    
    
}
