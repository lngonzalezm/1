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
public class Prefab {
  private String SaborPizza;
  private double PrecioP;
  private String Base;
  private int tamaño;

    public Prefab(String SaborPizza, double PrecioP, String Base, int tamaño) {
        this.SaborPizza = SaborPizza;
        this.PrecioP = PrecioP;
        this.Base = Base;
        this.tamaño = tamaño;
    }

    public String getBase() {
        return Base;
    }

    public void setBase(String Base) {
        this.Base = Base;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getSaborPizza() {
        return SaborPizza;
    }

    public void setSaborPizza(String SaborPizza) {
        this.SaborPizza = SaborPizza;
    }

    public double getPrecioP() {
        return PrecioP;
    }

    public void setPrecioP(double PrecioP) {
        this.PrecioP = PrecioP;
    }
  
  
}
