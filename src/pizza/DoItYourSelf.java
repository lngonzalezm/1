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
public class DoItYourSelf {
   private Ingrediente ingrediente;
   private String Base;
   private int tamaño;

    public DoItYourSelf(Ingrediente ingrediente, String Base, int tamaño) {
        this.ingrediente = ingrediente;
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

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
   
   
   
}
