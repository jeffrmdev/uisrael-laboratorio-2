/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeff.actividades.ejercicio_8;

/**
 *
 * @author Jeff
 */
public class Servicios {

    public static int calcularGradoEficiencia(
            int horasAusencia,
            int pupitresDefectuosos,
            int pupitresProducidos
    ) {
        boolean cumplePrimera = horasAusencia <= 3;
        boolean cumpleSegunda = pupitresDefectuosos < 300;
        boolean cumpleTercera = pupitresProducidos > 10000;

        if (!cumplePrimera && !cumpleSegunda && !cumpleTercera) {
            return 5;
        } else if (cumplePrimera && !cumpleSegunda && !cumpleTercera) {
            return 7;
        } else if (!cumplePrimera && cumpleSegunda && !cumpleTercera) {
            return 8;
        } else if (!cumplePrimera && !cumpleSegunda && cumpleTercera) {
            return 9;
        } else if (cumplePrimera && cumpleSegunda && !cumpleTercera) {
            return 12;
        } else if (cumplePrimera && !cumpleSegunda && cumpleTercera) {
            return 13;
        } else if (!cumplePrimera && cumpleSegunda && cumpleTercera) {
            return 15;
        } else {
            return 20;
        }
    }
}
