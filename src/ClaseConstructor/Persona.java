/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseConstructor;

/**
 *
 * @author Noelia
 */
public class Persona {

    String nombre;
    String apellido;
    int dni;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
    }
    public Persona(int dni){
        this();
        this.dni=dni;
    }
    public Persona(int dni, String nombre){
        this(dni);
        this.nombre=nombre;
       
    }
    public Persona(int dni, String nombre, String apellido){
        this(dni,nombre);
        this.apellido=apellido;
    }
    public void mostrar(){
        System.out.println(nombre+" "+apellido+" su DNI es: "+dni);
    }

}
