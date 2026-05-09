/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Ejercicio_10 {
    public static void Actividad() {
        Scanner input = new Scanner(System.in);

        int maxPedidos;
        int contador = 0;
        int opcion;

        System.out.print("Ingrese la cantidad maxima de pedidos a registrar: ");
        maxPedidos = input.nextInt();

        String[] clientes = new String[maxPedidos];
        String[] platos = new String[maxPedidos];
        int[] cantidades = new int[maxPedidos];
        double[] preciosUnitarios = new double[maxPedidos];

        do {
            opcion = Utilitarios.mostrarMenu(input);

            switch (opcion) {
                case 1:
                    if (contador < maxPedidos) {
                        Utilitarios.registrarPedido(
                                input,
                                clientes,
                                platos,
                                cantidades,
                                preciosUnitarios,
                                contador
                        );

                        contador++;
                    } else {
                        System.out.println("Ya no se pueden registrar mas pedidos.");
                    }
                    break;

                case 2:
                    Utilitarios.mostrarReportePedidos(
                            clientes,
                            platos,
                            cantidades,
                            preciosUnitarios,
                            contador
                    );
                    break;

                case 3:
                    double ingresoTotal = Servicios.calcularIngresoTotal(
                            cantidades,
                            preciosUnitarios,
                            contador
                    );

                    System.out.println("\nIngreso total del restaurante: $" + ingresoTotal);
                    break;

                case 4:
                    Servicios.mostrarPedidoMayorValor(
                            clientes,
                            platos,
                            cantidades,
                            preciosUnitarios,
                            contador
                    );
                    break;

                case 5:
                    System.out.println("\nPrograma finalizado.");

                    System.out.println("\n--- REPORTE FINAL DE PEDIDOS ---");
                    Utilitarios.mostrarReportePedidos(
                            clientes,
                            platos,
                            cantidades,
                            preciosUnitarios,
                            contador
                    );

                    double totalFinal = Servicios.calcularIngresoTotal(
                            cantidades,
                            preciosUnitarios,
                            contador
                    );

                    System.out.println("\nIngreso total del restaurante: $" + totalFinal);

                    System.out.println("\n--- PEDIDO DE MAYOR VALOR ---");
                    Servicios.mostrarPedidoMayorValor(
                            clientes,
                            platos,
                            cantidades,
                            preciosUnitarios,
                            contador
                    );
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 5);

        input.close();
    }
}
