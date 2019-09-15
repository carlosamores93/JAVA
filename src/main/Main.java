/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import boxing.AutoboxingUnboxing;
import enumerados.Paises;
import oficina.Oficina;

/**
 * <p>Clase principal
 * <a href="http://carlosamores.hol.es" target="_blank">Carlo Amores Website</a>
 * </p>
 * @author Carlos Salvador Amores MArtinez
 * @version 1.0
 */
public class Main {
    
    /**
     * <p>Método principal</p>
     * @author Carlos Salvador Amores MArtínez
     * @param args the command line arguments
     * @see <a href="http://carlosamores.hol.es">Mi sitio web</a>
     * @since 1.0
    */
    public static void main(String[] args) {
        
        AutoboxingUnboxing.autoboxingUnboxing();
        repasoConceptosGeneralesDeLaPoo();
        probandoCosillas();
        pasoDeArgumentosVariables(1,2,3,4);
        pasoDeArgumentosVariables(1,2,3,4,5,6,7);
        tiposEnumerados();
     
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
    
    public static void pasoDeArgumentosVariables(int... numeros){ 
        for (int num : numeros) {
            System.out.print( num + " ");
        }
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * <p> Tipos enumeraods en Java</p>
     * @author Carlos Salvador Amores MArtínez
     * @location Madrid
    */
    public static void tiposEnumerados(){ 
        System.out.println("Pais: " + Paises.ARGENTINA);
        System.out.println("Pais: " + Paises.ECUADOR.getCode());
        for (Paises p : Paises.values()) {
            System.out.println("Pais: " + p + ", code: " + p.getCode() + " , " + p.name());
        }
    }
}
