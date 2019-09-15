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
public class Empleado {
    protected String name;
    protected int sueldo;

    public Empleado() {
    }
    
    public Empleado(String nombre, int sueldo){
        this.name =nombre;
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + name + ", sueldo: " + sueldo;
    }
    
    
}
