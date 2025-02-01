/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroFutbol;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class registroParticipanteFutbol {
    public static void registroParticipanteFutbol() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        String ciudad;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la posición preferida del participante: ");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nPosición: %s\nCiudad: %s\n",
                nombre, edad, posicion, ciudad);
    }

    
}
