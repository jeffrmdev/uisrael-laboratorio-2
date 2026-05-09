/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_6;

/**
 *
 * @author Jeff
 */
public class Servicios {
    public static double[] calcularTotalPorVendedor(double[][] ventas) {
        int totalVendedores = ventas.length;
        int totalAnios = ventas[0].length;

        double[] totalPorVendedor = new double[totalVendedores];

        for (int i = 0; i < totalVendedores; i++) {
            double total = 0;

            for (int j = 0; j < totalAnios; j++) {
                total += ventas[i][j];
            }

            totalPorVendedor[i] = total;
        }

        return totalPorVendedor;
    }

    public static double[] calcularTotalPorAnio(double[][] ventas) {
        int totalVendedores = ventas.length;
        int totalAnios = ventas[0].length;

        double[] totalPorAnio = new double[totalAnios];

        for (int j = 0; j < totalAnios; j++) {
            double total = 0;

            for (int i = 0; i < totalVendedores; i++) {
                total += ventas[i][j];
            }

            totalPorAnio[j] = total;
        }

        return totalPorAnio;
    }

    public static double calcularTotalEmpresa(double[][] ventas) {
        double total = 0;

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                total += ventas[i][j];
            }
        }

        return total;
    }
}
