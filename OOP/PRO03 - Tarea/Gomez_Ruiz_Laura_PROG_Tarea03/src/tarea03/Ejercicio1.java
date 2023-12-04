package tarea03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import tarea03.CartonBingo;
import java.time.temporal.ChronoUnit;
import java.lang.Math;

/**
 * Ejercicio 1: Creación y uso de cartones de bingo. <br>
 * En este ejercicio probamos el funcionamiento de la clase CartonBingo tratando de conocer los métodos que tiene y el funcionamiento de cada uno de ellos
 *
 * @author [Laura Gómez Ruiz]
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        // 1. Presentación del ejercicio
        System.out.println("Ejercicio 1. Creación y uso de cartones de bingo");
        System.out.println("------------------------------------------------");
        LocalDate fechaActual = LocalDate.now(); // Con el método now() obtenemos la fecha actual de nuestro sistema
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu"); // Con el método ofPattern establecemos el formato que deseamos para la fecha, usando letras de patrón reservadas
        String text = fechaActual.format(formatter); // Asociamos el patrón a la fecha actual
        System.out.println("Fecha ACTUAL de ejecución: " + text);
             
        /* 
            Debes mostrar la fecha ACTUAL (hoy) usando la API de LocalDate
            (usa también DateTimeFormatter para formatear la fechala correctamente (ej. 08/11/2022)
        */
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // 2.- Declaración de tres variables referencia a objetos instancia de la clase CartonBingo
        CartonBingo maria, ada, juan;

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        /* 
            En este ejercicio no habrá entrada de datos como tal ya que los datos que se piden en el enunciado son fijos, 
            y son introducidos por el/la programador/a (no hay que pedir datos por teclado al usuario de la aplicación).
         */
        
        // 3.- Instanciación de objetos de la clase CartonBingo
        System.out.println();
        System.out.println("Creación de los cartones para cada uno de los personajes");
        System.out.println("--------------------------------------------------------");

        // 3.1.- Comprobación del lanzamiento de excepciones (se intentan crear cartones no válidos)     

        // 3.1.1.- Intento de creación de un cartón de bingo con fecha de sorteo de la semana pasada (hay gestionar la posible excepción)
                
        // Quitamos una semana a la fecha actual
        LocalDate semanaAnterior = fechaActual.minus(1, ChronoUnit.WEEKS);
        text = semanaAnterior.format(formatter); // Asociamos el patrón a la fecha actual
        System.out.println("Intentando crear un cartón para el sorteo celebrado hace una semana (" + text + ")");
        
        // Excepción
        try {
            maria = new CartonBingo(semanaAnterior);
        } catch (Exception ex) {
            System.out.println("¡ERROR! Fecha " + text + " no válida, no se puede crear un cartón para una fecha inválida o para un sorteo que ya ha pasado!!");
        }
        
        // 3.1.2.- Intento de creación de un cartón de bingo con una cantidad de números no válida (30 números)
        System.out.println();
        System.out.println("Intentando crear un cartón con 30 números (cantidad no válida)");
        
        // Excepción
        try {
            maria = new CartonBingo(30, "María", fechaActual);
        } catch (Exception ex) {
            System.out.println("¡ERROR! Cantidad de números no válida, no se puede crear un cartón con 30 números (debe tener un mínimo de 15 y un máximo de 21 números)");
        }

        // 3.2 Creación de cartones válidos
        System.out.println();
        System.out.println("Creamos ahora cartones válidos para nuestros tres jugadores...");
        System.out.println();

        // 3.2.1.- Creación de un cartón válido para María siguiendo las especificaciones del enunciado
        System.out.println("Creando un cartón de 18 números y fecha de sorteo del 5 de Marzo de 2023 para María:");
        LocalDate fechaSorteo = LocalDate.parse("2023-05-05");
        maria = new CartonBingo (18, "María", fechaSorteo);      
        System.out.println();
        
        // 3.2.2.- Creación de un cartón válido para Ada siguiendo las especificaciones del enunciado
        System.out.println("Creando un cartón para Ada, sin indicar nada más:");
        ada = new CartonBingo ("Ada");
        System.out.println();
        
        // 3.2.3.- Creación de un cartón válido para Juan siguiendo las especificaciones del enunciado
        System.out.println("Creando un cartón para Juan, utilizando los valores por defecto:");
        juan = new CartonBingo();        
        System.out.println();
        
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        /* 
            Dado que se va a ir mostrando información de salida a la vez que se van realizando operaciones, podemos considerar en este caso
            que el procesamiento y la salida de resultado van unidos y "mezclados" 
         */

        // 4.- Obtención de información de los cartones creados
        System.out.println("Obtención de información de los cartones creados");
        System.out.println("------------------------------------------------");
        
        // 4.1.- Total de cartones que se han creado hasta el momento        
        System.out.println("Total de cartones que se han creado: " + CartonBingo.getTotalCartones());
        
        // Identificador del cartón de María
        System.out.println("Identificador del cartón de María: " + maria.getIdCarton());
        
        // Cantidad de números que tiene el cartón de Ada.
        System.out.println("Cantidad de números que tiene el cartón de Ada: " + ada.getTotalNumerosCarton());
        
        // Fecha de sorteo del cartón de Juan.
        System.out.println("Fecha de sorteo del cartón de Juan (" + juan.getFechaSorteo() + ")");
        
        // Lista de números del cartón de Juan.
        System.out.println("Lista de números del cartón de Juan: " + juan.listadoNumerosPendientes());
        
        // Número de días que faltan para el sorteo en el que participará el cartón de María (observa que el número de días siempre se compara con la fecha actual, por lo que la salida que obtengas puede ser distinta a las salidas de ejemplo).
        System.out.println("Números de días que faltan hasta el sorteo en el que participa María: " + maria.diasHastaSorteo());
        
        // Total de cartones que participan en el sorteo de hoy.
        System.out.println("Cartones participan en el sorteo de hoy: " + CartonBingo.totalCartonesSorteo(fechaActual));
        
        // 5.- Realización de algunas operaciones con los cartones creados
        System.out.println("Realización de algunas operaciones con los cartones creados");
        System.out.println("-----------------------------------------------------------");
        
        // 5.1.- Marcar los números del 20 al 35 en los tres cartones
        
        System.out.println("Marcamos los números desde el 20 hasta el número 35 ambos incluidos en los tres cartones...");
        
        for (int i=20; i<=35; i++) {
            maria.marcarNumero(i);
        }
        
        for (int i=20; i<=35; i++) {
            ada.marcarNumero(i);
        }
        
        for (int i=20; i<=35; i++) {
            juan.marcarNumero(i);
        }

        // 5.2.- Mostrar los números que han podido marcar correctamente en cada uno de los cartones
        System.out.println("De los números anteriores, mostramos la lista de números que sí se han podido marcar en cada uno de los tres cartones...");
        System.out.println("En el cartón de María estaban los números: " + maria.listadoNumerosMarcados());
        System.out.println("En el cartón de Ada estaban los números: " + ada.listadoNumerosMarcados());
        System.out.println("En el cartón de Juan estaban los números: " + juan.listadoNumerosMarcados());
        System.out.println();
        
        // 5.3.- Indica de los tres cartones, a cuál de ellos le quedan menos números        
        System.out.print("Al jugador/a que le quedan menos números pendientes de marcar en su cartón es... ");
        if (maria.getCantidadNumerosPendientes() < ada.getCantidadNumerosPendientes()) {
            if (maria.getCantidadNumerosPendientes() < juan.getCantidadNumerosPendientes()) {
                System.out.println("María, que le quedan " + maria.getCantidadNumerosPendientes() + " números por marcar");
            } else {
                System.out.println("Juan, que le quedan " + juan.getCantidadNumerosPendientes() + " números por marcar");
            }
        } else {
            if (ada.getCantidadNumerosPendientes() < juan.getCantidadNumerosPendientes()) {
                System.out.println("Ada, que le quedan " + ada.getCantidadNumerosPendientes() + " números por marcar");
            } else {
                System.out.println("Juan, que le quedan " + juan.getCantidadNumerosPendientes() + " números por marcar");
            }
        }
        
        // 6.- Muestra el estado final de los cartones
        System.out.println("Estado final de todos los cartones");
        System.out.println("----------------------------------");
        System.out.println();
        
        System.out.println(maria.toString());
        System.out.println(ada.toString());
        System.out.println(juan.toString());
                
        System.out.println();
        System.out.println("El programa ha finalizado!!");
        System.out.println();

    }
}
