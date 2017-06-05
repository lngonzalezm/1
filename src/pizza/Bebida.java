/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author USER
 */
public class Bebida {
    private String Tamaño;
    private String Sabor;
    private double PrecioB;

    public Bebida(String Tamaño, String Sabor, double PrecioB) {
        this.Tamaño = Tamaño;
        this.Sabor = Sabor;
        this.PrecioB = PrecioB;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    public double getPrecioB() {
        return PrecioB;
    }

    public void setPrecioB(double PrecioB) {
        this.PrecioB = PrecioB;
    }
    
    
}
