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
}
