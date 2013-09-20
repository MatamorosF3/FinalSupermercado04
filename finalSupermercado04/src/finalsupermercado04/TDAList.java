/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Francisco Matamoros
 */
public abstract class TDAList {
    protected int size;
    
   
    public abstract boolean insert(Object data, int pos);
    public abstract int indexOf(Object data);
    public abstract Object get(int pos);
    public abstract boolean erase(int pos);
    public abstract int prev(int pos);
    public abstract int next(int pos);
    public abstract void reset();
    public abstract Object first();
    public abstract Object last();
    public abstract boolean isEmpty();
    public abstract boolean isFull();
    public abstract int getCapacity();
    public abstract int getSize();
    public abstract Object prevN(int pos);
}
