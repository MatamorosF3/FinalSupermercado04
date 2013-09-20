/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

import java.util.Scanner;

/**
 *
 * @author Francisco Matamoros & Swammy Jose
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



        Supermercado supermercado = new Supermercado();
        TDAList id1 = new LinkedList();
        Scanner c;
        c = new Scanner(System.in);
        String nombre;
        String apellido;
        String id;

        String vEdad;
        menu();
        int op = c.nextInt();
        boolean f = false;
        while (op != 0) {

            // Ingreso de clientes
            if (op == 1) {
                //Solicito datos cliente
                System.out.println("Ingrese su nombre:");
                c = new Scanner(System.in);
                nombre = c.nextLine();
                System.out.println("Ingrese su apellido");
                c = new Scanner(System.in);
                apellido = c.nextLine();
                do {
                    System.out.println("Ingrese su ID");
                    c = new Scanner(System.in);
                    id = c.nextLine();

                    if (id1.indexOf(id) != -1) {
                        f = true;

                    } else {
                        f = false;
                        id1.insert(id, id1.size);
                    }
                    if (f) {
                        System.out.println("Id ya ha sido ingresado");
                    }
                } while (f);


                do {

                    System.out.println("Ingrese edad");
                    c = new Scanner(System.in);
                    vEdad = c.nextLine();
                    for (int i = 0; i < vEdad.length(); i++) {
                        if (!Character.isDigit(vEdad.charAt(i))) {
                            f = true;
                            break;
                        } else {
                            f = false;
                        }
                    }
                    if (f) {
                        System.out.println("Edad incorrecta");
                    }
                } while (f);

                Cliente cliente = new Cliente(nombre, apellido, id, Integer.parseInt(vEdad));

                System.out.println("Es Socio? [1]Si [2]No");
                int esSocio = c.nextInt();
                if (esSocio == 1) {
                    cliente.setEsSocio(true);
                } else {
                    cliente.setEsSocio(false);
                }

                /*
                 * Generamos productos aleatorios
                 */
                int cantProd = random(1, 20);
                for (int i = 1; i <= cantProd; i++) {
                    String codigo = "COD" + i;
                    int precio = random(100, 2500);
                    int cantidad = random(1, 10);

                    //forma en la que ingresamos un producto al carro del cliente
                    Producto producto = new Producto(codigo, precio, cantidad);
                    cliente.ingresarProducto(producto); // llamamos al metodo ingresarProducto
                    System.out.println(producto.getInfo()); // mostramos informacion de los productos
                }
                System.out.println(supermercado.buscarCaja(cliente)); //buscamos una caja para el cliente
            }
            if (op == 2) {
                System.out.println(supermercado.atenderClientes()); // antendemos al cliente
            }
            if (op == 3) {
                System.out.println(supermercado.imprimirReportes()); // generamos reportes
            }
            menu(); // llamos al menu creado
            op = c.nextInt();
        }

    }

    public static int random(int a, int b) { // metodo random
        return (int) (Math.random() * b) + a;
    }

    public static void menu() { // menu a mostrar al ejecutar el programa
        System.out.println("\n");
        System.out.println("[1] Ingreso Cliente");
        System.out.println("[2] Atención de Caja");
        System.out.println("[3] Reportes");
        System.out.println("[0] Salir");
    }
}
