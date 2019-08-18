
import java.util.Scanner;
import pruebaarray.Array;


public class PruebaArray {

    public static void main(String[] args) {

        
      int cantidad, cantidadDos;
        
       Scanner teclado = new Scanner(System.in);
      
        System.out.println(" cuantos elementos va a ingresar en la primera lista : ");
        cantidad = teclado.nextInt();
        
                
        System.out.println(" cuantos elementos va a ingresar en la segunda lista : ");
        cantidadDos = teclado.nextInt();
        
        Array array = new Array(cantidad, cantidadDos);
        array.pedirDatos();
        array.pedirDatosSegundo();
        array.mostrarDatos();
        array.mostrarDatosSegundo();
        array.cantidadRepetidos();
        array.listaRepetidaReal();
    }
    
}
