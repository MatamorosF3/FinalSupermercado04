/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Francisco Matamoros
 */
public class DLLNode {

    private DLLNode next, prev; // Nodo siguiente y anterior de la lista
    private Object data; // dato del nodo

    public DLLNode(Object data) { // constructor con parametros 
        prev = next = null;
        this.data = data;
    }

    public DLLNode() { // constructor vacio
        prev = next = null;
        data = null;
    }

    public void setData(Object neo) { // set del dato del nodo
        data = neo;
    }

    public void setNext(DLLNode next) { // set siguiente del nodo
        this.next = next;
    }

    public void setPrev(DLLNode prev) { // set anterior del nodo
        this.prev = prev;
    }

    public Object getData() { // metodo para obtener el dato del nodo
        return data;
    }

    public DLLNode getNext() { // metodo para obtener el siguiente elemento de la lista
        return next;
    }

    public DLLNode getPrev() { // metodo para obtener el anterior de la lista
        return prev;
    }
}
