def obtener_datos_tenis():
    datos = {}
    datos["Nombre"] = input("Ingrese el nombre del participante: ").strip()
    datos["Edad"] = input("Ingrese la edad del participante: ").strip()
    datos["Nivel"] = input("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ").strip()
    datos["Ciudad"] = input("Ingrese la ciudad del participante: ").strip()
    datos["Mano hábil"] = input("Ingrese la mano hábil del participante: ").strip()
    return datos

def registro_participante_tenis():
    print("\nRegistro de Participante en Tenis")
    datos = obtener_datos_tenis()
    
    print("\nDatos del Participante:")
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")
    print()