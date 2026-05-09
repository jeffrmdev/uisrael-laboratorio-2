/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_7;

/**
 *
 * @author Jeff
 */
public class Servicios {

    // CALCULAR PROMEDIO DE ESTUDIANTE
    public static double[] calcularPromedioPorEstudiante(double[][] calificaciones) {
        int totalEstudiantes = calificaciones.length;
        int totalMaterias = calificaciones[0].length;

        double[] promedios = new double[totalEstudiantes];

        for (int i = 0; i < totalEstudiantes; i++) {
            double suma = 0;

            for (int j = 0; j < totalMaterias; j++) {
                suma += calificaciones[i][j];
            }

            promedios[i] = suma / totalMaterias;
        }
        return promedios;
    }

    // CALCULO DE PROMEDIO POR MATERIA
    public static double[] calcularPromedioPorMateria(double[][] calificaciones) {
        int totalEstudiantes = calificaciones.length;
        int totalMaterias = calificaciones[0].length;

        double[] promedios = new double[totalMaterias];

        for (int j = 0; j < totalMaterias; j++) {
            double suma = 0;

            for (int i = 0; i < totalEstudiantes; i++) {
                suma += calificaciones[i][j];
            }

            promedios[j] = suma / totalEstudiantes;
        }
        return promedios;
    }
    
    // ESTUDIANTE CON MAYOR PROMEDIO
    public static int obtenerEstudianteMayorPromedio(double[] promedios) {
        int posicionMayor = 0;

        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > promedios[posicionMayor]) {
                posicionMayor = i;
            }
        }
        return posicionMayor;
    }

    // APROBADOS POR CADA MATERIA
    public static int[] contarAprobadosPorMateria(double[][] calificaciones) {
        int totalMaterias = calificaciones[0].length;
        int[] aprobados = new int[totalMaterias];

        for (int j = 0; j < totalMaterias; j++) {
            int contador = 0;

            for (int i = 0; i < calificaciones.length; i++) {
                if (calificaciones[i][j] >= 7 && calificaciones[i][j] <= 10) {
                    contador++;
                }
            }

            aprobados[j] = contador;
        }
        return aprobados;
    }

    // REPORBADOS POR CADA MATERIA
    public static int[] contarReprobadosPorMateria(double[][] calificaciones) {
        int totalMaterias = calificaciones[0].length;
        int[] reprobados = new int[totalMaterias];

        for (int j = 0; j < totalMaterias; j++) {
            int contador = 0;

            for (int i = 0; i < calificaciones.length; i++) {
                if (calificaciones[i][j] < 7) {
                    contador++;
                }
            }

            reprobados[j] = contador;
        }

        return reprobados;
    }
}
