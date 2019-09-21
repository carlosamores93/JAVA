/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia;

/**
 *
 * @author carlos
 */
public class Cuadrado extends FiguraGeometrica{

    public Cuadrado() {
    }

    public Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }
    
    

    @Override
    public void dibujar() {
        System.out.println("Aqui deberiamos dibujar un " + this.getClass().getSimpleName());
    }
    
}
