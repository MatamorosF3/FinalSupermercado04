/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Swammy Jose
 */
public class Queue extends ADTQueue{
    
     protected Node head;

    public Queue() { // constructor vacio 
        super();
        head = null;
        size = 0;
    }

    @Override
    public boolean queue(Object data) { // metodo para agregar elemento a la cola
        try {
            Node neo = new Node(data); // creacion del nuevo dato
            if (head == null) {
                /*
                 * si la cabeza esta vacia
                 * solamente se le asignara el nuevo elemento
                 */
                head = neo;
            } else { 
                /*
                 * en caso de tener por lo menos 1 elemento
                 * se debera crear un nodo temporal para poder
                 * explorar la cola y no perder referecia de la cabeza
                 */
                Node temp = head; // asignacion del nodo head al nodo temporal
                while (temp.next != null) {
                    temp = temp.next; // while utilizado para recorrer la cola
                }
                temp.next = neo; // asignacion del ultimo elemento
            }

            size++; // incrementamos tamaño de la pila
            return true; // retornamos que no hubo fracaso en la insercion

        } catch (Exception e) {
            System.out.println("False");
            return false;
        }

        

    }

    @Override
    public Object dequeue() { // metodo utilizado para elimnar elementos de la lista
        Object element = null;
        try {
            element = head.getData(); // asignacion del elemento a retornar
            head = head.next; // perdemos referencia del primer elemento
                              // ya que fue guardado para poder retornarlo


        } catch (Exception e) {
            return null;
        }
        size--; // disminuimos el tamaño de la cola
        return element; // retornamos el elemento
    }

    public int Size() { // elemento para acceder al tamaño de la cola
        return size;
    }

    @Override
    public Object peek() { // metoodo para poder mostrar el primer elemento de la cola
        try {
            return head.getData(); // retornamos la cabeza ya que es siempre el primer elemnento dentro de la cola
        } catch (Exception e) {
            return null; // en caso de que la cola este vacia se retorna null
        }

    }
    
}
