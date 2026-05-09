/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_10;

/**
 *
 * @author Jeff
 */
public class Servicios {

    public static double calcularSubtotalPedido(
            int cantidad,
            double precioUnitario
    ) {
        return cantidad * precioUnitario;
    }

    public static double calcularDescuento(double subtotal) {
        if (subtotal > 50) {
            return subtotal * 0.10;
        } else {
            return 0;
        }
    }

    public static double calcularTotalPagar(double subtotal) {
        double descuento = calcularDescuento(subtotal);

        return subtotal - descuento;
    }

    public static double calcularIngresoTotal(int[] cantidades, double[] preciosUnitarios, int contador) {
        double ingresoTotal = 0;

        for (int i = 0; i < contador; i++) {
            double subtotal = calcularSubtotalPedido(
                    cantidades[i],
                    preciosUnitarios[i]
            );

            double totalPagar = calcularTotalPagar(subtotal);

            ingresoTotal += totalPagar;
        }

        return ingresoTotal;
    }

    public static void mostrarPedidoMayorValor(String[] clientes, String[] platos, int[] cantidades, double[] preciosUnitarios, int contador) {
        if (contador == 0) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        int posicionMayor = 0;

        for (int i = 1; i < contador; i++) {
            double subtotalActual = calcularSubtotalPedido(
                    cantidades[i],
                    preciosUnitarios[i]
            );

            double totalActual = calcularTotalPagar(subtotalActual);

            double subtotalMayor = calcularSubtotalPedido(
                    cantidades[posicionMayor],
                    preciosUnitarios[posicionMayor]
            );

            double totalMayor = calcularTotalPagar(subtotalMayor);

            if (totalActual > totalMayor) {
                posicionMayor = i;
            }
        }

        double subtotal = calcularSubtotalPedido(
                cantidades[posicionMayor],
                preciosUnitarios[posicionMayor]
        );

        double descuento = calcularDescuento(subtotal);
        double totalPagar = calcularTotalPagar(subtotal);

        System.out.println("\nCliente: " + clientes[posicionMayor]);
        System.out.println("Plato solicitado: " + platos[posicionMayor]);
        System.out.println("Cantidad: " + cantidades[posicionMayor]);
        System.out.println("Precio unitario: $" + preciosUnitarios[posicionMayor]);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}
