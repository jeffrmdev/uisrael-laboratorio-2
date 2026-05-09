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
public class Ejercicio_5 {
    public static void Actividad() {
        Scanner input = new Scanner(System.in);

        int n_productos;
        int m_sucursal;

        System.out.print("Ingrese la cantidad de articulos: ");
        n_productos = input.nextInt();

        System.out.print("Ingrese la cantidad de sucursales: ");
        m_sucursal = input.nextInt();

        double[][] precios = new double[n_productos][m_sucursal];
        int[][] cantidades_vendidas = new int[n_productos][m_sucursal];

        Utilitarios.llenarMatrizPrecios(precios);
        Utilitarios.llenarMatrizCantidades(cantidades_vendidas);

        System.out.println("\n--- MATRIZ DE PRECIOS ---");
        Utilitarios.imprimirMatrizPrecios(precios);

        System.out.println("\n--- MATRIZ DE CANTIDADES VENDIDAS ---");
        Utilitarios.imprimirMatrizCantidades(cantidades_vendidas);

        double[] totalVentasPorArticulo = Servicios.calcularTotalVentasPorArticulo(
                precios,
                cantidades_vendidas
        );

        double[] totalVentasPorSucursal = Servicios.calcularTotalVentasPorSucursal(
                precios,
                cantidades_vendidas
        );

        System.out.println("\n--- TOTAL DE VENTAS POR ARTICULO ---");
        Utilitarios.imprimirVectorVentasArticulos(totalVentasPorArticulo);

        System.out.println("\n--- TOTAL DE VENTAS POR SUCURSAL ---");
        Utilitarios.imprimirVectorVentasSucursales(totalVentasPorSucursal);

        input.close();
    }
}
