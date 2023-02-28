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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        MENÚ DE OPCIONES
        Escribe un programa en Java que permita elegir entre dibujar una recta, 
        un punto o un rectángulo, o bien terminar sin hacer nada.
        Para ello, debe mostrarnos un menú en el que nos proporcione las opciones disponibles, 
        y cuya salida sea simplemente escribir por pantalla cuál ha sido la opción elegida.
        */
        
        //Variables de entrada
        int opcion;
        String opcionElegida="";
        boolean opcionValida= true;
        
        //Clase Scanner
        Scanner teclado = new Scanner (System.in);
        
        /******
        ENTRADA
        ******/
        System.out.println("DIBUJO DE FIGURAS");
        System.out.println("-----------------");
        System.out.println("1. Dibujar Punto.");
        System.out.println("2. Dibujar Recta.");
        System.out.println("3. Dibujar Rectángulo");
        System.out.println("0. Terminar y salir");
        System.out.println("Introduce una opción de dibujo: ");
        opcion = teclado.nextInt();
        
        /************
        PROCESAMIENTO
        ************/
        switch (opcion) {
            case 1:
                opcionElegida = "Dibujar Punto.";
                break;
            case 2:
                opcionElegida = "Dibujar Recta.";
                break;
            case 3:
                opcionElegida = "Dibujar Rectángulo.";
                break;
            case 0:
                opcionElegida = "Terminar y salir.";
                break;
            default:
                System.err.println("ERROR: Se ha introducido una opción no válida.");
                opcionValida = false;
        }
        
        /*****
        SALIDA
        *****/
        if (opcionValida) {
            System.out.println("Se ha elegido " + opcionElegida);
        }

    }
    
}
