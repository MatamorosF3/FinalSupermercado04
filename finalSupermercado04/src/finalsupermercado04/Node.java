/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Francisco Matamoros
 */
public class Node extends Object {

    public Node next; // siguiente nodo 
    private Object data; // dato del nodo
    
    public Node(){ // constructor predeterminado
        data = null;
        next = null;
    }
    
    public Node(Object data){ // constructor con parametro
        this.data = data; // asignamos el data 
        next = null; // declaramos next null
        
    }
   
   public Object getData(){ // retornamos el dato de la pila
        return data;
    }
   public void setData(Object neo){ // cambiamos el dato de la pila
       data = neo;
   }
}
