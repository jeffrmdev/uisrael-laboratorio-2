/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Ejercicio_8 {

    public static void Actividad() {

        Scanner input = new Scanner(System.in);

        int n_trabajadores;

        System.out.print("Ingrese la cantidad de trabajadores: ");
        n_trabajadores = input.nextInt();

        int[] codigos = new int[n_trabajadores];
        int[] horasAusencia = new int[n_trabajadores];
        int[] pupitresDefectuosos = new int[n_trabajadores];
        int[] pupitresProducidos = new int[n_trabajadores];
        int[] gradosEficiencia = new int[n_trabajadores];

        Utilitarios.ingresarDatosTrabajadores(
                codigos,
                horasAusencia,
                pupitresDefectuosos,
                pupitresProducidos
        );

        for (int i = 0; i < n_trabajadores; i++) {
            gradosEficiencia[i] = Servicios.calcularGradoEficiencia(
                    horasAusencia[i],
                    pupitresDefectuosos[i],
                    pupitresProducidos[i]
            );
        }

        System.out.println("\n--- INFORMACION DE LOS TRABAJADORES ---");
        Utilitarios.imprimirInformacionTrabajadores(
                codigos,
                horasAusencia,
                pupitresDefectuosos,
                pupitresProducidos,
                gradosEficiencia
        );

        input.close();
    }
}
