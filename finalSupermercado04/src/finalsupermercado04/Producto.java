/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

/**
 *
 * @author Francisco Matamoros
 */
public class Producto {
        private String codigo; // codigo del producto
        private int precio; // precio del producto
        private int cantidad; // cantidad del producto

    public Producto(String codigo, int precio, int cantidad) { // constructor con parametros del producto
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() { // metodo para obtener el codigo
        return codigo;
    }

    public void setCodigo(String codigo) { // metodo set para cambiar el codigo
        this.codigo = codigo;
    }

    public int getPrecio() { // metodo para obtener el precio
        return precio;
    }

    public void setPrecio(int precio) { // metodo para cambiar el precio
        this.precio = precio;
    }

    public int getCantidad() { // metodo para obtener la cantidad 
        return cantidad;
    }

    public void setCantidad(int cantidad) { // metodo para cambiar la cantidad
        this.cantidad = cantidad;
    }
      public String getInfo() { // metodo utilizado para obtener la informacion del producto
        return this.codigo + " [$" + this.precio + "] " + this.cantidad + " unidades";
    }
      
    @Override
    public String toString() { // metodo toString, mensaje el cual se mostrara cuando mandemos a imprimir un producto
        return "Producto{" + "codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

}
