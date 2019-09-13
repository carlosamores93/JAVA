/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.computers;

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
    private int contadorMonitores;
    private Ram rams[];
    private final int MAX_RAM = 2;
    private int contadorRams;
    private Rom roms[];
    private final int MAX_ROM = 3;
    private int contadorRoms;
    private Raton raton;
    private Teclado teclado;
    
    private Computadora(){
        id = ++contador;
    }
    
    public Computadora(Cpu cpu, Teclado t, Raton r){
        this();
        this.cpu = cpu;
        this.monitores = new Monitor[MAX_MONITORES];
        this.contadorMonitores = 0;
        this.rams = new Ram[MAX_RAM];
        this.contadorRams = 0;
        this.roms = new Rom[MAX_ROM];
        this.contadorRoms = 0;
        this.raton = r;
        this.teclado = t;
    }
    
    public void setCpu(Cpu cpu){
        this.cpu = cpu;
    }
    
    public Cpu getCpu(){
        return this.cpu;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Raton getRaton() {
        return this.raton;
    }
    

    public void setMonitores(Monitor[] monitores) {
        this.monitores = monitores;
    }
    
    public void setMonitor(Monitor m) {
        if (this.contadorMonitores < this.MAX_MONITORES) {
            this.monitores[this.contadorMonitores] = m;
            this.contadorMonitores++;
        } else {
            System.err.println("Computadora " + this.id + " ya tiene un maximo de monitores");
        }
    }

    public Monitor[] getMonitores() {
        return monitores;
    }

    public void setRams(Ram[] rams) {
        this.rams = rams;
    }
    
    public void setRom(Rom r) {
        if (this.contadorRoms < this.MAX_ROM) {
            this.roms[this.contadorRoms] = r;
            this.contadorRoms++;
        } else {
            System.err.println("Computadora " + this.id + " ya tiene un maximo de roms");
        }
    }
    
    public void setRam(Ram r) {
        if (this.contadorRams < this.MAX_RAM) {
            this.rams[this.contadorRams] = r;
            this.contadorRams++;
        } else {
            System.err.println("Computadora " + this.id + " ya tiene un maximo de rams");
        }
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
        String computadora = "\nComputadora " + this.id + ":";
        String cpu_info ="\n\t" + this.cpu.toString();
        String raton_info = "\n\t" + this.raton.toString();
        String teclado_info = this.teclado.toString();
        String monitores_info = "\n\t";
        for (Monitor monitore : this.monitores) {
            monitores_info = monitores_info + monitore.toString() + "\n\t";
        }
        String rom_info = "";
        for (int i = 0; i < this.roms.length; i++) {
            rom_info = rom_info + this.roms[i].toString() + "\n\t";
        }
        String ram_info = "";
        for (Ram ramm : this.rams) {
           ram_info =  ram_info + ramm.toString() + "\n\t";
        }
        return computadora + cpu_info + monitores_info + rom_info + ram_info + teclado_info + raton_info;
    }
    
    
}
