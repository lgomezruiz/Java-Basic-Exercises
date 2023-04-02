package tarea03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import tarea03.CartonBingo;
import tarea03.Bombo;
import java.util.Scanner;

/**
 * Ejercicio 2: ¡A jugar! Utilización de las clases CartonBingo y Bombo para simular una partida.<br>
 * En este ejercicio probamos el funcionamiento de la clase Bombo tratando de conocer los métodos que tiene y el funcionamiento de cada uno de ellos.
 * 
 * @author [Laura Gómez Ruiz]
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
    
        // 1.- Presentación del ejercicio
        System.out.println("Ejercicio 2. ¡A jugar!");
        System.out.println("----------------------");
        LocalDate fechaActual = LocalDate.now(); // Con el método now() obtenemos la fecha actual de nuestro sistema
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu"); // Con el método ofPattern establecemos el formato que deseamos para la fecha, usando letras de patrón reservadas
        String text = fechaActual.format(formatter); // Asociamos el patrón a la fecha actual
        System.out.println("Fecha ACTUAL de ejecución: " + text);
        System.out.println();
        /* 
            Debes mostrar la fecha ACTUAL (hoy) usando la API de LocalDate
            (usa también DateTimeFormatter para formatear la fechala correctamente (ej. 08/11/2022)
        */        

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        final int NUMEROS_CARTON = 15;
        
        // Variables de entrada
        String nombre1, nombre2;
        
        // Variables auxiliares
        CartonBingo cartonJugador1, cartonJugador2;
        int bola;
        boolean lineaValida = false, bingoValido = false;
        Scanner teclado = new Scanner (System.in);
        
        //----------------------------------------------
        //          Entrada de datos
        //----------------------------------------------
        
        System.out.println("\nIntroduce el nombre del/la primer/a jugador/a:");
        nombre1 = teclado.nextLine();
        System.out.println("\nIntroduce el nombre del/la segundo/a jugador/a:");
        nombre2 = teclado.nextLine();   
        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        
        // 2.- Creación de los cartones para los jugadores
        System.out.println("\nCreando el cartón de " + nombre1 + " con " + NUMEROS_CARTON + " números para el sorteo de hoy...");
        cartonJugador1 = new CartonBingo (NUMEROS_CARTON, nombre1, fechaActual);
        System.out.println(cartonJugador1);

        System.out.println("\nCreando el cartón de " + nombre2 + " con " + NUMEROS_CARTON + " números para el sorteo de hoy...");
        cartonJugador2 = new CartonBingo (NUMEROS_CARTON, nombre2, fechaActual);
        System.out.println(cartonJugador2);
        
        // 3.- Creación del bombo para el sorteo de hoy
        System.out.println("\nCreando el bombo para el sorteo de hoy...");
        Bombo bombo = new Bombo (fechaActual);
        
        // 4.- Comienza el juego. Jugamos para "Línea"
        System.out.println("\nComienza el juego, jugamos para ''Línea''...");

        do {
            bola = bombo.sacarBola();
            System.out.println( bombo.cantarNumero(bola) );
            
            cartonJugador1.marcarNumero(bola);
            cartonJugador2.marcarNumero(bola);
            
            if(cartonJugador1.cantarLinea() && lineaValida == false)
            {
                System.out.println("\n***** " + cartonJugador1.getPropietario() +": LINEEEEAAA! *****\n" );
                System.out.println("Verificamos la línea cantada por " + cartonJugador1.getPropietario() +"...");
                
                lineaValida = bombo.verificarLinea(cartonJugador1);
                
                if(lineaValida) {
                    System.out.println(cartonJugador1);
                    System.out.println("La línea cantada por " + cartonJugador1.getPropietario() + " es VÁLIDA\n");
                }
                else               System.out.println("La línea cantada por " + cartonJugador1.getPropietario() + " NO es VÁLIDA");
            }
            if(cartonJugador2.cantarLinea() && lineaValida == false)
            {
                System.out.println("\n***** " + cartonJugador2.getPropietario() +": LINEEEEAAA! *****\n" );
                System.out.println("Verificamos la línea cantada por " + cartonJugador2.getPropietario() +"...");
                
                lineaValida = bombo.verificarLinea(cartonJugador2);
                
                if(lineaValida) {
                    System.out.println(cartonJugador2);
                    System.out.println("La línea cantada por " + cartonJugador2.getPropietario() + " es VÁLIDA\n");
                }
                else               System.out.println("La línea cantada por " + cartonJugador2.getPropietario() + " NO es VÁLIDA\n");
            }
            
        } while(!lineaValida);

        System.out.println("\n\nSeguimos para \"Bingo\"...");
        
        do {            
            bola = bombo.sacarBola();
            System.out.println( bombo.cantarNumero(bola) );
            
            cartonJugador1.marcarNumero(bola);
            cartonJugador2.marcarNumero(bola);
            
            if(cartonJugador1.cantarBingo() && bingoValido == false)
            {
                System.out.println("\n***** " + cartonJugador1.getPropietario() +": BIIIINGOOO! *****\n" );
                System.out.println("Verificamos el bingo cantado por " + cartonJugador1.getPropietario() +"...");
                
                bingoValido = bombo.verificarBingo(cartonJugador1);
                
                if(bingoValido) {
                    System.out.println(cartonJugador1);
                    System.out.println("El bingo cantado por " + cartonJugador1.getPropietario() + " es VÁLIDO");
                    System.out.println(cartonJugador1.getPropietario() +  " ha GANADO el juego!!\n");
                }
                else               System.out.println("El bingo cantado por " + cartonJugador1.getPropietario() + " NO es VÁLIDO");
            }
            
            if(cartonJugador2.cantarBingo() && bingoValido == false)
            {
                System.out.println("\n***** " + cartonJugador2.getPropietario() +": BIIIINGOOO! *****\n" );
                
                System.out.println("Verificamos el bingo cantado por " + cartonJugador2.getPropietario() +"...");
                
                bingoValido = bombo.verificarBingo(cartonJugador2);
                
                if(bingoValido) {
                    System.out.println(cartonJugador2);
                    System.out.println("El bingo cantado por " + cartonJugador2.getPropietario() + " es VÁLIDO");
                    System.out.println(cartonJugador2.getPropietario() +  " ha GANADO el juego!!\n");
                }
                else  System.out.println("La bingo cantado por " + cartonJugador2.getPropietario() + " NO es VÁLIDA");
            }
            
            
        } while(!bingoValido);

        System.out.println(bombo);

    }
}
