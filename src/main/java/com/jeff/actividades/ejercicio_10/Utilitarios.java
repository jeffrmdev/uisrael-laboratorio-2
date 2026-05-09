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
public class Utilitarios {
    public static int mostrarMenu(Scanner input) {
        System.out.println("\n===== MENU RESTAURANTE =====");
        System.out.println("1. Registrar pedido");
        System.out.println("2. Mostrar reporte de pedidos");
        System.out.println("3. Calcular ingreso total del restaurante");
        System.out.println("4. Mostrar pedido de mayor valor");
        System.out.println("5. Finalizar");
        System.out.print("Seleccione una opcion: ");

        return input.nextInt();
    }

    public static void registrarPedido(
            Scanner input,
            String[] clientes,
            String[] platos,
            int[] cantidades,
            double[] preciosUnitarios,
            int posicion
    ) {
        input.nextLine();

        System.out.println("\n--- REGISTRAR PEDIDO ---");

        System.out.print("Ingrese el nombre del cliente: ");
        clientes[posicion] = input.nextLine();

        System.out.print("Ingrese el plato solicitado: ");
        platos[posicion] = input.nextLine();

        System.out.print("Ingrese la cantidad: ");
        cantidades[posicion] = input.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        preciosUnitarios[posicion] = input.nextDouble();

        System.out.println("Pedido registrado correctamente.");
    }

    public static void mostrarReportePedidos(
            String[] clientes,
            String[] platos,
            int[] cantidades,
            double[] preciosUnitarios,
            int contador
    ) {
        System.out.println("\n--- REPORTE GENERAL DE PEDIDOS ---");

        if (contador == 0) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        for (int i = 0; i < contador; i++) {
            double subtotal = Servicios.calcularSubtotalPedido(
                    cantidades[i],
                    preciosUnitarios[i]
            );

            double descuento = Servicios.calcularDescuento(subtotal);

            double totalPagar = Servicios.calcularTotalPagar(subtotal);

            System.out.println("\nPedido " + (i + 1));
            System.out.println("Cliente: " + clientes[i]);
            System.out.println("Plato solicitado: " + platos[i]);
            System.out.println("Cantidad: " + cantidades[i]);
            System.out.println("Precio unitario: $" + preciosUnitarios[i]);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + totalPagar);
        }
    }
    
}
