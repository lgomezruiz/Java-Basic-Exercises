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
public class PI20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /************************************************* 
            PíldorasInformaticas: 20. Bucles III Do - While
            Programa para saber nuestro peso ideal en función del género y la altura
        *************************************************/
        
        // Variables de entrada
        int altura, peso = 0;
        String genero = "";
        
        // Clase Scanner
        Scanner teclado = new Scanner (System.in);
        
        /***************
        ENTRADA DE DATOS
        ***************/
        do {
            System.out.println("Introduce tu género (H/M): ");
            genero = teclado.nextLine();            
        }
        while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
        
        System.out.println("Introduce tu altura: ");
        altura = teclado.nextInt();
            
        /************
        PROCESAMIENTO
        ************/
        if (genero.equalsIgnoreCase("H")) {
            peso = altura - 110;
        }
        else if (genero.equalsIgnoreCase("M")) {
            peso = altura - 120;
        }
        
        System.out.println("Tu peso ideal es " + peso + " kg.");
        
    }
    
}
