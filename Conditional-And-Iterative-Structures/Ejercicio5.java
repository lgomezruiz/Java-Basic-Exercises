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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        PRODUCTO DE NÚMEROS
        Escribe un programa en Java que calcule el producto de varios números enteros 
        positivos introducidos por teclado.
        El proceso debe terminar cuando se introduzca un número negativo o cero por 
        teclado, mostrando en ese momento el producto de los números previos e indicando 
        cuántos números se han multiplicado. En caso de que el primer número introducido por teclado no sea positivo, el producto será 1.
        */
        
        // Variables de entrada
        int numero=1, producto=1, contador=0;
        
        // Clase Scanner
        Scanner teclado = new Scanner (System.in);
        
        /******
        ENTRADA
        ******/
        System.out.println("PRODUCTO DE NÚMEROS INTRODUCIDOS POR TECLADO");
        System.out.println("--------------------------------------------");
        
        while (numero>0) {
            System.out.println("Introduce un número entero positivo: ");
            numero = teclado.nextInt();
            if (numero>0) {
                contador++;
                producto *= numero;
            }
            else {
                System.err.println("ERROR: Ha introducido un número inválido.");
            }
        }
        
        /*****
        SALIDA
        *****/
        System.out.println("Se han leído " + contador + " enteros positivos");
        System.out.println("Su producto es: " + producto);
    }
    
}
