/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

/**
 *
 * @author carlos
 */
public class PersonaBean implements java.io.Serializable {
    private String nombre;
    private int edad;

    public PersonaBean() {
    }
    
    public PersonaBean(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
