/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import oficina.Oficina;

/**
 *
 * @author carlos
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        repasoConceptosGeneralesDeLaPoo();
     
    }
    
    public static void repasoConceptosGeneralesDeLaPoo(){
        Oficina ofi = new Oficina();
        System.out.println(ofi.toString());
    }
    
}
