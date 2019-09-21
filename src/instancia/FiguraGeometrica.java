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
public abstract class FiguraGeometrica {
    
    protected String tipoFigura;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    // Es un metodo abstracto, lo implementará la clase que herede de esta
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "Tipo figura: " + this.tipoFigura; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
