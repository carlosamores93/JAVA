/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaOficinas;
import com.oficinas.*;

/**
 *
 * @author carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Cpu intel3 = new Cpu("i3", 2, 4);
        Cpu intel5 = new Cpu("i5", 2, 8);
        Cpu intel7 = new Cpu("i7", 3, 12);
        Cpu amd = new Cpu("AMD", 2, 8);        
        Cpu celeron = new Cpu("Celeron", 1, 2);

        System.out.println(intel3.toString());
        System.out.println(intel5.toString());
        System.out.println(intel7.toString());
        System.out.println(amd.toString());
        System.out.println(celeron.toString());

        
        
        
        Monitor monitor1 = new Monitor("Dell", "HDMI", 24);
        Monitor monitor2 = new Monitor("HP", "VGA", 24);
        Monitor monitor3 = new Monitor("ASUS", "HDMI", 20);        
        Monitor monitor4 = new Monitor("ACER", "HDMI/VGA", 30);
        System.out.println(monitor1.toString());
        System.out.println(monitor2.toString());
        System.out.println(monitor3.toString());
        System.out.println(monitor4.toString());
        
        
        Ram ram1 = new Ram("MARCA", 8);
        System.out.println(ram1.toString()); 
        Ram ram2 = new Ram("DELL", 4);
        System.out.println(ram2.toString()); 
        Ram ram3 = new Ram("TOSS", 12);
        System.out.println(ram3.toString()); 
        
        Rom rom1 = new Rom("DELL", 256);
        Rom rom2 = new Rom("Toshiba", 512);
        Rom rom3 = new Rom("Kingstioon SSD", 128);
        Rom rom4 = new Rom("Kinn SSD", 256);
        System.out.println(rom1.toString());
        System.out.println(rom2.toString());
        System.out.println(rom3.toString());
        System.out.println(rom4.toString());
        
        
        Raton raton1 = new Raton("USB", "Dell");
        Raton raton2 = new Raton("Inalambrico", "HP");
        Raton raton3 = new Raton("Integrado", "Lenovo");
        Raton raton4 = new Raton("Blutut", "Apple");
        System.out.println(raton1.toString());
        System.out.println(raton2.toString());
        System.out.println(raton3.toString());
        System.out.println(raton4.toString());
        
        Teclado teclado1 = new Teclado("USB", "Dell");
        Teclado teclado2 = new Teclado("Inalambrico", "HP");
        Teclado teclado3 = new Teclado("Integrado", "Lenovo");
        Teclado teclado4 = new Teclado("Blutut", "Apple");
        System.out.println(teclado1.toString());
        System.out.println(teclado2.toString());
        System.out.println(teclado3.toString());
        System.out.println(teclado4.toString());

        Computadora machine1 = new Computadora(amd, teclado1, raton4);
        machine1.setMonitor(monitor1);
        machine1.setMonitor(monitor2);
        machine1.setMonitor(monitor3);
        machine1.setMonitor(monitor4);
        machine1.setRom(rom1);
        machine1.setRom(rom2);
        machine1.setRom(rom3);
        machine1.setRom(rom4);
        machine1.setRam(ram1);
        machine1.setRam(ram2);
        machine1.setRam(ram3);
        machine1.setTeclado(teclado1);
        machine1.setRaton(raton1);
        System.out.println(machine1.toString());
        Computadora machine2 = new Computadora(intel7, teclado2, raton1);
        Rom roms[] = {new Rom("DELL", 256), new Rom("Toshiba", 512)};
        Monitor monitoresArray[] = { new Monitor("Carlos", "USB", 24)};
        machine2.setRoms(roms);
        machine2.setMonitores(monitoresArray);
        Ram ramms[] = {new Ram("CArlos RAM", 500)};
        machine2.setRams(ramms);
        machine2.setTeclado(teclado4);
        machine2.setRaton(raton4);
        System.out.println(machine2.toString());
        
    }
    
}
