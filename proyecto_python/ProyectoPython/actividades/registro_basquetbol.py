def obtener_datos_basquetbol():
    datos = {}
    datos["Nombre"] = input("Ingrese el nombre del participante: ").strip()
    datos["Edad"] = input("Ingrese la edad del participante: ").strip()
    datos["Posición"] = input("Ingrese la posición preferida del participante: ").strip()
    datos["Estatura"] = input("Ingrese la estatura del participante: ").strip()
    datos["Ciudad"] = input("Ingrese la ciudad del participante: ").strip()
    return datos

def registro_participante_basquetbol():
    print("\nRegistro de Participante en Básquetbol")
    datos = obtener_datos_basquetbol()
    
    print("\nDatos del Participante:")
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")
    print()
