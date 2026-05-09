/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Ejercicio_1 {

    public static void Actividad() {
        Scanner input = new Scanner(System.in);

        int n_estudiantes;
        int agregar_estudiantes = 0;

        System.out.println("****** SISTEMA ESTUDIANTES ******");
        System.out.print("Ingrese la cantidad de estudiantes: ");
        n_estudiantes = input.nextInt();

        String[] reprobadosMatematicas = new String[n_estudiantes];
        String[] reprobadosIngles = new String[n_estudiantes];
        String[] reprobadoAmbas = new String[n_estudiantes];

        System.out.println("Ingrese la cedula de los estudiantes que reprobaron "
                + "MATEMATICAS");
        for (int i = 0; i < n_estudiantes; i++) {
            System.out.print("Cedula del estudiante " + (i + 1) + ": ");
            reprobadosMatematicas[i] = input.next();
        }

        System.out.println("Inrse la cedula de los estudiantes que reprobaron "
                + "INGLES");

        for (int i = 0; i < n_estudiantes; i++) {
            System.out.print("Cedula del estudiante " + (i + 1) + ": ");
            reprobadosIngles[i] = input.next();
        }

        // REPROBADOS EN AMBAS MATERIAS
        for (int i = 0; i < n_estudiantes; i++) {
            for (int j = 0; j < n_estudiantes; j++) {
                if (reprobadosMatematicas[i].equals(reprobadosIngles[j])) {
                    reprobadoAmbas[agregar_estudiantes] = reprobadosMatematicas[i];
                    agregar_estudiantes++;
                    break;
                }
            }
        }
        mostrarTablaEstudiantes(reprobadosMatematicas, reprobadosIngles, n_estudiantes);
        System.out.print("\n");
        mostrarReprobadosDeAmbos(reprobadoAmbas, agregar_estudiantes);
    }
    
    public static void mostrarTablaEstudiantes(String matematica[], String ingles[], int estudiantes) {
        System.out.println("ESTUDIANTES REPROBADOS");
        System.out.printf("%-15s | %-15s \n", "MATEMATICA", "INGLES");
        for (int i = 0; i < estudiantes; i++) {
            System.out.printf("%-15s | %-15s \n", matematica[i], ingles[i]);
        }
    }

    public static void mostrarReprobadosDeAmbos(String ambos[], int estudiantes) {
        System.out.println("REPROBADOS EN AMBAS MATERIAS");
        if (estudiantes > 0) {
            for (int i = 0; i < estudiantes; i++) {
                if (!ambos[i].isEmpty()) {
                    System.out.printf("%-15s \n", ambos[i]);
                }
            }
        } else {
            System.out.println("No existen estudiantes que reprobaron ambas materias.");
        }
    }
}
