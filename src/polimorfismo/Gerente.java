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
public class Gerente extends Empleado{
    protected String departament;
    
    public Gerente(String name, int sueldo, String depart){
        super(name, sueldo);
        this.departament = depart;
    }
    
    @Override
    public String toString(){
        return super.toString() + " departamento: " + this.departament;
    }
}
