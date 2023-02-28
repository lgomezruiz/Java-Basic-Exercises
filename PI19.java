/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pro02;
import java.util.Scanner;

/**
 *
 * @author Laura Gómez Ruiz
 */
public class PI19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /************************************************* 
            PíldorasInformaticas: 19. Bucles II while
            Programa para adivinar un número aleatorio
        *************************************************/
        
        // Variables de entrada
        int numero = 0, aleatorio = 0, intentos = 0;
        
        // Clase Scanner
        Scanner teclado = new Scanner (System.in);
        
        /***************
        ENTRADA DE DATOS
        ***************/
        
        // Generación del número aleatorio
        aleatorio = (int)(Math.random()*100); // El método random de la Clase Math es un método estático y no se necesita crear un objeto para usarlo
        
        /************
        PROCESAMIENTO
        ************/
        
        // Bucle while para recorrer los números del 0 al 100
        while (numero != aleatorio) {          
            intentos++;
            System.out.println("Introduce un número (0 - 100): ");
            numero = teclado.nextInt();            
            if (numero > aleatorio) {
                System.out.println("Más bajo.");
            }
            else {
                System.out.println("Más alto.");
            }            
        }
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
    }    
}
