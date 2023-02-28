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
public class PI21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /************************************************* 
            PíldorasInformaticas: 21. Bucles IV For
            Programa para comprobar si un email contiene una @
        *************************************************/
        
        // Variables de entrada
        String email;
        boolean arroba = false;
        
        // Clase Scanner
        Scanner teclado = new Scanner (System.in);
        
        /***************
        ENTRADA DE DATOS
        ***************/
        System.out.println("Introduce el email: ");
        email = teclado.nextLine();
        
        /************
        PROCESAMIENTO
        ************/
        
        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i)=='@') {
                arroba = true;
            }

        }
        
        if (arroba == true) {
                System.out.println("Este email contiene una arroba.");
        }
        else {
                System.out.println("Este email NO contiene una arroba.");
        }
    }
    
}
