/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.jeff.actividades;

import com.jeff.actividades.ejercicio_1.Ejercicio_1;
import com.jeff.actividades.ejercicio_2.Ejercicio_2;
import com.jeff.actividades.ejercicio_3.Ejercicio_3;
import com.jeff.actividades.ejercicio_4.Ejercicio_4;
import com.jeff.actividades.ejercicio_5.Ejercicio_5;
import com.jeff.actividades.ejercicio_6.Ejercicio_6;
import com.jeff.actividades.ejercicio_7.Ejercicio_7;
import com.jeff.actividades.ejercicio_8.Ejercicio_8;
import com.jeff.actividades.ejercicio_9.Ejercicio_9;
import com.jeff.actividades.ejercicio_10.Ejercicio_10;
import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n========== MENU DE ACTIVIDADES ==========");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicio_1.Actividad();
                    break;

                case 2:
                    Ejercicio_2.Actividad();
                    break;

                case 3:
                    Ejercicio_3.Actividad();
                    break;

                case 4:
                    Ejercicio_4.Actividad();
                    break;

                case 5:
                    Ejercicio_5.Actividad();
                    break;

                case 6:
                    Ejercicio_6.Actividad();
                    break;

                case 7:
                    Ejercicio_7.Actividad();
                    break;

                case 8:
                    Ejercicio_8.Actividad();
                    break;

                case 9:
                    Ejercicio_9.Actividad();
                    break;

                case 10:
                    Ejercicio_10.Actividad();
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }
}
