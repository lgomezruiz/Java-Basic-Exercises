/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexercises;

import java.util.Scanner;

/**
 *
 * @author Laura Gómez Ruiz
 */
public class Vectors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /************ 
        STATIC VECTOR 
        ************/
        
        int numbers [] = new int [5];
        numbers [0] = 5;
        numbers [1] = 220;
        numbers [2] = 8;
        numbers [3] = 458;
        numbers [4] = 22;
        
        System.out.println("Static Vector:");
        System.out.print("[" + numbers[0] + "]");
        System.out.print("[" + numbers[1] + "]");
        System.out.print("[" + numbers[2] + "]");
        System.out.print("[" + numbers[3] + "]");
        System.out.print("[" + numbers[4] + "]");
        System.out.println("");
        System.out.println("");
        /************* 
        DINAMIC VECTOR 
        *************/
        
        int vectorLength = 0;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("How many numbers do you want to introduce?");
        vectorLength = keyboard.nextInt();
        int dinamicVector [] = new int [vectorLength];
        System.out.println("Dinamic Vector:");
        for (int i = 0; i < dinamicVector.length; i++) {
            System.out.println("Introduce the number at " + i + " position: ");
            dinamicVector[i] = keyboard.nextInt();
        }
        System.out.print("Our Dinamic Vector: ");
        for (int i = 0; i < dinamicVector.length; i++) {
            System.out.print("[" + dinamicVector[i] + "]");
        }
    }
    
}
