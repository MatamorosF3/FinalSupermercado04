/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Swammy Jose
 */
public class Cliente {
    
    int edad;
    String id;
    String nombre;
    String apellido;
    ADTStack canasta;
    boolean esSocio;
    
    public Cliente(){
        canasta = null;
        edad = 0;
        id = null;
        nombre = null;
        apellido = null;
    }
    
    public Cliente(String nombre, String apellido, String id, int edad){
        canasta = new Stack();
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ADTStack getCanasta() {
        return canasta;
    }  

    public boolean isEsSocio() {
        return esSocio;
    }

    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }
    
}
