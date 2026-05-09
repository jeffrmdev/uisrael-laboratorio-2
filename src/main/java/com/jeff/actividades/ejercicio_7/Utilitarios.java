/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Utilitarios {
    public static Scanner input = new Scanner(System.in);
    public static void ingresarDatosEstudiantes(
            int[] codigos,
            double[][] calificaciones
    ) {
        for (int i = 0; i < codigos.length; i++) {
            System.out.println("\nEstudiante " + (i + 1));

            System.out.print("Ingrese el codigo del estudiante: ");
            codigos[i] = input.nextInt();

            for (int j = 0; j < calificaciones[i].length; j++) {
                do {
                    System.out.print("Ingrese la calificacion de la materia " + (j + 1) + ": ");
                    calificaciones[i][j] = input.nextDouble();

                    if (calificaciones[i][j] < 0 || calificaciones[i][j] > 10) {
                        System.out.println("Error: la calificacion debe estar entre 0 y 10.");
                    }

                } while (calificaciones[i][j] < 0 || calificaciones[i][j] > 10);
            }
        }
    }

    public static void imprimirMatrizCalificaciones(int[] codigos, double[][] calificaciones) {
        System.out.print("Codigo\t\t");

        for (int j = 0; j < calificaciones[0].length; j++) {
            System.out.print("Materia " + (j + 1) + "\t");
        }

        System.out.println();

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print(codigos[i] + "\t\t");

            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + "\t\t");
            }

            System.out.println();
        }
    }

    public static void imprimirPromediosEstudiantes(int[] codigos, double[] promedios) {
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Estudiante codigo " + codigos[i] + ": " + promedios[i]);
        }
    }

    public static void imprimirPromediosMaterias(double[] promedios) {
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Materia " + (i + 1) + ": " + promedios[i]);
        }
    }

    public static void imprimirConteoPorMateria(int[] conteo, String texto) {
        for (int i = 0; i < conteo.length; i++) {
            System.out.println("Materia " + (i + 1) + " - " + texto + ": " + conteo[i]);
        }
    }
}
