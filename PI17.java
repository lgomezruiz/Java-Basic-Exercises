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
public class PI17 {
    
    public static void main(String[] args) {
        /************************************************* 
            PíldorasInformaticas: 17. Condicionales II Switch
            Programa para saber el área de un cuadrado, rectángulo, triángulo y círculo
        *************************************************/
        
        //Variables de entrada
        int figura;
        double area, lado, base, altura, radio;
        
        // Clase Scanner para entrada de datos
        Scanner teclado = new Scanner (System.in);
        
        /***************
        ENTRADA DE DATOS
        ***************/
        System.out.println("¿De qué figura geométrica quieres saber el área?: \n1: Cuadrado \n2: Rectágulo \n3. Triángulo \n4. Círculo");
        figura = teclado.nextInt();
        
        /*********************
        PROCESAMIENTO + SALIDA
        *********************/  
        switch (figura) {
            case 1:
                System.out.println("Introduce el lado: ");
                lado = teclado.nextDouble();
                area = Math.pow(lado, 2);
                System.out.println("El área del cuadrádo es: " + area);
                break;
            case 2:
                System.out.println("Introduce la altura: ");
                altura = teclado.nextDouble();
                System.out.println("Introduce la base: ");
                base = teclado.nextDouble();
                area = base*altura;
                System.out.println("El área del rectángulo es: " + area);
                break;
            case 3:
                System.out.println("Introduce la base: ");
                base = teclado.nextDouble();
                System.out.println("Introduce la altura: ");
                altura = teclado.nextDouble();
                area = (base*altura)/2;
                System.out.println("El área del rectángulo es: " + area);
                break;
            case 4:
                System.out.println("Introduce el radio: ");
                radio = teclado.nextDouble();
                area = Math.PI*Math.pow(radio, 2);
                System.out.print("El área del círculo es: "); //print a solas no hace un salto de línea
                System.out.printf("%1.2f", area); //Salida con formato; 1.2 = 2 decimales
                break;    
            default:
                System.out.println("La opción elegida no es correcta.");
        }    
    }
}
