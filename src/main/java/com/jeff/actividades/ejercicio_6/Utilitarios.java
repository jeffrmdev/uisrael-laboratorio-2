/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Utilitarios {

    public static Scanner input = new Scanner(System.in);
    public static void llenarMatrizVentas(double[][] ventas) {
        double venta;
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Ventas de vendedor " + (i+1) + ": ");
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("Anio "+ (j+1) + ": ");
                venta = input.nextDouble();
                ventas[i][j] = venta;
            }
            System.out.println();
        }
    }

    public static void imprimirMatrizVentas(double[][] ventas) {
        System.out.print("Vendedor/Anio\t");

        for (int j = 0; j < ventas[0].length; j++) {
            System.out.print("Anio " + (j + 1) + "\t\t");
        }

        System.out.println();

        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Vendedor " + (i + 1) + "\t");

            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("$" + ventas[i][j] + "\t\t");
            }

            System.out.println();
        }
    }

    public static void imprimirTotalPorVendedor(double[] totalPorVendedor) {
        for (int i = 0; i < totalPorVendedor.length; i++) {
            System.out.println("Vendedor " + (i + 1) + ": $" + totalPorVendedor[i]);
        }
    }

    public static void imprimirTotalPorAnio(double[] totalPorAnio) {
        for (int i = 0; i < totalPorAnio.length; i++) {
            System.out.println("Anio " + (i + 1) + ": $" + totalPorAnio[i]);
        }
    }
}
