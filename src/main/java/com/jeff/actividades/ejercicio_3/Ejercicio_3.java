/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Ejercicio_3 {

    public static void Actividad() {
        Scanner input = new Scanner(System.in);

        int n;
        int codigoBuscar;
        int posicion = -1;
        
        System.out.println("BUSCAR EMPLEADOS");
        System.out.print("Ingrese la cantidad de empleados: ");
        n = input.nextInt();

        int[] codigos = new int[n];
        String[] nombres = new String[n];

        // INGRESAR DATOS EMPLEADO
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpleado " + (i + 1));

            System.out.print("Ingrese el codigo del empleado: ");
            codigos[i] = input.nextInt();

            input.nextLine();

            System.out.print("Ingrese el nombre del empleado: ");
            nombres[i] = input.nextLine();
        }

        // BUSCAR EMPLEADO POR CODIGO
        System.out.print("\nIngrese el codigo del empleado que desea buscar: ");
        codigoBuscar = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (codigos[i] == codigoBuscar) {
                posicion = i;
                break;
            }
        }

        if (posicion < 0) {
            System.out.println("No existe un empleado con ese codigo.");
        } else {
            System.out.println("El nombre del empleado es: " + nombres[posicion]);
        }

        input.close();
    }
}

