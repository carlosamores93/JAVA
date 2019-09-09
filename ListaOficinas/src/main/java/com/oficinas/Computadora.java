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
public class Computadora {
    private int id;
    private static int contador;
    private Cpu cpu;
    private Monitor monitores[];
    private final int MAX_MONITORES = 3;
    private Ram rams[];
    private final int MAX_RAM = 2;
    private Rom roms[];
    private final int MAX_ROM = 3;
    private Raton raton;
    private Teclado teclado;
    
    private Computadora(){
        id = ++contador;
    }
    
    public Computadora(Cpu cpu, Teclado t, Raton r){
        this();
        this.cpu = cpu;
        this.monitores = new Monitor[MAX_MONITORES];
        this.rams = new Ram[MAX_RAM];
        this.roms = new Rom[MAX_ROM];
        this.raton = r;
        this.teclado = t;
    }
    
    public void setCpu(Cpu cpu){
        this.cpu = cpu;
    }
    
    public Cpu getCpu(){
        return this.cpu;
    }

    public void setMonitores(Monitor[] monitores) {
        this.monitores = monitores;
    }

    public Monitor[] getMonitores() {
        return monitores;
    }

    public void setRams(Ram[] rams) {
        this.rams = rams;
    }

    public Ram[] getRams() {
        return rams;
    }

    public void setRoms(Rom[] roms) {
        this.roms = roms;
    }

    public Rom[] getRoms() {
        return roms;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    @Override
    public String toString() {
        return "Computadora " + this.id + " { " + this.cpu.toString() + this.roms[0].toString();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
