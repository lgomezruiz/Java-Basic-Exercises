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
public class PI18 {
    
    public static void main(String[] args) {
        /************************************************* 
            PíldorasInformaticas: 18. Bucles I while
            Programa para acceder a una aplicación mediante una contraseña
        *************************************************/
        
        /***************
        ENTRADA DE DATOS
        ***************/
        
        // Clase Scanner para entrada de la contraseña
        Scanner teclado = new Scanner (System.in);
        
        // Variables de entrada
        String claveCorrecta = "Laura", claveUsuario = "";
        
        /************
        PROCESAMIENTO
        ************/
        
        while (claveUsuario.equals(claveCorrecta)==false) {
            System.out.println("Contraseña: ");
            claveUsuario = teclado.nextLine();
            if (claveCorrecta.equals(claveUsuario)) {
                System.out.println("Contraseña correcta. Acceso permitido.");
            }
            else {
                System.out.println("Contraseña incorrecta.");
            }
        }
        
    }
    
}
