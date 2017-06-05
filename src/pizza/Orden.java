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
public class Orden {
    private DoItYourSelf doityourself;
    private Prefab prefab;
    private Bebida bebida;

    public Orden(DoItYourSelf doityourself, Prefab prefab, Bebida bebida) {
        this.doityourself = doityourself;
        this.prefab = prefab;
        this.bebida = bebida;
    }

    public Orden(Prefab prefab, Bebida bebida) {
        this.prefab = prefab;
        this.bebida = bebida;
    }

    public Orden(DoItYourSelf doityourself, Prefab prefab) {
        this.doityourself = doityourself;
        this.prefab = prefab;
    }

    public Orden(DoItYourSelf doityourself, Bebida bebida) {
        this.doityourself = doityourself;
        this.bebida = bebida;
    }

    public Orden(DoItYourSelf doityourself) {
        this.doityourself = doityourself;
    }

    public Orden(Prefab prefab) {
        this.prefab = prefab;
    }

    public Orden(Bebida bebida) {
        this.bebida = bebida;
    }
    

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public DoItYourSelf getDoityourself() {
        return doityourself;
    }

    public void setDoityourself(DoItYourSelf doityourself) {
        this.doityourself = doityourself;
    }

    public Prefab getPrefab() {
        return prefab;
    }

    public void setPrefab(Prefab prefab) {
        this.prefab = prefab;
    }
    
    
}
