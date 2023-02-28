/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pro02;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        INTERCAMBIO DE VARIABLES
        Escribe un programa en Java que lea dos valores reales a y b desde teclado 
        e intercambie esos valores de a y b si el contenido de a fuera mayor que 
        el de b. En caso contrario no se llevará a cabo el intercambio.
        */
        
        // Variables de entrada
        double a, b, auxiliar;
        
        // Clase Scanner
        Scanner teclado = new Scanner (System.in);
        
        /***************
        ENTRADA DE DATOS
        ***************/
        System.out.println("INTERCAMBIO DE VALORES");
        System.out.println("----------------------");
        
        // Lectura de los valores de las variables
        System.out.println("Introduce un valor real para la variable a: ");
        a = teclado.nextDouble();
        System.out.println("Introduce un valor real para la variable b: ");
        b = teclado.nextDouble();
        
        System.out.println("Inicialmente, los valores de las variables son: ");
        System.out.println("a = " + a + ", b = " + b + ".");
        
        /************
        PROCESAMIENTO
        ************/
        // Intercambio de valores
        if (a > b) {
            auxiliar = a;
            a = b;
            b = auxiliar;
        }
        
        /*****
        SALIDA
        *****/
        System.out.println("Tras el intercambio, los valores de las variables son: ");
        System.out.println("a = " + a + ", b = " + b + ".");
        
    }
    
}
