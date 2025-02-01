/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroTenis;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class registroParticipanteTenis {
    public static void registroParticipanteTenis() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String manoHabil;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ");
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la mano hábil del participante: ");
        manoHabil = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nNivel: %s\nCiudad: %s\nMano: %s\n",
                nombre, edad, nivel, ciudad, manoHabil);
    }
}
