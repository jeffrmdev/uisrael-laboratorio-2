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
public class Servicios {
    public static void mostrarMedicamentosStockBajo(
            String[] nombres,
            int[] stockActual,
            int[] stockMinimo,
            int contador
    ) {
        System.out.println("\n--- MEDICAMENTOS CON STOCK BAJO ---");

        if (contador == 0) {
            System.out.println("No hay medicamentos registrados.");
            return;
        }

        boolean hayStockBajo = false;

        for (int i = 0; i < contador; i++) {
            if (stockActual[i] < stockMinimo[i]) {
                System.out.println("\nNombre: " + nombres[i]);
                System.out.println("Stock actual: " + stockActual[i]);
                System.out.println("Stock minimo: " + stockMinimo[i]);
                hayStockBajo = true;
            }
        }

        if (!hayStockBajo) {
            System.out.println("No hay medicamentos con stock por debajo del minimo.");
        }
    }

    public static double calcularValorTotalInventario(
            int[] stockActual,
            double[] precioUnitario,
            int contador
    ) {
        double total = 0;

        for (int i = 0; i < contador; i++) {
            total += stockActual[i] * precioUnitario[i];
        }

        return total;
    }

    public static void registrarVenta(
            Scanner input,
            String[] nombres,
            int[] stockActual,
            int contador
    ) {
        if (contador == 0) {
            System.out.println("\nNo hay medicamentos registrados.");
            return;
        }

        input.nextLine();

        System.out.println("\n--- REGISTRAR VENTA ---");

        System.out.print("Ingrese el nombre del medicamento vendido: ");
        String nombreBuscar = input.nextLine();

        int posicion = buscarMedicamentoPorNombre(nombres, nombreBuscar, contador);

        if (posicion == -1) {
            System.out.println("No se encontro un medicamento con ese nombre.");
            return;
        }

        System.out.println("Medicamento encontrado: " + nombres[posicion]);
        System.out.println("Stock disponible: " + stockActual[posicion]);

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        if (cantidadVendida <= 0) {
            System.out.println("La cantidad vendida debe ser mayor a 0.");
        } else if (cantidadVendida > stockActual[posicion]) {
            System.out.println("No existe stock suficiente para registrar la venta.");
            System.out.println("Stock disponible: " + stockActual[posicion]);
            System.out.println("Cantidad solicitada: " + cantidadVendida);
        } else {
            stockActual[posicion] = stockActual[posicion] - cantidadVendida;

            System.out.println("Venta registrada correctamente.");
            System.out.println("Cantidad vendida: " + cantidadVendida);
            System.out.println("Nuevo stock de " + nombres[posicion] + ": " + stockActual[posicion]);
        }
    }

    public static int buscarMedicamentoPorNombre(
            String[] nombres,
            String nombreBuscar,
            int contador
    ) {
        for (int i = 0; i < contador; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                return i;
            }
        }

        return -1;
    }
}
