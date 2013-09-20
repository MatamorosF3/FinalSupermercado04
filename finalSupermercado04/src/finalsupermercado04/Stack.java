/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Francisco Matamoros
 */
public class Stack extends ADTStack {

    protected Node head; // nodo cabeza

    public Stack() { // constructor vacio 
        super();
        head = null;
        size = 0;
    }

    @Override
    public boolean push(Object data) { // metodo utlizado para agregar elementos a la pila
        try {
            Node neo = new Node(data); // creacion del nuevo nodo a agregar
            if (head == null) { // verificamos si la cabeza ya tiene elementos
                head = neo; // de ser lo contrario se le asigna el nuevo elemento
            } else {
                /*
                 * recordeoms que siempre el ultimo 
                 * elemento en ingresarse a la pila
                 * pasara a ser la cabeza, ya que utilizamos
                 * UEPS(ultimas entradas ultimas salidas)
                 */
                neo.next = head; 
                head = neo;

            }

        } catch (Exception e) {
            System.out.println("False");
            return false;
        }
        size++; // incrementamos tamaño de la cola
        return true;

    }

    @Override
    public Object pop() { // metodo utilizado para eliminar elementos de la pila
        Object element = null;
        try {
            element = head.getData(); // asignacion del metodo a eliminar para mostrar en pantalla
            head = head.next; // movemos la cabeza al segundo elemento de la lista 

        } catch (Exception e) {
            return null;
        }
        size--; // disminuimos el tamaño de la pila
        return element; // retornamos el elemento a eliminar
    }

    @Override
    public int Size() { // metodo utilizado para acceder al tamaño de la pila
        return size;
    }

    @Override
    public Object peek() { // metodo utilizado para mostrar el primer elemento de la pila, el que esta en la cola 
        try {
            return head.getData();
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public boolean isEmpty() { // metodo utilizado para verificar si la pila esta vacia
        return size == 0;
    }
}
