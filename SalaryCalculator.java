/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarycalculator;

import java.util.Scanner;
/**
 *
 * @author Laura Gómez Ruiz
 */

/*********************************************************************************************
EXERCISE:
A small grocery wants to calculate the salaries of its employees. Their positions can 
have 3 categories: 1-repositor, 2-cashier and 3-supervisor.
    a) Repositors earn $15,890 + a 10% bonus.
    b) ATMs charge a fixed $25,630.89.
    c) Supervisors earn $35,560.20 gross from which 11% retirement is discounted.
An application is needed that, depending on the type of employee in question, calculates and displays the corresponding salary on the screen.
**********************************************************************************************/
public class SalaryCalculator {


    public static void main(String[] args) {
        
        //Input Variables
        int num;
        
        //Auxiliary Variables
        Scanner keyboard = new Scanner (System.in);
        
        //Output Variables
        String typeJob = "";
        double salary = 0;
        
        //
        System.out.println("Enter the number that corresponds to your job position (1.Repositor, "
                + "2.Cashier, 3.Supervisor)");
        num = keyboard.nextInt();
        
        if (num == 1) {
            typeJob = "Repositor";
            salary = 15890 + (15890*0.1);
        }
        else if (num == 2) {
            typeJob = "Cashier";
            salary = 25630.89;
        }
        else if  (num == 3) {
            typeJob = "Supervisor";
            salary = 35560.20 - (35560.20*0.11);
        }
        else {
            System.out.println("The data entered is wrong.");
        }
        
        if (num == 1 || num == 2 || num == 3 ) {
            System.out.println("Your job is " + typeJob + ", so you get a salary of " + salary + "€");
        }
        
    }
    
}
