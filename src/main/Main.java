/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import boxing.AutoboxingUnboxing;
import enumerados.Paises;
import instancia.Circulo;
import instancia.Cuadrado;
import instancia.Elipse;
import instancia.FiguraGeometrica;
import instancia.Triangulo;
import interfaces.AccesoDatos;
import interfaces.ImplementacionMysql;
import interfaces.ImplementacionOracle;
import oficina.Oficina;
import polimorfismo.Empleado;
import polimorfismo.Escritor;
import polimorfismo.Gerente;
import polimorfismo.TipoEscritura;

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
        
        manejoDeInterfaces();
        /*ejemploDeClasesAbstractas();
        comparacionDeObjectos();
        conversionDeObjetos();
        conceptoDePolimorfismo();
        instanceOfOperator();
        AutoboxingUnboxing.autoboxingUnboxing();
        repasoConceptosGeneralesDeLaPoo();
        probandoCosillas();
        pasoDeArgumentosVariables(1,2,3,4);
        pasoDeArgumentosVariables(1,2,3,4,5,6,7);
        tiposEnumerados();*/
     
    }
    
    /**
     * <p> Interfaz: es una lista de acciones que puede llevar a cabo un determinado objeto
     * Una clase puede implementar varias interfaces
     * Clases Abstractas vs Interfaces
     * CA: encapsula funcionalidad comun, objetos realcionados
     * Interfaz:  define comportamiento relacionado que puede pertenece a cualquioer clase o estructura, objetos no realcionados
     * </p>
     * @author Carlos Amores
     * @versio 1.0
     */
    public static void manejoDeInterfaces(){
        
        AccesoDatos datos = new ImplementacionMysql();
        datos.listar();
        datos.insertar();
        
        datos = new ImplementacionOracle();
        datos.listar();
        datos.insertar();
    }
    
    /**
     * <p> Ejemplo para el manejo de clases abstractas </p>
     * @author Carlos Amores
     * @versio 1.0
     */
    public static void ejemploDeClasesAbstractas(){
        
        // Creamos objetos
        FiguraGeometrica triangulo = new Triangulo("triangulo");
        FiguraGeometrica cuadrado = new Cuadrado("cuadrado");
        FiguraGeometrica circulo = new Circulo("circulo");
        FiguraGeometrica elipse = new Elipse("elipse");
        
        System.out.println(triangulo);
        triangulo.dibujar();
        System.out.println("");
        
        System.out.println(cuadrado);
        cuadrado.dibujar();
        System.out.println("");
        
        System.out.println(circulo);
        circulo.dibujar();
        System.out.println("");
        
        System.out.println(elipse);
        elipse.dibujar();
        System.out.println("");
        
    }
    
    /**
     * <p> Sobreescibimos metodos hashCode y equals de la clase objeto </p>
     * @author Carlos Amores
     * @versio 1.0
     */
    public static void comparacionDeObjectos(){
        Empleado em1 = new Empleado("Carlos Empleado", 1200);
        Empleado em2 = new Empleado("Carlos Empleado", 1200);
        if (em1 == em2) {
            System.out.println("Los objetos tienen misma dirección de memoria");
        }else{
            System.out.println("Los objetos NO tiene misma dirección de memoria");
        }
        if (em1.equals(em2)) {
            System.out.println("Los objetos tienen mismo contenido SON IGUALES");
        }else{
            System.out.println("Los objetos NO SON iguales, no tienen mismo contenido");
        }
        if (em1.hashCode() == em2.hashCode()) {
            System.out.println("Los objetos tienen mismo código hash");
        }else{
            System.out.println("Los objetos NO tienen el mismo código hash");
        }
    }
    
    /**
     * <p> Polomorfismo: ejecucion de métodos iguales en tiempos distintos.
     * Se ejecutan en clases heredadas de una clase padre.
     * </p>
     * @author Carlos Amores
     * @versio 1.0
     */
    public static void conceptoDePolimorfismo(){
        Empleado em = new Empleado("Carlos Empleado", 1200);
        System.out.println(em.toString());
        em = new Gerente("Carlos Gerente", 2500, "Comercial");
        System.out.println(em.toString());
    }
    
    /**
     * <p> Conversión de objetos:
     * <b> Upcasting:</b> de menos a menos
     * <b> Downcasting:</b> de mas a menos
     * </p>
     * @author Carlos Amores
     * @versio 1.0
     */
    public static void conversionDeObjetos(){
        Empleado em;
        
        // Asignamos una referencia a un objeto de menor jerarquia (UPCASTING)
        // No hay necesidad de notación especial. Conversion hacias arriba, de menos a mas
        em = new Escritor("Carlos Empleado", 1200, TipoEscritura.CLASICO);
        
        // Esta caracterisitca no es comun para todas las clases y fallaria la ejecución
        //em.getTipoEscrituraenTexto();
        
        System.out.println(em.toString());
        
        if (em instanceof Escritor) {
            // Convertimos un objeto a de mayor a jerarquia a menor jerarquia
            // Downcasting: de mas a menos
            Escritor escritor = (Escritor)em;
            
            String cadena = escritor.getTipoEscrituraEnTexto();
            System.out.println(cadena);
           
            System.out.println(((Escritor)em).getTipoEscrituraEnTexto());
        }
        
        
    }
    
    /**
     * <p> Repasando concepto del operador <strong> intanceof </strong></p>
     * @author Carlos Amores
     * @version 1.0
     */
    public static void instanceOfOperator(){
        
        FiguraGeometrica figura = new Elipse();
        if (figura instanceof Object) {
            System.out.println("Es de tipo Object");
        }
        if (figura instanceof FiguraGeometrica) {
            System.out.println("Es de tipo Figura geometrica");
        }
        if (figura instanceof Circulo) {
            System.out.println("Es de tipo Circulo");
        }
        if (figura instanceof Elipse) {
            System.out.println("Es de tipo Elipse");
        }
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
