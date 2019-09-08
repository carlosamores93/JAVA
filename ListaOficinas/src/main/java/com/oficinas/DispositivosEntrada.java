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
public class DispositivosEntrada {
    private String tipo;
    private String marca;
    
    public DispositivosEntrada(String t, String m){
        this.tipo = t;
        this.marca = m;
    }
    
    @Override
    public String toString(){
        return "Dispositivo { " + this.marca + " " + this.tipo + " }";
    }
}
