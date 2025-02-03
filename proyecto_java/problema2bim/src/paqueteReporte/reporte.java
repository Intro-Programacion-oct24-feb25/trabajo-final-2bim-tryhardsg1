/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteReporte;




/**
 *
 * @author Usuario
 */
public class reporte {
    public static String obtenerReporte(String[] deportes, int[] contador) {
        String reporte = "Las actividades ingresadas son:\n";
        int numero = 0;

        for (int i = 0; i < contador.length; i++) {
            numero = numero + 1;

            reporte = String.format("%s%d. Numero de participaciones %s: %d\n", reporte, numero, deportes[i], contador[i]);
        }
        return reporte;
    }
}
