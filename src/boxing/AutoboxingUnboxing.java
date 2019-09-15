/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package boxing;

/**
 * @link sdfsdf
 * @author Carlos Amores
 * @version 37
 */
public class AutoboxingUnboxing {
    
    
    
    public static void autoboxingUnboxing(){
        Integer integerObject = 5;
        Float floatObject = 15.2F;
        System.out.println("Autoboxing (primitivos a tipo Object)");
        System.out.println("Entero object: " + integerObject.intValue());
        System.out.println("Float object: " + floatObject.floatValue());

        int entero = integerObject;
        float flotante = floatObject;
        System.out.println("Unboxing (Object a primitivos)");
        System.out.println("Integer Object to int: " + entero);
        System.out.println("Float Object to float: " + flotante);

        
    }
}
