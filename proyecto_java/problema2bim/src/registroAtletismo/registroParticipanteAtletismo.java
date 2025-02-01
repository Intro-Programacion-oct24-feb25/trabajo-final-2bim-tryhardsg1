/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroAtletismo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class registroParticipanteAtletismo {
    public static void registroParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        String recordPersonal;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la especialidad del participante (Carreras, Salto, Lanzamiento): ");
        especialidad = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el record personal del participante: ");
        recordPersonal = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nEspecialidad: %s\nCiudad: %s\nRecord personal: %s\n",
                nombre, edad, especialidad, ciudad, recordPersonal);
    }
}
