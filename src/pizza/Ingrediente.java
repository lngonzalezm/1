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
public class Ingrediente {
    private String Nombreingrediente;
    private double Precio;


    public Ingrediente(String Nombreingrediente, double Precio) {
        this.Nombreingrediente = Nombreingrediente;
        this.Precio = Precio;

    }

    

    public String getNombreingrediente() {
        return Nombreingrediente;
    }

    public void setNombreingrediente(String Nombreingrediente) {
        this.Nombreingrediente = Nombreingrediente;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    

    public Ingrediente(String ingrediente) {
        this.Nombreingrediente = ingrediente;
    }
    
    
}
