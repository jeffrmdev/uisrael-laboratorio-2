/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Utilitarios {

    public static Scanner input = new Scanner(System.in);

    public static void llenarMatrizPrecios(double[][] precios) {
        double precio;
        for (int i = 0; i < precios.length; i++) {
            System.out.println("\nProducto " + (i + 1));
            for (int j = 0; j < precios[i].length; j++) {
                System.out.print("Precio en sucursal " + (j + 1) + ": ");
                precios[i][j] = input.nextDouble();
            }
        }
    }

    public static void llenarMatrizCantidades(int[][] cantidades) {
        int cantidad;
        for (int i = 0; i < cantidades.length; i++) {
            System.out.println("\nProductos vendidos " + (i + 1));
            for (int j = 0; j < cantidades[i].length; j++) {
                System.out.print("Cantidades vendidas en sucursal " + (j + 1) + ": ");
                cantidad = input.nextInt();
                cantidades[i][j] = cantidad;
            }
        }
    }

    public static void imprimirMatrizPrecios(double[][] matriz) {
        System.out.print("Articulo/Sucursal\t");

        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print("Sucursal " + (j + 1) + "\t");
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Articulo " + (i + 1) + "\t\t");

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("$" + matriz[i][j] + "\t\t");
            }

            System.out.println();
        }
    }

    public static void imprimirMatrizCantidades(int[][] matriz) {
        System.out.print("Articulo/Sucursal\t");

        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print("Sucursal " + (j + 1) + "\t");
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Articulo " + (i + 1) + "\t\t");

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t\t");
            }

            System.out.println();
        }
    }

    public static void imprimirVectorVentasArticulos(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Articulo " + (i + 1) + ": $" + vector[i]);
        }
    }

    public static void imprimirVectorVentasSucursales(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Sucursal " + (i + 1) + ": $" + vector[i]);
        }
    }
}
