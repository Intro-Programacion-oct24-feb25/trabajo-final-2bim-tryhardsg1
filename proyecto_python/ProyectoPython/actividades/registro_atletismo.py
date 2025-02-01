def obtener_datos_atletismo():
    datos = {}
    datos["Nombre"] = input("Ingrese el nombre del participante: ").strip()
    datos["Edad"] = input("Ingrese la edad del participante: ").strip()
    datos["Especialidad"] = input("Ingrese la especialidad del participante (Carreras, Salto, Lanzamiento): ").strip()
    datos["Ciudad"] = input("Ingrese la ciudad del participante: ").strip()
    datos["Récord personal"] = input("Ingrese el récord personal del participante: ").strip()
    return datos

def registro_participante_atletismo():
    print("\nRegistro de Participante en Atletismo")
    datos = obtener_datos_atletismo()
    
    print("\nDatos del Participante:")
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")
    print()
