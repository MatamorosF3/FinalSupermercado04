/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Swammy Jose
 */
public abstract class ADTQueue {
    
    protected int size; // tamaño de la cola

    public abstract boolean queue(Object element); // metodo para ingresar elementos a la lista

    public abstract Object dequeue(); // metodo para sacar elementos de la lista

    public abstract Object peek(); // metodo para sacar el elemento que este en la cima

    public abstract int Size(); // metodo para acceder al size
    
}
