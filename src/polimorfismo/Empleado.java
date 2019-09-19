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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Sobreeescrinbimos el método de la clase Object, para comparar dos objetos
     * @param obj Se le pasa un objeto
     * @return Un tipo boolean
     */
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof Empleado){
            //Convertimos al tipo empleado
            // Downcasting: Object a empleado
            Empleado empleado = (Empleado)obj;
            if (this.name.equals(empleado.name) && (this.sueldo == empleado.sueldo)) {
                return true;
            }else{
                return false;
            }
        }else{
           return false;
        }
    }
    
    @Override
    public int hashCode(){
        int hash = 23;
        hash = 7 * hash + this.name.hashCode();
        hash = 7 * hash + this.sueldo;
        return hash;
    }
    
    
}
