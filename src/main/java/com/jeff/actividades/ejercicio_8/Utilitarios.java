/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Utilitarios {
    
    public static Scanner input = new Scanner(System.in);
    public static void ingresarDatosTrabajadores(
            int[] codigos,
            int[] horasAusencia,
            int[] pupitresDefectuosos,
            int[] pupitresProducidos
    ) {
        for (int i = 0; i < codigos.length; i++) {
            System.out.println("\nTrabajador " + (i + 1));

            System.out.print("Ingrese el codigo del trabajador: ");
            codigos[i] = input.nextInt();

            System.out.print("Ingrese las horas de ausencia: ");
            horasAusencia[i] = input.nextInt();

            System.out.print("Ingrese la cantidad de pupitres defectuosos: ");
            pupitresDefectuosos[i] = input.nextInt();

            System.out.print("Ingrese la cantidad de pupitres producidos: ");
            pupitresProducidos[i] = input.nextInt();
        }
    }

    public static void imprimirInformacionTrabajadores(
            int[] codigos,
            int[] horasAusencia,
            int[] pupitresDefectuosos,
            int[] pupitresProducidos,
            int[] gradosEficiencia
    ) {
        for (int i = 0; i < codigos.length; i++) {
            System.out.println("\nTrabajador " + (i + 1));
            System.out.println("Codigo: " + codigos[i]);
            System.out.println("Horas de ausencia: " + horasAusencia[i]);
            System.out.println("Pupitres defectuosos: " + pupitresDefectuosos[i]);
            System.out.println("Pupitres producidos: " + pupitresProducidos[i]);
            System.out.println("Grado de eficiencia: " + gradosEficiencia[i]);
        }
    }
}
