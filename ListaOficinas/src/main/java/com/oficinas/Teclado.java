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
public class Teclado extends DispositivosEntrada{
    private int id;
    private static int contador;
    
    public Teclado(String tipo, String marca){
        super(tipo, marca);
        this.id = ++contador;
    }
    
    @Override
    public String toString(){
        return "Teclado: id: " + this.id + " " + super.toString();
    }
}
