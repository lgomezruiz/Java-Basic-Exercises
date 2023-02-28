/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro02;
import java.util.Scanner;

/**
 * 
 * @author Laura Gómez Ruiz
 */
public class PI16 {
    
    public static void main(String[] args) {
        /************************************************* 
            PíldorasInformaticas: 16. Condicionales I if-else
            Programa para saber si eres mayor de edad o no
        *************************************************/
        
        //Variables de entrada
        int edad;
        
        // Clase Scanner para entrada de datos
        Scanner teclado = new Scanner (System.in);
        
        /***************
        ENTRADA DE DATOS
        ***************/
        System.out.println("Introduce tu edad: ");
        edad = teclado.nextInt();
        
        /*********************
        PROCESAMIENTO + SALIDA
        *********************/        
        //Condicional if-else para saber la mayoría de edad o no
        if (edad >= 18) {
            System.out.println("Tienes " + edad + " años. Eres mayor de edad.");
        }
        else {
            System.out.println("Tienes " + edad + " años. Eres menor de edad.");
        }
              
    }
}
