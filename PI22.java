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
public class PI22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /************************************************* 
            PíldorasInformaticas: 22. Bucles V For
            Programa para comprobar si un email contiene una o más de una @
        *************************************************/
        
        // Variables de entrada
        String email;
        int arroba = 0;
        boolean punto = false;
        
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
                arroba++;
            }
            
            if (email.charAt(i)=='.') {
                punto = true;
            }
        }
        
        if (arroba==1 && punto==true) {
                System.out.println("Este email es correcto.");
        }
        else {
                System.out.println("Este email NO es correcto.");
        }
    }
    
}
