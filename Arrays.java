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
public class Arrays {

    /**
     * @param args the command line arguments1111111
     */
    public static void main(String[] args) {
        
        /************ 
        STATIC ARRAY 
        ************/
        
        int staticArray [][] = new int [2][2];
        staticArray [0][0] = 5;
        staticArray [0][1] = 2;
        staticArray [1][0] = 2;
        staticArray [1][1] = 5;
        
        System.out.println("Static Array: ");
        System.out.print("[" + staticArray[0][0] + "]");
        System.out.println("[" + staticArray[0][1] + "]");
        System.out.print("[" + staticArray[1][0] + "]");
        System.out.print("[" + staticArray[1][1] + "]");
        System.out.println("");
        
        /************ 
        DINAMIC ARRAY 
        ************/
        int numColumns, numRows;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("How many colums has your array?");
        numColumns = keyboard.nextInt();
        System.out.println("How many rows has your array?");
        numRows = keyboard.nextInt();
        int dinamicArray [][] = new int [numRows][numColumns];
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print("Introduce the number at " + (i+1) + " row and " + (j+1) + " colum: ");
                dinamicArray[i][j] = keyboard.nextInt();
            }  
        }
        
        System.out.println("Our Dinamic Array: ");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print("[" + dinamicArray[i][j] + "]");
            }
            System.out.println("");
        }
        
        
    }
    
}
