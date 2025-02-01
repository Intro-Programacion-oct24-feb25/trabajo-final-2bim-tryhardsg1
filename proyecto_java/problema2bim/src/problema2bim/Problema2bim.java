/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2bim;



import java.util.Scanner;
import registroFutbol.registroParticipanteFutbol;
import registroNatacion.registroParticipanteNatacion;
import registroAtletismo.registroParticipanteAtletismo;
import static registroAtletismo.registroParticipanteAtletismo.registroParticipanteAtletismo;
import registroBasquetbol.registroParticipanteBasquetbol;
import static registroBasquetbol.registroParticipanteBasquetbol.registroParticipanteBasquetbol;
import registroCiclismo.registroParticipanteCiclismo;
import static registroCiclismo.registroParticipanteCiclismo.registroParticipanteCiclismo;
import static registroFutbol.registroParticipanteFutbol.registroParticipanteFutbol;
import static registroNatacion.registroParticipanteNatacion.registroParticipanteNatacion;
import registroTenis.registroParticipanteTenis;
import static registroTenis.registroParticipanteTenis.registroParticipanteTenis;
import registroYoga.registroParticipanteYoga;
import static registroYoga.registroParticipanteYoga.registroParticipanteYoga;

public class Problema2bim {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String[] areas = {"Futbol", "Natacion", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"};
        int[] resultados = new int[7];
        int opcion;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese la opción a la que quiere ingresar: ");
            for (int i = 0; i < areas.length; i++) {
                System.out.println((i + 1) + "." + areas[i] + "(" + (i + 1) + ")");
            }
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    registroParticipanteFutbol();
                    resultados[0]++;
                    break;
                case 2:
                    registroParticipanteNatacion();
                    resultados[1]++;
                    break;
                case 3:
                    registroParticipanteAtletismo();
                    resultados[2]++;
                    break;
                case 4:
                    registroParticipanteBasquetbol();
                    resultados[3]++;
                    break;
                case 5:
                    registroParticipanteCiclismo();
                    resultados[4]++;
                    break;
                case 6:
                    registroParticipanteTenis();
                    resultados[5]++;
                    break;
                case 7:
                    registroParticipanteYoga();
                    resultados[6]++;
                    break;
                default:
                    System.out.println("Lo sentimos, el club no tiene esta opción");
                    bandera = false;
            }

            System.out.println("¿Desea continuar agregando actividades? Ingrese Y/N");
            entrada.nextLine(); 
            String continuar = entrada.nextLine();
            if (continuar.equalsIgnoreCase("N")) {
                bandera = false;
            }
        }
    }
}
