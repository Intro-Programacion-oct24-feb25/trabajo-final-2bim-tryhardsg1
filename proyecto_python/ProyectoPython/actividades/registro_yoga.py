def obtener_datos_yoga():
    datos = {}
    datos["Nombre"] = input("Ingrese el nombre del participante: ").strip()
    datos["Edad"] = input("Ingrese la edad del participante: ").strip()
    datos["Nivel"] = input("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ").strip()
    datos["Ciudad"] = input("Ingrese la ciudad del participante: ").strip()
    datos["Estilo preferido"] = input("Ingrese el estilo de yoga preferido del participante: ").strip()
    return datos

def registro_participante_yoga():
    print("\nRegistro de Participante en Yoga")
    datos = obtener_datos_yoga()
    
    print("\nDatos del Participante:")
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")
    print()
