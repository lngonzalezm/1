/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int TipoPizza;
        int i;
        do{
        System.out.println("Buenos dia, para empezar con su orden debe escoger si quiere hacer su pizza escogiendo los ingredientes o seleccionando una que ya esa prefabricada, para seleccionar la prefabricada escoja 1 de lo contrario escoja 2");
        Scanner Teclado = new Scanner(System.in);
        TipoPizza = Teclado.nextInt();
            if (TipoPizza==1) {
                    System.out.println("Su elección ha sido una pizza prefabricada, usted puede escoger entre estas cuatro opciones: ");
                    
                    System.out.println( "\nPollo con champiñones, seleccione 1");
                    System.out.println( "Pepperoni, seleccione 2");
                    System.out.println( "Hawaiana, seleccione 3");
                    System.out.println( "Vegetariana, seleccione 4");
                    int Sabor = Teclado.nextInt();
                    if (Sabor==1){
                        
                    }
                    
            }else if(TipoPizza==2){
                    System.out.println("b");
            }else{
                    System.out.println("Por favor escoga de nuevo su opción correctamente para seleccionar la prefabricada escoja 1 de lo contrario escoja 2");
            }
        i=TipoPizza;
            
        }while((1!=i) && (i!=2));
    }
}
