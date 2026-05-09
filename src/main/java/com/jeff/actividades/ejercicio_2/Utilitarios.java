/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_2;

import java.util.Random;

/**
 *
 * @author Jeff
 */
public class Utilitarios {

    public static void AgregarNumeros(int[] numeros) {
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
    }

    public static void ImprimirNumeros(int[] numeros, String titulo) {
        System.out.println(titulo.toUpperCase());
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.printf("%d | ", numeros[i]);
            }
        }
    }

    public static int BuscarNumeros(int[] numeros, int n) {
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public static void SepararImpares(int[] numeros, int[] impares) {
        int contadorImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 != 0) {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }
    }

    public static int ImparesMayores(int[] numeros, int mayor) {
        int mayores = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayores++;
            }
        }
        return mayores;
    }
}
