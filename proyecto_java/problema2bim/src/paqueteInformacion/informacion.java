/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteInformacion;






/**
 *
 * @author Usuario
 */
public class informacion {
   public static String obtenerInformacion(int[] contador) {
        int suma = 0;
        String mensaje = "";
        for (int i = 0; i < contador.length; i++) {
            suma = suma + contador[i];
        }

        if (suma == 0) {
            mensaje = "Mala campaña, debemos mejorar";
        } else {
            if (suma == 1 || suma <= 5) {
                mensaje = "Poca participación en el club, hay que mejorar";
            } else {
                if (suma == 6 || suma <= 15) {
                    mensaje = "Buena participación, sigan así.";
                } else {
                    if (suma >= 16) {
                        mensaje = " Excelente campaña del club";
                    }

                }

            }

        }
        return mensaje;
    }
}