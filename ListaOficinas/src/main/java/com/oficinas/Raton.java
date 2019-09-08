/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oficinas;

/**
 *
 * @author carlos
 */
public class Raton extends DispositivosEntrada{
    private int id;
    private static int contador;
    
    public Raton(String tipo, String marca){
        super(tipo, marca);
        this.id = ++contador;
    }
    
    @Override
    public String toString(){
        return "Raton: id: " + this.id + " " + super.toString();
    }
}
