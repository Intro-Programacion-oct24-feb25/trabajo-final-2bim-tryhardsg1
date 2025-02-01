import sys
from actividades.registro_futbol import registro_participante_futbol
from  actividades.registro_natacion import registro_participante_natacion
from  actividades.registro_atletismo import registro_participante_atletismo
from  actividades.registro_basquetbol import registro_participante_basquetbol
from  actividades.registro_ciclismo import registro_participante_ciclismo
from  actividades.registro_tenis import registro_participante_tenis
from  actividades.registro_yoga import registro_participante_yoga

from utils import obtener_informacion, obtener_reporte

def main():
    areas = ["Futbol", "Natacion", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"]
    resultados = [0] * len(areas)
    bandera = True
    
    while bandera:
        print("Ingrese la opción a la que quiere ingresar:")
        for i, area in enumerate(areas, start=1):
            print(f"{i}. {area} ({i})")
        
        try:
            opcion = int(input().strip())
        except ValueError:
            print("Entrada inválida. Intente de nuevo.")
            continue
        
        if 1 <= opcion <= len(areas):
            registrar_participante(opcion, resultados)
        else:
            print("Lo sentimos, el club no tiene esta opción")
            bandera = False
        
        continuar = input("¿Desea continuar agregando actividades? (Y/N): ").strip().upper()
        if continuar == "N":
            bandera = False
    
    print("\nResumen de actividades registradas:")
    for i, area in enumerate(areas):
        print(f"{area}: {resultados[i]} participantes")

def registrar_participante(opcion, resultados):
    funciones = [
        registro_participante_futbol,
        registro_participante_natacion,
        registro_participante_atletismo,
        registro_participante_basquetbol,
        registro_participante_ciclismo,
        registro_participante_tenis,
        registro_participante_yoga
    ]
    funciones[opcion - 1]()
    resultados[opcion - 1] += 1

if __name__ == "__main__":
    main()



        