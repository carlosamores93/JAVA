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
        //probandoCosillas();
     
    }
    
    public static void repasoConceptosGeneralesDeLaPoo(){
        Oficina ofi = new Oficina();
        System.out.println(ofi.toString());
    }
    
    
    public static void probandoCosillas(){
        /*
        * Test Comentario
        * XD
        * */
       System.out.println("Carlos Amores Martinez");

       /*
        * Variables: dir de memoria para almacenar un valor
        * Tipos de variables o datos:
        * 	byte, short, int, long, char, float, double y boolean
        * 
        *		Nombre	bytes	Rango
        *		long	8		–9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        *		int		4		–2,147,483,648 a 2,147,483,647
        *		short	2		–32,768 to 32,767
        *		byte	1		–128 to 127
        *
        *		double	8		4.9e–324 to 1.8e+308
        *		float	4		1.4e–045 to 3.4e+038
        * */

       int version = 9;
       System.out.println("Valor de la variable 'version'=" + version);

       float variable_float = 9.8f;
       char letra = 'a';
       char numero_char = 97;
       System.out.println("letra=" + letra + " -- numero_char=" + numero_char);

       boolean ok = true;
       boolean ko = false;

       byte diasMes = 31; //Aproximadamente
       short diasLustro = (12 * 31) * 5;
       int velocidadLuz = 299792458;
       long añoLuz = velocidadLuz * 365;

       float pi = 3.1415926535f;
       double e = 2.718281828459045235360;

       /*
        * 		\n. Salto de línea.
        *		\t. Tabulador.
        *		\\. Diagonal inversa.
        *		\". Comillas dobles.
        *		\'. Comillas simples.
        *
        */
       System.out.print("Hola,\nagregamos un salto");
       System.out.print("\tagregamos un tab");
       System.out.println("");

       System.out.println("Mensaje con \\ diagonal inversa");
       System.out.println("Mensaje con \" comillas dobles");
       System.out.println("Mensaje con \' comillas simples");



       /*
        * Constante
        * */
       final int puerto_bbdd = 21;
    }
}
