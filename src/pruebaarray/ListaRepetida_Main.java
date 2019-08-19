
import java.util.Scanner;
import pruebaarray.ListaRepetida_metodos;


public class ListaRepetida_Main {

    public static void main(String[] args) {

        
      int cantidad, cantidadDos;
        
       Scanner teclado = new Scanner(System.in);
      
        System.out.println(" cuantos elementos va a ingresar en la primera lista : ");
        cantidad = teclado.nextInt();
        
                
        System.out.println(" cuantos elementos va a ingresar en la segunda lista : ");
        cantidadDos = teclado.nextInt();
        
        ListaRepetida_metodos array = new ListaRepetida_metodos(cantidad, cantidadDos);
        array.pedirDatos();
        array.pedirDatosSegundo();
        array.mostrarDatos();
        array.mostrarDatosSegundo();
        array.cantidadRepetidos();
        array.listaRepetidaReal();
    }   
    
}
