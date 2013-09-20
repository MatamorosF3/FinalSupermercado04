/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsupermercado04;

import java.util.Scanner;

/**
 *
 * @author Francisco Matamoros & Swammy
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
