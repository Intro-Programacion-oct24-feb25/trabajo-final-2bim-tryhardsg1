/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroYoga;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class registroParticipanteYoga {
    public static void registroParticipanteYoga() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estiloPreferido;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ");
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el estilo de yoga preferido del participante: ");
        estiloPreferido = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nNivel: %s\nCiudad: %s\nEstilo: %s\n",
                nombre, edad, nivel, ciudad, estiloPreferido);
    }

}
