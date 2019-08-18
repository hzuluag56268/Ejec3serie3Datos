/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarray;

import java.util.Scanner;

/**
 *
 * @author Olga Lucia
 */
public class Array {

    private int cantidad;
    private int[] lista;
    private int[] listaDos;
    private int[] listaRepetida;
    private int cantidadDos;
    private int cantidadRepetidos;
   
    public Array(int cantidad, int cantidadDos) {
        this.cantidad = cantidad;
        this.cantidadDos = cantidadDos;
        cantidadRepetidos = 0;
        
        
    }

    public void pedirDatos() {
        Scanner teclado = new Scanner(System.in);
        lista = new int[cantidad];
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Ingrese el valor numero " + (i + 1) + " de la primera lista ---:  ");
            lista[i] = teclado.nextInt();
        }
    }

    public void mostrarDatos() {
        System.out.println("");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(" [ " + lista[i] + " ] ");
        }

    }

    public void pedirDatosSegundo() {
        Scanner teclado = new Scanner(System.in);
        listaDos = new int[cantidadDos];
        for (int i = 0; i < listaDos.length; i++) {
            System.out.print("Ingrese el valor numero " + (i + 1) + " de la segunda lista ---:  ");
            listaDos[i] = teclado.nextInt();
            
        }
    }

    public void mostrarDatosSegundo() {
        System.out.println("");
        for (int i = 0; i < listaDos.length; i++) {
            System.out.print(" [ " + listaDos[i] + " ] ");
        }

    }

    public void cantidadRepetidos() {
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < listaDos.length; j++) {
                if (lista[i] == listaDos[j]) {
                    cantidadRepetidos++;
                }
            }
        }
    }

    public void listaRepetidaReal() {
    System.out.println("");
    listaRepetida = new int[cantidadRepetidos];
    int p = 0;
        System.out.println("La siguiente lista muesta los datos repetidos");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < listaDos.length; j++) {
                if (lista[i] == listaDos[j]){
                    listaRepetida[p] = lista[i];
                     System.out.print(" [ " + listaRepetida[p] + " ] ");
                     p++;
                }
                    

            }
        }
    }


    
}
