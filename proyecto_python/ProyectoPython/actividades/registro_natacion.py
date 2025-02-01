def obtener_datos_natacion():
    datos = {}
    datos["Nombre"] = input("Ingrese el nombre del participante: ").strip()
    datos["Edad"] = input("Ingrese la edad del participante: ").strip()
    datos["Ciudad"] = input("Ingrese la ciudad del participante: ").strip()
    datos["Estilo favorito"] = input("Ingrese el estilo favorito del participante: ").strip()
    datos["Nivel"] = input("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ").strip()
    return datos

def registro_participante_natacion():
    print("\nRegistro de Participante en Natación")
    datos = obtener_datos_natacion()
    
    print("\nDatos del Participante:")
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")
    print()