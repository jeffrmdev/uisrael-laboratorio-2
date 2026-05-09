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
public class Ejercicio_7 {

    public static void Actividad() {
        Scanner input = new Scanner(System.in);

        int n_estudiantes;
        final int TOTAL_MATERIAS = 8;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        n_estudiantes = input.nextInt();

        int[] codigos = new int[n_estudiantes];
        double[][] calificaciones = new double[n_estudiantes][TOTAL_MATERIAS];

        Utilitarios.ingresarDatosEstudiantes(codigos, calificaciones);

        System.out.println("\n--- MATRIZ DE CALIFICACIONES ---");
        Utilitarios.imprimirMatrizCalificaciones(codigos, calificaciones);

        double[] promediosEstudiantes = Servicios.calcularPromedioPorEstudiante(calificaciones);
        double[] promediosMaterias = Servicios.calcularPromedioPorMateria(calificaciones);
        int posicionMayorPromedio = Servicios.obtenerEstudianteMayorPromedio(promediosEstudiantes);
        int[] aprobadosPorMateria = Servicios.contarAprobadosPorMateria(calificaciones);
        int[] reprobadosPorMateria = Servicios.contarReprobadosPorMateria(calificaciones);

        System.out.println("\n--- PROMEDIO POR ESTUDIANTE ---");
        Utilitarios.imprimirPromediosEstudiantes(codigos, promediosEstudiantes);

        System.out.println("\n--- PROMEDIO POR MATERIA ---");
        Utilitarios.imprimirPromediosMaterias(promediosMaterias);

        System.out.println("\n--- ESTUDIANTE CON MAYOR PROMEDIO ---");
        System.out.println("Codigo del estudiante: " + codigos[posicionMayorPromedio]);
        System.out.println("Promedio: " + promediosEstudiantes[posicionMayorPromedio]);

        System.out.println("\n--- ESTUDIANTES APROBADOS POR MATERIA ---");
        Utilitarios.imprimirConteoPorMateria(aprobadosPorMateria, "Aprobados");

        System.out.println("\n--- ESTUDIANTES REPROBADOS POR MATERIA ---");
        Utilitarios.imprimirConteoPorMateria(reprobadosPorMateria, "Reprobados");

        input.close();

    }
}
