def obtener_datos_ciclismo():
    datos = {}
    datos["Nombre"] = input("Ingrese el nombre del participante: ").strip()
    datos["Edad"] = input("Ingrese la edad del participante: ").strip()
    datos["Tipo de ciclismo"] = input("Ingrese el tipo de ciclismo del participante (Montaña, Ruta, Urbano): ").strip()
    datos["Ciudad"] = input("Ingrese la ciudad del participante: ").strip()
    datos["Marca de bicicleta"] = input("Ingrese la marca de bicicleta preferida del participante: ").strip()
    return datos

def registro_participante_ciclismo():
    print("\nRegistro de Participante en Ciclismo")
    datos = obtener_datos_ciclismo()
    
    print("\nDatos del Participante:")
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")
    print()