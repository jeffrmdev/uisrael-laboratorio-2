/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_5;

/**
 *
 * @author Jeff
 */
public class Servicios {
    public static double[] calcularTotalVentasPorArticulo(
            double[][] precios,
            int[][] cantidadesVendidas
    ) {
        int totalArticulos = precios.length;
        int totalSucursales = precios[0].length;

        double[] ventasPorArticulo = new double[totalArticulos];

        for (int i = 0; i < totalArticulos; i++) {
            double total = 0;

            for (int j = 0; j < totalSucursales; j++) {
                total += precios[i][j] * cantidadesVendidas[i][j];
            }

            ventasPorArticulo[i] = total;
        }
        return ventasPorArticulo;
    }

    public static double[] calcularTotalVentasPorSucursal(
            double[][] precios,
            int[][] cantidadesVendidas
    ) {
        int totalArticulos = precios.length;
        int totalSucursales = precios[0].length;

        double[] ventasPorSucursal = new double[totalSucursales];

        for (int j = 0; j < totalSucursales; j++) {
            double total = 0;

            for (int i = 0; i < totalArticulos; i++) {
                total += precios[i][j] * cantidadesVendidas[i][j];
            }

            ventasPorSucursal[j] = total;
        }
        return ventasPorSucursal;
    }
}
