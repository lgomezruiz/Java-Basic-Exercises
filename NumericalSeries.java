/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numericalseries;

/**
 *
 * @author Laura Gómez Ruiz
 */
public class NumericalSeries {

    /**
     * @param args the command line arguments
     */
    
    /*
    Make the following series of numbers using the repeating structures: 
    for, while and do-while
    · 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    · 1, 99, 2, 98, 3, 97, 4, 96, 5, 95
    · 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    */
    
    public static void main(String[] args) {
        
        int i=0;
        
        /**********
        FIRST SERIE
        **********/
        System.out.println("First Serie with For: ");
        for (i=1; i<=10; i++) {
            if (i<10){
                System.out.print(i + ", ");
            }
            else {
                System.out.print(i);
            }
        }
        System.out.println("");
        
        i=1;
        System.out.println("First Serie with While: ");
        while (i<=10){
            if (i<10){
                System.out.print(i + ", ");
            }
            else {
                System.out.print(i);
            }
            i++;
        }
        System.out.println("");
        
        i=1;
        System.out.println("First Serie with Do-While: ");
        do {
           if (i<10){
                System.out.print(i + ", ");
            }
            else {
                System.out.print(i);
            }
            i++; 
        }
        while (i<=10);
        
        System.out.println("");
        System.out.println("----------------------------------");
        
        /***********
        SECOND SERIE
        ***********/
        
        i= 1;
        int j = 99;
        
        System.out.println("Second Serie with For: ");
        for (i=1; i<=5; i++) {
            if (i<5) {
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            }
            else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            j--;
        }
        System.out.println("");
        
        i=1;
        j=99;
        System.out.println("Second Serie with While: ");
        while (i<=5){
            if (i<5) {
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            }
            else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            i++;
            j--;
        }
        System.out.println("");
        
        i=1;
        j=99;
        System.out.println("Second Serie with Do-While: ");
        do {
           if (i<5) {
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            }
            else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            i++;
            j--;
        }
        while (i<=5);
        
        System.out.println("");
        System.out.println("----------------------------------");
        
        /**********************
        THIRD SERIE - Fibonacci
        **********************/
        
        i=1; //Counter
        int a=0, b=1, suma=0;
        System.out.println("Third Serie with For: ");
        for (i=1; i<=8; i++) {
            if (i==1) {
                System.out.print(a + ", ");
                System.out.print(b + ", ");
                suma = a+b;
                System.out.print(suma + ", ");
                a=b;
                b=suma;
            }
            else if (i>1 && i<8) {
                suma = a+b;
                System.out.print(suma + ", ");
                a=b;
                b=suma;
            }
            else {
                suma = a+b;
                System.out.print(suma);
            }
        }
        System.out.println("");
        
        i=1; a=0; b=1;
        System.out.println("Second Serie with While: ");
        while (i<=8){
            if (i==1) {
                System.out.print(a + ", ");
                System.out.print(b + ", ");
                suma = a+b;
                System.out.print(suma + ", ");
                a=b;
                b=suma;
            }
            else if (i>1 && i<8) {
                suma = a+b;
                System.out.print(suma + ", ");
                a=b;
                b=suma;
            }
            else {
                suma = a+b;
                System.out.print(suma);
            }
            i++;
        }
        System.out.println("");
        
        i=1; a=0; b=1;
        System.out.println("Second Serie with Do-While: ");
        do {
           if (i==1) {
                System.out.print(a + ", ");
                System.out.print(b + ", ");
                suma = a+b;
                System.out.print(suma + ", ");
                a=b;
                b=suma;
            }
            else if (i>1 && i<8) {
                suma = a+b;
                System.out.print(suma + ", ");
                a=b;
                b=suma;
            }
            else {
                suma = a+b;
                System.out.print(suma);
            }
            i++;
        }
        while (i<=8);
        System.out.println("");
    }
    
}
