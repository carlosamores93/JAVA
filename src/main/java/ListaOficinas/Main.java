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
        // TODO code application logic here
        System.out.println("Carlos Amores");
        
        // Creamos un objeto monitor
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
        
        Rom rom1 = new Rom("DELL", 256);
        Rom rom2 = new Rom("Toshiba", 512);
        Rom rom3 = new Rom("Kingstioon SSD", 128);
        System.out.println(rom1.toString());
        System.out.println(rom2.toString());
        System.out.println(rom3.toString());

        
    }
    
}
