/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Francisco Matamoros
 */
public class LinkedList extends TDAList {

    private DLLNode head;

    public LinkedList() {
        super();
        size = 0;
        head = null;
    }

    @Override
    public boolean insert(Object data, int pos) {

        try {
            if (pos < 0 || pos > size) {
                return false;
            }
            DLLNode neo = new DLLNode(data);
            if (head == null) {
                head = neo;
            } else {
                if (pos == 0) {
                    head.setPrev(neo);
                    neo.setNext(head);
                    head = neo;
                } else if (pos > 0 && pos < size) {
                    DLLNode temp = head;
                    for (int i = 1; i < pos; i++) {
                        temp = temp.getNext();
                    }
                    neo.setPrev(temp);
                    neo.setNext(temp.getNext());
                    temp.getNext().setPrev(neo);
                    temp.setNext(neo);

                } else {
                    DLLNode temp = head;
                    for (int i = 1; i < pos; i++) {
                        temp = temp.getNext();
                    }
                    temp.setNext(neo);
                    neo.setPrev(temp);

                }

            }

        } catch (Exception e) {
            return false;
        }
        size++;
        return true;
    }

    @Override
    public int indexOf(Object data) {
        DLLNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getData().equals(data)) {
                return i;
            }
            temp = temp.getNext();

        }
        return -1;
    }

    @Override
    public Object get(int index) {

        if (index < 0 || index >= size) {
            return null;
        }
        DLLNode tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.getNext();
        }
        return tmp.getData();

    }

    @Override
    public boolean erase(int pos) {
        if (pos < 0 || pos >= size) {
            return false; // Indicar fracaso en la operaci�n
        }
        DLLNode tmp;
        if (pos == 0) { // Desea Borrar la Cabeza
            // Desenlazar
            tmp = head.getNext();
            tmp.setPrev(null);
            head.setNext(null);
            head = null;
            // Actualizar head
            head = tmp;
        } else if (pos == size - 1) { // Desea Borrar el �ltimo
            // Recorrer hasta el final
            tmp = head;
            for (int i = 1; i < pos; i++) {
                tmp = tmp.getNext();
            }
            // Desenlazar
            DLLNode toErase = tmp.getNext();
            tmp.setNext(null);
            toErase.setPrev(null);
            // Liberar Memoria
            toErase = null;
        } else { // Desea Borrar de enmedio
            // Recorrer hasta el nodo anterior al que se desea borrar
            tmp = head;
            for (int i = 1; i < pos; i++) {
                tmp = tmp.getNext();
            }
            // Desenlazar
            DLLNode toErase = tmp.getNext();
            tmp.setNext(toErase.getNext());
            toErase.getNext().setPrev(tmp);
            toErase.setNext(null);
            toErase.setPrev(null);
            // Liberar Memoria
            toErase = null;
        }
        size--; // Disminuir Tama�o
        return true; // Indicar �xito

    }

    @Override
    public int next(int pos) {
        return pos + 1;
    }

    @Override
    public int prev(int pos) {
        return pos - 1;
    }

    @Override
    public void reset() {
        try {
            if (head.getData() != null) {
                head = null;
            }
        } catch (Exception e) {
        }
    }

    @Override
    public Object first() {
        try {
            return head.getData();
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public Object last() {
        DLLNode temp = head;
        try {
            if (size > 0) {
                while (temp.getNext() != null) {
                    temp = temp.getNext();
                }
            }
            return temp.getData();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getCapacity() {
        return -1;
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public Object prevN(int pos){
        DLLNode temp = head;
        
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
        }
        return temp.getPrev().getData();
    }

   
    
}
