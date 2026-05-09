/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_2;

import static com.jeff.actividades.ejercicio_2.Utilitarios.AgregarNumeros;
import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Ejercicio_2 {

    public static void Actividad() {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] numeros_impares = new int[20];

        int n;
        int posicion;

        AgregarNumeros(numeros);
        Utilitarios.ImprimirNumeros(numeros, "NUMEROS ALEATORIOS");
        
        // BUSCAR NUMERO EN VECTOR
        System.out.println("\nBUSCAR NUMERO");
        System.out.print("Ingrese un numero para buscar en el vector: ");
        n = input.nextInt();
        posicion = Utilitarios.BuscarNumeros(numeros, n);
        
        if (posicion < 0) {
            System.out.println("No existe el numero buscado");
        } else {
            System.out.println("El numero buscado esta en la posicion " + posicion);
        }
        
        // SEPARAR IMPARES RESULTANTES
        Utilitarios.SepararImpares(numeros, numeros_impares);
        Utilitarios.ImprimirNumeros(numeros_impares, "NUMEROS IMPARES");
        
        // BUSCAR NUMEROS MAYORES A 20
        System.out.println("\nNumeros mayores a 20: " + (Utilitarios.ImparesMayores(numeros_impares, 20)));
    }
}
