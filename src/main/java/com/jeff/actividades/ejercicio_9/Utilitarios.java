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
public class Utilitarios {
     public static int mostrarMenu(Scanner input) {
        System.out.println("\n===== MENU FARMACIA =====");
        System.out.println("1. Registrar medicamento");
        System.out.println("2. Mostrar medicamentos con stock bajo");
        System.out.println("3. Calcular valor total del inventario");
        System.out.println("4. Registrar venta");
        System.out.println("5. Mostrar reporte general");
        System.out.println("6. Finalizar");
        System.out.print("Seleccione una opcion: ");

        return input.nextInt();
    }

    public static void registrarMedicamento(Scanner input,String[] nombres,int[] stockActual,int[] stockMinimo,double[] precioUnitario,int posicion) {
        input.nextLine();

        System.out.println("\n--- REGISTRAR MEDICAMENTO ---");

        System.out.print("Ingrese el nombre del medicamento: ");
        nombres[posicion] = input.nextLine();

        System.out.print("Ingrese el stock actual: ");
        stockActual[posicion] = input.nextInt();

        System.out.print("Ingrese el stock minimo: ");
        stockMinimo[posicion] = input.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        precioUnitario[posicion] = input.nextDouble();

        System.out.println("Medicamento registrado correctamente.");
    }

    public static void mostrarReporteGeneral(String[] nombres,int[] stockActual,int[] stockMinimo,double[] precioUnitario,int contador) {
        System.out.println("\n--- REPORTE GENERAL DEL INVENTARIO ---");

        if (contador == 0) {
            System.out.println("No hay medicamentos registrados.");
            return;
        }

        for (int i = 0; i < contador; i++) {
            double valorProducto = stockActual[i] * precioUnitario[i];

            System.out.println("\nMedicamento " + (i + 1));
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Stock actual: " + stockActual[i]);
            System.out.println("Stock minimo: " + stockMinimo[i]);
            System.out.println("Precio unitario: $" + precioUnitario[i]);
            System.out.println("Valor en inventario: $" + valorProducto);
        }
    }
}
