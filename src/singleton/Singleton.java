/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author jalvarezbretana
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona miPersona;
        miPersona = Persona.getInstancePar("Pepito", "Grillo", 15);
        System.out.println(miPersona.toString());
        Persona tuPersona = Persona.getInstance();
        System.out.println(tuPersona.toString());
        System.out.println(miPersona.toString());

    }

}
