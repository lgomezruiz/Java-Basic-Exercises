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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        ÍNDICE DE MASA CORPORAL
        El índice de masa corporal (IMC) se define como el peso en kilogramos 
        dividido por el cuadrado de la altura en metros.
        Escribe un programa en Java que calcule el índice de masa corporal (IMC) 
        de una persona e indique el estado en el que se encuentra esa persona en función del valor de IMC.
        */
        
        // Variables de entrada
        double imc, peso, altura;
        String diagnostico;
        
        // Clase Scanner
        Scanner teclado = new Scanner (System.in);
        
        /***************
        ENTRADA DE DATOS
        ***************/
        System.out.println("CÁLCULO DEL ÍNDICE DE MASA CORPORAL (IMC)");
        System.out.println("-----------------------------------------");
        
        // Lectura por pantalla del peso y la altura
        System.out.println("Introduce el peso (Kg): ");
        peso = teclado.nextDouble();
        System.out.println("Introduce la altura (cm): ");
        altura = teclado.nextDouble()/100;
        
        /************
        PROCESAMIENTO
        ************/
        // Fórmula y cálculo del IMC
        imc = peso/(Math.pow(altura, 2));
        
        // Elección del tipo de diagnóstico
        if (imc < 16){
            diagnostico = "Criterio de ingreso en hospital.";   
        }
        else if (imc < 17){
            diagnostico = "Infrapeso.";   
        }
        else if (imc < 18){
            diagnostico = "Bajo peso.";   
        }
        else if (imc < 25){
            diagnostico = "Peso normal (saludable).";   
        }
        else if (imc < 30){
            diagnostico = "Sobrepeso (obesidad de grado I).";   
        }
        else if (imc < 35){
            diagnostico = "Sobrepeso crónico (obesidad de grado II.";   
        }
        else if (imc < 40){
            diagnostico = "Obesidad premórbida (obesidad de grado III).";   
        }
        else {
            diagnostico = "Obesidad mórbida (obesidad de grado IV)";
        }
        
        /*****
        SALIDA
        *****/
        System.out.println("Para un peso de " + peso + " kilogramos y una altura de " + altura + " metros:");
        System.out.println("El índice de masa corporal es de: " + imc);
        System.out.println(diagnostico);
        
    }
    
}
