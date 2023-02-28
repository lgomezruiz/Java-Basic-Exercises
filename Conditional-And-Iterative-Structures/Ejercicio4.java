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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        SUMA DE NÚMEROS
        Escribe un programa en Java que calcule la suma de varios números reales 
        no negativos introducidos por teclado.
        El proceso debe terminar cuando se introduzca un número negativo por teclado, 
        mostrando en ese momento la suma de los números previos e indicando cuántos 
        números se han sumado. En caso de que el primer número introducido por teclado 
        sea un número negativo, la suma será 0.
        */
        
        //Variables de entrada
        double numero, suma=0;
        int contador=0;
        
        // Clase Scanner
        Scanner teclado = new Scanner (System.in);
        
        /*******
        ENTRADAS
        *******/
        System.out.println("SUMA DE NÚMEROS INTRODUCIDOS POR TECLADO");
        System.out.println("----------------------------------------");
        
        do {
            System.out.println("Introduce un número real no negativo: ");
            numero = teclado.nextDouble();
            if (numero>=0) {
                contador++;
                suma = suma + numero;
            }
            else {
                System.err.println("ERROR: Se ha introducido un número negativo.");
            }
        }
        while (numero>=0);
        
        /*****
        SALIDA
        *****/
        System.out.println("Se han leído " + contador + " enteros no negativos.");
        System.out.println("Su suma es: " + suma);
    }
    
}
