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
public class Ejercicio_6 {

    public static void Actividad() {

        Scanner input = new Scanner(System.in);

        int n_vendedores;
        int m_anios;

        System.out.print("Ingrese la cantidad de vendedores: ");
        n_vendedores = input.nextInt();

        System.out.print("Ingrese la cantidad de anios de operaciones: ");
        m_anios = input.nextInt();

        double[][] ventas = new double[n_vendedores][m_anios];

        Utilitarios.llenarMatrizVentas(ventas);

        System.out.println(
                "\n--- MATRIZ DE VENTAS ---");
        Utilitarios.imprimirMatrizVentas(ventas);

        double[] totalPorVendedor = Servicios.calcularTotalPorVendedor(ventas);
        double[] totalPorAnio = Servicios.calcularTotalPorAnio(ventas);
        double totalEmpresa = Servicios.calcularTotalEmpresa(ventas);

        System.out.println(
                "\n--- TOTAL DE VENTAS POR VENDEDOR ---");
        Utilitarios.imprimirTotalPorVendedor(totalPorVendedor);

        System.out.println(
                "\n--- TOTAL DE VENTAS POR ANIO ---");
        Utilitarios.imprimirTotalPorAnio(totalPorAnio);

        System.out.println(
                "\n--- TOTAL DE VENTAS DE LA EMPRESA ---");
        System.out.println(
                "Total empresa: $" + totalEmpresa);

        input.close();
    }
}
