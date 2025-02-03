/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2bim;



import java.util.Scanner;
import registroFutbol.registroParticipanteFutbol;
import registroNatacion.registroParticipanteNatacion;
import registroAtletismo.registroParticipanteAtletismo;
import registroBasquetbol.registroParticipanteBasquetbol;
import registroCiclismo.registroParticipanteCiclismo;
import registroTenis.registroParticipanteTenis;
import registroYoga.registroParticipanteYoga;

public class Problema2bim {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] areas = {"Futbol", "Natacion", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"};
        String reporte;

        int[] resultados = new int[7];
        int opcion;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese la opción a la que quiere ingresar: ");
            for (int i = 0; i < areas.length; i++) {
                System.out.println((i + 1) + ". " + areas[i]);
            }
            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        registroParticipanteFutbol.registroParticipanteFutbol();
                        resultados[0]++;
                        break;
                    case 2:
                        registroParticipanteNatacion.registroParticipanteNatacion();
                        resultados[1]++;
                        break;
                    case 3:
                        registroParticipanteAtletismo.registroParticipanteAtletismo();
                        resultados[2]++;
                        break;
                    case 4:
                        registroParticipanteBasquetbol.registroParticipanteBasquetbol();
                        resultados[3]++;
                        break;
                    case 5:
                        registroParticipanteCiclismo.registroParticipanteCiclismo();
                        resultados[4]++;
                        break;
                    case 6:
                        registroParticipanteTenis.registroParticipanteTenis();
                        resultados[5]++;
                        break;
                    case 7:
                        registroParticipanteYoga.registroParticipanteYoga();
                        resultados[6]++;
                        break;
                    default:
                        System.out.println("Lo sentimos, el club no tiene esta opción");
                        bandera = false;
                }
            } catch (Exception e) {
                System.out.printf("Ocurrio un error por favor indique nuevamente el deporte a participar: %s\n", e);
                entrada.nextLine();
            }

            System.out.println("¿Desea continuar agregando actividades? Ingrese Y/N");
            entrada.nextLine();
            String continuar = entrada.nextLine();
            if (continuar.equalsIgnoreCase("N")) {
                bandera = false;
            }
        }
        String informacion = paqueteInformacion.informacion.obtenerInformacion(resultados);
        reporte = paqueteReporte.reporte.obtenerReporte(areas, resultados);

        mostrarReporteFinal(informacion, reporte);

        entrada.close();
    }

    public static void mostrarReporteFinal(String informacion, String reporte) {
        System.out.println("Información: " + informacion);
        System.out.println("Reporte: " + reporte);
    }
}
