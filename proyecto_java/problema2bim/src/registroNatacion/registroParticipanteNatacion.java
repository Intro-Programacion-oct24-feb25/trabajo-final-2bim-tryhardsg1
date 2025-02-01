/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroNatacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class registroParticipanteNatacion {
    public static void registroParticipanteNatacion() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String estilo;
        String nivel;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el estilo favorito del participante: ");
        estilo = entrada.nextLine();
        System.out.println("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ");
        nivel = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nCiudad: %s\nEstilo: %s\nNivel: %s\n",
                nombre, edad, ciudad, estilo, nivel);
    }
}
