/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Francisco Matamoros
 */
public abstract class ADTStack {

    protected int size; // tamaño de la pila

    public abstract boolean push(Object element); // metodo para ingresar elemento a la pila

    public abstract Object pop(); // metodo para eliminar elemento de la cima de la pila

    public abstract Object peek(); // metodo para sacar elemento de la cima de la pila

    public abstract int Size(); // metodo para obtener el tamaño de la lista

    public abstract boolean isEmpty(); // metodo para verificar si la pila esta vacia 
}
