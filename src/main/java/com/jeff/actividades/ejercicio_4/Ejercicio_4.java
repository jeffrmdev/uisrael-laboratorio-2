/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Ejercicio_4 {

    public static void Actividad() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int filas, columnas;
        int opcion;
        boolean salir = false;

        System.out.print("Ingrese el numero de filas M: ");
        filas = input.nextInt();

        System.out.print("Ingrese el numero de columnas N: ");
        columnas = input.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        Utilitarios.llenarMatriz(matrizA, random);
        Utilitarios.llenarMatriz(matrizB, random);

        System.out.println("\n--- MATRIZ A ---");
        Utilitarios.imprimirMatriz(matrizA);

        System.out.println("\n--- MATRIZ B ---");
        Utilitarios.imprimirMatriz(matrizB);

        while(!salir){
            Utilitarios.imprimirMenu();
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- SUMA DE MATRICES ---");
                    int[][] suma = Utilitarios.sumarMatrices(matrizA, matrizB);
                    Utilitarios.imprimirMatriz(suma);
                    break;

                case 2:
                    System.out.println("\n--- RESTA DE MATRICES ---");
                    int[][] resta = Utilitarios.restarMatrices(matrizA, matrizB);
                    Utilitarios.imprimirMatriz(resta);
                    break;

                case 3:
                    if (columnas == filas) {
                        System.out.println("\n--- MULTIPLICACION DE MATRICES ---");
                        int[][] multiplicacion = Utilitarios.multiplicarMatrices(matrizA, matrizB);
                        Utilitarios.imprimirMatriz(multiplicacion);
                    } else {
                        System.out.println("\nNo se pueden multiplicar estas matrices.");
                        System.out.println("Para multiplicar A x B, las columnas de A deben ser iguales a las filas de B.");
                        System.out.println("En este caso A tiene " + columnas + " columnas y B tiene " + filas + " filas.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- MATRIZ A TRASPUESTA ---");
                    int[][] traspuesta = Utilitarios.trasponerMatriz(matrizA);
                    Utilitarios.imprimirMatriz(traspuesta);
                    break;
                    
                case 5:
                    salir = true;
                    break;

                default:
                    System.out.println("\nOpcion no valida.");
                    break;
            }
        }
    }
}

