/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Ejercicio_9 {

    public static void Actividad() {
        Scanner input = new Scanner(System.in);

        int maxMedicamentos;
        int opcion;
        int contador = 0;

        System.out.print("Ingrese la cantidad maxima de medicamentos a registrar: ");
        maxMedicamentos = input.nextInt();

        String[] nombres = new String[maxMedicamentos];
        int[] stockActual = new int[maxMedicamentos];
        int[] stockMinimo = new int[maxMedicamentos];
        double[] precioUnitario = new double[maxMedicamentos];

        do {
            opcion = Utilitarios.mostrarMenu(input);

            switch (opcion) {
                case 1:
                    if (contador < maxMedicamentos) {
                        Utilitarios.registrarMedicamento(input, nombres, stockActual, stockMinimo, precioUnitario, contador);

                        contador++;
                    } else {
                        System.out.println("Ya no se pueden registrar mas medicamentos.");
                    }
                    break;

                case 2:
                    Servicios.mostrarMedicamentosStockBajo(nombres,stockActual,stockMinimo,contador);
                    break;

                case 3:
                    double totalInventario = Servicios.calcularValorTotalInventario(stockActual,precioUnitario,contador);

                    System.out.println("\nValor economico total del inventario: $" + totalInventario);
                    break;

                case 4:
                    Servicios.registrarVenta(input,nombres,stockActual,contador);
                    break;

                case 5:
                    Utilitarios.mostrarReporteGeneral(nombres,stockActual,stockMinimo,precioUnitario,contador);
                    break;

                case 6:
                    System.out.println("\nPrograma finalizado.");

                    System.out.println("\n--- REPORTE FINAL DEL INVENTARIO ---");
                    Utilitarios.mostrarReporteGeneral(nombres,stockActual,stockMinimo,precioUnitario,contador);

                    double totalFinal = Servicios.calcularValorTotalInventario(stockActual,precioUnitario,contador);

                    System.out.println("\nValor economico total del inventario: $" + totalFinal);
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 6);

        input.close();
    }
}
