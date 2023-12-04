package tarea03;

import java.time.DayOfWeek;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Ejercicio 3: Vamos al cine.<br>
 * En este ejercicio trabajaremos con objetos de tipo fecha y de tipo hora a través de las clases LocalDate y LocalTime respectivamente.
 *
 * @author [Laura Gómez Ruiz]
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println("\nEjercicio 3. ¡Vamos al cine!");
        System.out.println("----------------------------");

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        final int HORA_PRIMERA = 17;
        final int MINUTO_PRIMERA = 00; 
        final int SUPLEMENTO_ULTIMA_SESION = 1; // +1€ en la última sesión del día
        final int DURACION_SESION = 150; // 150 minutos, 2h30
        final double PRECIO_BASE = 4.5; // 4,5€ el precio base
        final double DESCUENTO_DIAS_ESPECTADOR = 0.50; //50% de descuento
        
        // Variables de entrada
        String fechaIntroducida;
        int hora, minuto;
        
        // Variables auxiliares
        Scanner teclado = new Scanner (System.in);
        LocalDate fechaEntrada, fechaActual = LocalDate.now();
        boolean fechaValida = false, esDiaEspectador = false, horaValida = false, minutoValido = false;
        LocalTime primeraSesion, horaEntrada;
        boolean haySesion = true; // hay sesión para la hora que indica el usuario
        
        // Variables de salida
        String mensajeFinal = "";
        double precioFinalEntrada;
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------

        // 1.- Lectura por teclado de la fecha para la que se quiere reservar (mínimo con una semana de antelación)
        /* Se deberán cumplir los requisitos del enunciado y determinará si es uno de los Días del Espectador */
        
        System.out.println("Introduce una fecha para la que quieres comprar la entrada (dd/mm/yyyy):");
        System.out.println("----------------------------------------------------------");
        do {
            // Solicitud de la fecha
            fechaIntroducida = teclado.nextLine();
            // Comprobación del formato correcto
            try {
                fechaEntrada = LocalDate.parse(fechaIntroducida, formatter);
                // Comprobación de que la fecha de entrada es anterior a una semana
                if (fechaEntrada.isAfter(fechaActual.plusDays(7))) {
                    fechaValida = true;
                    // Verificación del Día del Espectador
                    if (fechaEntrada.getDayOfWeek() == DayOfWeek.MONDAY || fechaEntrada.getDayOfWeek() == DayOfWeek.THURSDAY) {
                        esDiaEspectador = true;
                    }
                }
                else {
                    System.err.println("¡ERROR!: No se permiten reservas con menos de una semana de antelación.");
                }
            }
            catch (DateTimeParseException e) {
                System.err.println("¡ERROR!: La fecha introducida NO es válida. Utiliza el formato sugerido.");
            } 
        }
        while (!fechaValida);

        // 2. Lectura por teclado y comprobación de hora y minuto (cumpliendo los requisitos del enunciado)

        // Solicitud de la hora
        do {
            System.out.println("Introduce una hora (00-23): ");
            hora = teclado.nextInt();
            try {
                if (hora >= 0 && hora < 23) {
                    horaValida = true;
                }
                else {
                    System.err.println("¡ERROR! La hora introducida no cumple el formato exigido.");
                }
            }
            catch (InputMismatchException ex) {
                System.err.println("¡ERROR! No se ha introducido un número válido.");
            }
        }
        while (!horaValida);
        
        // Solicitud de los minutos
        do {
            System.out.println("Introduce los minutos (00-59): ");
            minuto = teclado.nextInt();
            try {
                if (minuto >= 0 && minuto < 59) {
                    minutoValido = true;
                }
                else {
                    System.err.println("¡ERROR! Los minutos introducidos no cumplen el formato exigido.");
                }
            }
            catch (InputMismatchException ex) {
                System.err.println("¡ERROR! No se ha introducido un número válido.");
            }
        }
        while (!minutoValido);

        // 3. Creación de los objetos LocalTime de referencia:
        
        // Creación de un objeto LocalTime de referencia para almacenar la hora de la primera sesión de cine (17:00)
        primeraSesion = LocalTime.of(HORA_PRIMERA, MINUTO_PRIMERA);

        // Creación de objeto LocalTime con la hora indicada a partir de los datos (hora y minuto) leídos por teclado
        horaEntrada = LocalTime.of(hora, minuto);

        //----------------------------------------------
        //               Procesamiento 
        //----------------------------------------------
        
        // 4. Obtener la siguiente sesión (y su precio) a la que el usuario puede entrar según la hora que ha indicado
        if (horaEntrada.isBefore(primeraSesion.plusMinutes(1))) { // Antes de la primera sesión
            mensajeFinal += String.format ("\nA la hora indicada faltarían %s minutos para el inicio de la primera sesión", horaEntrada.until(primeraSesion, ChronoUnit.MINUTES));
            precioFinalEntrada = PRECIO_BASE * ((esDiaEspectador)? DESCUENTO_DIAS_ESPECTADOR: 1);
            mensajeFinal += String.format ("\nEl precio de una entrada para esta sesión es de %.2f€", precioFinalEntrada);
            
        } 
        else if (horaEntrada.isBefore(primeraSesion.plusMinutes(1+DURACION_SESION))) { // entre la primera y la segunda sesión (antes de las 19:30)
            mensajeFinal += String.format ("\nA la hora indicada faltarían %s minutos para el inicio de la sesión de las 19:30", horaEntrada.until(primeraSesion.plusMinutes(DURACION_SESION), ChronoUnit.MINUTES));
            precioFinalEntrada = PRECIO_BASE * ((esDiaEspectador)? DESCUENTO_DIAS_ESPECTADOR: 1);
            mensajeFinal += String.format ("\nEl precio de una entrada para esta sesión es de %.2f€", precioFinalEntrada);
            
        } else if (horaEntrada.isBefore(primeraSesion.plusMinutes(1+DURACION_SESION*2) )) { // entre la segunda y la última sesión (antes de las 22:00)
            mensajeFinal += String.format ("\nA la hora indicada faltarían %s minutos para el inicio de la sesión de las 22:00", horaEntrada.until(primeraSesion.plusMinutes(DURACION_SESION*2), ChronoUnit.MINUTES));
            precioFinalEntrada = (PRECIO_BASE+SUPLEMENTO_ULTIMA_SESION) * ((esDiaEspectador)? DESCUENTO_DIAS_ESPECTADOR: 1);
            mensajeFinal += String.format ("\nEl precio de una entrada para esta sesión es de %.2f€", precioFinalEntrada);
            
        } else {  // Después que haya comenzado la última sesión
            mensajeFinal = String.format ("\nLa última sesión de este día comienza %s minutos ANTES de la hora indicada", primeraSesion.plusMinutes(DURACION_SESION*2).until(horaEntrada, ChronoUnit.MINUTES));
            mensajeFinal += String.format ("\nNo hay más sesiones después de esta");
            haySesion = false;
        }
        
        mensajeFinal += ((esDiaEspectador && haySesion)? "\nNota: se aplica un descuento del " + DESCUENTO_DIAS_ESPECTADOR*100 + "% por ser Día del Espectador": "");

        //----------------------------------------------
        //            Salida de resultados 
        //----------------------------------------------
        // 5. Mostrar por pantalla los resultados obtenidos según el procesamiento realizado.
        System.out.println(mensajeFinal);

    }
}
