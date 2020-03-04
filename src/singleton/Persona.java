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
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private static Persona laUnica;

    private Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    private Persona() {
    }

    public static Persona getInstance() {
        if (laUnica == null) {
            laUnica = new Persona();
        }
        return laUnica;
    }

    public static Persona getInstancePar(String nombre, String apellido, int edad) {
        if (laUnica == null) {
            laUnica = new Persona(nombre, apellido, edad);
        }
        return laUnica;
    }

    public void setNombre(String nombre) {
        laUnica.nombre = nombre;
    }

    public void setApellido(String apellido) {
        laUnica.apellido = apellido;
    }

    public void setEdad(int edad) {
        laUnica.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona:" + "\nnombre = " + nombre + "\napellido = "
                + apellido + "\nedad = " + edad + "\n";
    }

}
