def obtener_datos_futbol():
    datos = {}
    datos["Nombre"] = input("Ingrese el nombre del participante: ").strip()
    datos["Edad"] = input("Ingrese la edad del participante: ").strip()
    datos["Posición"] = input("Ingrese la posición del participante: ").strip()
    datos["Ciudad"] = input("Ingrese la ciudad del participante: ").strip()
    datos["Equipo favorito"] = input("Ingrese el equipo favorito del participante: ").strip()
    return datos

def registro_participante_futbol():
    print("\nRegistro de Participante en Fútbol")
    datos = obtener_datos_futbol()
    
    print("\nDatos del Participante:")
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")
    print()
