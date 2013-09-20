package finalsupermercado04;

public class Supermercado {

    ADTQueue caja1;
    ADTQueue caja2;
    ADTQueue caja3;
    ADTQueue caja4;
    int cantidadClientesAtendidos;
    int totalVentas;
    int totalDescuentos;
    int totalRegalos;

    public Supermercado() {
        /*
         * creacion de las colas, las cuales vienen a ser
         * las cajas en que los clientes podran hacer atendidos.
         * Inicializamos las cuatro colas esperando a que un cliente
         * se ingrese.
         */
        this.caja1 = new Queue();
        this.caja2 = new Queue();
        this.caja3 = new Queue();
        this.caja4 = new Queue();

        this.cantidadClientesAtendidos = 0;
        this.totalDescuentos = 0;
        this.totalRegalos = 0;
        this.totalVentas = 0;
    }

    public String buscarCaja(Cliente cliente) { // metodo utilizado para asignar una cajera al cliente

        //Cuento la cantidad de productos en el carro
        int cantProd = cliente.getCanasta().size;

        //Cantidad Clientes por caja
        int ccc1 = this.caja1.size;
        int ccc2 = this.caja2.size;
        int ccc3 = this.caja3.size;
        int ccc4 = this.caja4.size;

        int caja = 0;
        if (cantProd <= 10) {
            /*
             * Cuando la cantidad de producto no es mucha
             */
            //Puedo ingresar a caja express
            caja = 1;
            if (ccc2 == 0) {
                caja = 2;
            }
            if (ccc3 == 0) {
                caja = 3;
            }
            if (ccc4 == 0) {
                caja = 4;
            }

        } else {
            //No puedo ingresar a caja express
            caja = 2;
            if (ccc3 <= ccc4 && ccc3 <= ccc2) {
                caja = 3;
            }
            if (ccc4 <= ccc2 && ccc4 <= ccc3) {
                caja = 4;
            }

        }

        /*
         * En esta parte es donde agregamos clientes
         * a las distintas colas creadas anteriormente
         */

        if (caja == 1) {
            this.caja1.queue(cliente);
        }
        if (caja == 2) {
            this.caja2.queue(cliente);
        }
        if (caja == 3) {
            this.caja3.queue(cliente);
        }
        if (caja == 4) {
            this.caja4.queue(cliente);
        }

        return "El cliente ingresó a la caja " + caja; // mostramos la caja en la que el cliente fue asignado
    }

    public String imprimirReportes() {
        String s = "";
        /*
         * Un pequeño reporte de todas las ventas,
         * descuentos y regalos realizados de las ventas
         */
        s += "\nTotal Ventas: $" + this.totalVentas;
        s += "\nTotal Descuentos: $" + this.totalDescuentos;
        s += "\nTotal Regalos: $" + this.totalRegalos;
        return s;
    }

    public int random(int a, int b) { // metodo que utilizamos para asignar caja a cliente
        return (int) (Math.random() * b) + a;
    }

    public String atenderClientes() { // metodo utilizado para poder atender al cliente
        int caja = random(1, 4);

        Cliente cliente = null;
        /*
         * En esta parte de los 4 ifs es cuando atendemos a los clientes
         */
        if (caja == 1) {
            cliente = (Cliente) this.caja1.dequeue();
        }
        if (caja == 2) {
            cliente = (Cliente) this.caja2.dequeue();
        };
        if (caja == 3) {
            cliente = (Cliente) this.caja3.dequeue();
        };
        if (caja == 4) {
            cliente = (Cliente) this.caja4.dequeue();
        };

        if (cliente == null) {
            return "Caja " + caja + " sin clientes.";
        }

        ADTStack carro = new Stack();
        carro = cliente.getCanasta(); // obtenemos la canasta del cliente, que en este caso seria el STACK
        int subTotal = 0;
        /*
         * En este while empezamos a sacar los productos comprados desde una pila
         * Recordemos que una pila utiliza ultimo en entrar primero en salir
         */
        while (!carro.isEmpty()) {
            Producto p = (Producto) carro.pop();
            int costo = p.getCantidad() * p.getPrecio(); // calculo de costo de la cantidad de un producto
            subTotal += costo;
        }

        int descuento = 0;
        if (cliente.isEsSocio()) { // verificamos si el cliente es socio
            descuento = 5; // asignacion de descuento de 5
        }

        int totalDescuento = subTotal * descuento / 100; // Calculamos el descuento aplicado
        int totalCompra = subTotal - totalDescuento; // calculamos el total de la compra

        this.cantidadClientesAtendidos++; // contador de la cantidad de clientes atendidos
        if (this.cantidadClientesAtendidos == 100) { // en este if se nos ocurrio regalarle la compra al cliente 
            this.cantidadClientesAtendidos = 0;
            this.totalRegalos += subTotal;
            return "FELICITACIONES CLIENTE 100, COMPRA GRATIS";
        }

        this.totalDescuentos += totalDescuento; // total de descuentos dados
        this.totalVentas += totalCompra; // total de ventas realizadas

        String s = "";
        s += "\nAtendiendo Caja " + caja; // numero de caja que el cliente fue atendido
        s += "\nSubTotal Compra: $" + subTotal; // subtotal del la compra realizado por el cliente
        s += "\nDescuento Socio: $" + totalDescuento; // descuento solamente en caso de que el cliente sea socio
        s += "\nTotal Compra: $" + totalCompra; // total de la compra

        return s;
    }
}
